package com.example.firstlevelcachedemo.domain;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
@Slf4j
public class DatabaseService {

	private final UserRepository userRepository;

	@Transactional
	public void testDefaultMethod() {
		log.info("Start to call default findById");
		userRepository.findById(1L);
		userRepository.findById(1L);
		userRepository.findById(1L);
		log.info("End to call default findById");
	}

	@Transactional
	public void testCustomMethod() {
		log.info("Start to call custom findUserById");
		userRepository.findUserById(1L);
		userRepository.findUserById(1L);
		userRepository.findUserById(1L);
		log.info("End to call custom findUserById");
	}
}
