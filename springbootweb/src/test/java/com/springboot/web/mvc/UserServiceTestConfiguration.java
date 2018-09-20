package com.springboot.web.mvc;

import org.mockito.Mockito;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;

import com.springboot.web.mvc.service.UserService;

@Profile("test")
@Configuration
public class UserServiceTestConfiguration {

	@Bean
    @Primary
    public UserService userService() {
		return Mockito.mock(UserService.class);
	}
}
