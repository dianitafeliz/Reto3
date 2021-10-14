package demoh2.demoh2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "demoh2.demoh2")

public class Demoh2Application {

	public static void main(String[] args) {
		SpringApplication.run(Demoh2Application.class, args);
	}

}
