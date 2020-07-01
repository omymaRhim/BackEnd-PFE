/* package Api.Rest.Controlleur;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import Api.Rest.Helper.ExcelHelper;
import Api.Rest.Service.Wsservice;
import springfox.documentation.service.ResponseMessage;
import Api.Rest.Entity.Ws;




 @RestController
public class Wscontrolleur {
	
		@Autowired
		private Wsservice wservice;
		
		
		  @PostMapping("/upload")
		  public ResponseEntity<ResponseMessage>uploadFile(@RequestParam("file") MultipartFile file) {
		    String message = "";

		    if (ExcelHelper.hasExcelFormat(file)) {
		      try {
		        wservice.save(file);

		        message = "Uploaded the file successfully: " + file.getOriginalFilename();
		        return ResponseEntity.status(HttpStatus.OK).body(null);
		      } catch (Exception e) {
		        message = "Could not upload the file: " + file.getOriginalFilename() + "!";
		        return ResponseEntity.status(HttpStatus.EXPECTATION_FAILED).body(null);
		      }
		    }
		    return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(null);
		  }
		  
		  @PostMapping("/upload/{ws}")
			public void getws(@PathVariable String ws) {
			    wservice.getWs(ws);
			}
		  
		  @GetMapping("/websservice")
		  public ResponseEntity<List<Ws>> getAllWs() {
		    try {
		      List<Ws> webservices = wservice.getAllWs();

		      if (webservices.isEmpty()) {
		        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		      }

		      return new ResponseEntity<>(webservices, HttpStatus.OK);
		    } catch (Exception e) {
		      return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		    }
		  }
}*/

