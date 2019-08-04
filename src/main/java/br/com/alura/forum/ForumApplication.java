package br.com.alura.forum;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.data.web.config.EnableSpringDataWebSupport;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@SpringBootApplication
@EnableSpringDataWebSupport
@EnableCaching
public class ForumApplication {

	public static void main(String[] args) {

		BCryptPasswordEncoder cryptPasswordEncoder = new BCryptPasswordEncoder();
		System.out.println(cryptPasswordEncoder.encode("123456"));


		SpringApplication.run(ForumApplication.class, args);
	}

}
