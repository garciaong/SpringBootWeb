package com.springboot.web.mvc;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

@Configuration
@EnableWebSecurity
@ComponentScan(basePackages = "com.springboot")
public class SpringBootSecurityConfig extends WebSecurityConfigurerAdapter{
    
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.csrf().disable()
				.authorizeRequests()
        		.antMatchers("/", "/error").permitAll()
        		.anyRequest().authenticated()
				.and()
				.formLogin()
                .loginPage("/login")
                .permitAll()
                .and()
                .logout()
                .permitAll();
	}
	
	@Bean
    @Override
    public UserDetailsService userDetailsService() {
        UserDetails user =
             User.withDefaultPasswordEncoder()
                .username("a")
                .password("1")
                .roles("USER")
                .build();

        return new InMemoryUserDetailsManager(user);
    }

}
