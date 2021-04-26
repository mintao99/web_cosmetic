package web_cosmetic;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import web_cosmetic.repository.CategoryRepository;

@SpringBootApplication(scanBasePackages = {"web_cosmetic"})
public class Application {
	
	public static void main(String[] args) {
		//ConfigurableApplicationContext applicationContext = SpringApplication.run(Application.class, args);
		SpringApplication.run(Application.class, args);
		//CategoryRepository studentRepository = applicationContext.getBean(CategoryRepository.class);
	}

}
