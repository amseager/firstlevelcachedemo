package com.example.firstlevelcachedemo;

import com.example.firstlevelcachedemo.domain.DatabaseService;
import com.example.firstlevelcachedemo.domain.User;
import com.example.firstlevelcachedemo.domain.UserRepository;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@Slf4j
class FirstlevelcachedemoApplicationTests {

	@Autowired
	private DatabaseService databaseService;

	@BeforeAll
	static void init(@Autowired UserRepository userRepository) {
		userRepository.save(new User(1L, "Alex"));
	}

	@Test
	void testDefaultMethod() {
		databaseService.testDefaultMethod();
	}

	@Test
	void testCustomMethod() {
		databaseService.testCustomMethod();
	}
}
