package com.javadevjournal.jpademo;

import com.javadevjournal.jpademo.entity.User;
import com.javadevjournal.jpademo.repositoty.UserRepository;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertNotNull;

@RunWith(SpringRunner.class)
@SpringBootTest
public class JpademoApplicationTests {

	@Autowired
	UserRepository userRepository;

	@Test
	public void contextLoads() {

        User user = userRepository.save(new User("Demo","User"));
        User searchUser= userRepository.findOne(user.getId());

        assertNotNull(searchUser);
        assertEquals(user.getFirstName(),searchUser.getFirstName());

	}

}
