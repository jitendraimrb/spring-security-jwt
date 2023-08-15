package com.learn.json;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.learn.json.entity.User;
import com.learn.json.repository.UserRepository;


@SpringBootApplication
public class SpringbootJwtApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootJwtApplication.class, args);
	}
	
	@Autowired
	UserRepository userRepository;
	
	@PostConstruct
	public void initUser() {
		
		List<User> users = Stream.of(
				new User(101, "jitendra", "jitendra", "jitendra@gmail.com"),
				new User(101, "mohit", "mohit", "mohit@gmail.com"),
				new User(101, "balaji", "balaji", "balaji@gmail.com"),
				new User(101, "ravi", "ravi", "ravi@gmail.com")).collect(Collectors.toList());
	
		userRepository.saveAll(users);
	}
	

}
