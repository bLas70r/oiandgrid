package gridWebApp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.servlet.View;
import org.springframework.web.servlet.ViewResolver;


@SpringBootApplication
@ComponentScan("controllers")
public class OiandgridApplication extends SpringBootServletInitializer {
	@Autowired
	private ViewResolver viewResolver;
	@Autowired
	private View jsonTemplate;
	
	public static void main(String[] args) {
		SpringApplication.run(OiandgridApplication.class, args);
	}
}
