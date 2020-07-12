package Api.Rest.Controlleur;

import javax.validation.Valid;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import Api.Rest.Dao.RoleDao;
import Api.Rest.Dao.userDao;
import Api.Rest.Entity.Erole;
import Api.Rest.Entity.Role;
import Api.Rest.Entity.user;
import Api.Rest.Security.JwtUtils;
import Api.Rest.Service.Implt.UserDetailsImpl;
import ApiRest.Request.LoginRequest;
import ApiRest.Request.SignupRequest;
import Response.JwtResponse;
import Response.MessageResponse;






@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api/auth")
public class AuthController {
	@Autowired
	 AuthenticationManager authenticationManager;

	@Autowired
	userDao userDao ;

	@Autowired
	RoleDao roleDao;

	@Autowired
	PasswordEncoder encoder;

	@Autowired
	JwtUtils jwtUtils;

	@PostMapping("/signin")
	public ResponseEntity<?> authenticateUser(@Valid @RequestBody LoginRequest  loginRequest) {

		Authentication authentication = authenticationManager.authenticate(
				new UsernamePasswordAuthenticationToken(loginRequest.getUsername(), loginRequest.getPassword()));

		SecurityContextHolder.getContext().setAuthentication(authentication);
		String jwt = jwtUtils.generateJwtToken(authentication);
		
		UserDetailsImpl userDetails = (UserDetailsImpl) authentication.getPrincipal();		
		List<String> roles = userDetails.getAuthorities().stream()
				.map(item -> item.getAuthority())
				.collect(Collectors.toList());

		return ResponseEntity.ok(new JwtResponse(jwt, 
												 userDetails.getId(), 
												 userDetails.getUsername(), 
												 userDetails.getEmail(), 
												 roles));
	}

	@PostMapping("/signup")
	public ResponseEntity<?> registerUser(@Valid @RequestBody SignupRequest signUpRequest) {
		if (userDao.existsByUsername(signUpRequest.getUsername())) {
			return ResponseEntity
					.badRequest()
					.body(new MessageResponse("Erreur: le nom d'utilisateur est déjà pris!"));
		}

		if (userDao.existsByEmail(signUpRequest.getEmail())) {
			return ResponseEntity
					.badRequest()
					.body(new MessageResponse("Erreur: Email est déjà pris"));
		}

		// Create new user's account
		user user = new user(signUpRequest.getUsername(), 
				 signUpRequest.getEmail(),
				 encoder.encode(signUpRequest.getPassword()));

		Set<String> strRoles = signUpRequest.getRoles();
		Set<Role> roles = new HashSet<>();

		if (strRoles == null) {
			Role userRole = roleDao.findByName(Erole.roleUser)
					.orElseThrow(() -> new RuntimeException(" Erreur: le rôle est introuvable."));
			roles.add(userRole);
		} else {
			strRoles.forEach(role -> {
				switch (role) {
				case "admin":
					Role adminRole = roleDao.findByName(Erole.roleAdmin)
							.orElseThrow(() -> new RuntimeException("  Erreur: le rôle est introuvable."));
					roles.add(adminRole);

					break;
				default:
					Role userRole = roleDao.findByName(Erole.roleUser)
							.orElseThrow(() -> new RuntimeException(" Erreur: le rôle est introuvable."));
					roles.add(userRole);
				}
			});
		}

		user.setRoles(roles);
		userDao.save(user);

		return ResponseEntity.ok(new MessageResponse("L' utilisateur est enregistré avec succès!"));
	}
}

