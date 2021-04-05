package com.example.jap.bookmanager.repository;

import com.example.jap.bookmanager.domain.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class UserRepositoryTest {

    @Autowired
    private UserRepository userRepository;

    @Test
    void crud() {
        userRepository.save(new User());//NoArgsConstructor를 이용해서 user를 생성하고 저장


        userRepository.findAll().forEach(System.out::println);

        /*for (User user : userRepository.findAll()) {
            System.out.println(user);
        } == userRepository.findAll().forEach(System.out::println);
        */
    }
}