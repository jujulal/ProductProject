package my.product;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableAutoConfiguration
public class ProductProjectApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(ProductProjectApplication.class, args);
	}
}
