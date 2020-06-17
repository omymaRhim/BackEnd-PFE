package Api.Rest.App;



import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;



@SpringBootApplication
@EnableAutoConfiguration
@EnableMongoRepositories({"Api.Rest.Dao"})
@ComponentScan(basePackages= {"Api.Rest.Controlleur","Api.Rest.Service","Api.Rest.Security"})


public class ApplicationRest extends SpringBootServletInitializer {
	public static void main(String[]args) {
		SpringApplication.run(ApplicationRest.class, args);
	}

	 @Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		// TODO Auto-generated method stub
		return builder.sources(ApplicationRest.class);
	}
	 
	 
	  

}
