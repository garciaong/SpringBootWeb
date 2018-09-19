package com.springboot.web.mvc;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class Encoder {

	public static void main(String[] args) {
		BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
		String encoded = encoder.encode("123");
		System.out.println(encoded);
	}

}
