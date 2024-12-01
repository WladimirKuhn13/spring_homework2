package com.example.spring_homework2;

import org.springframework.stereotype.Service;

@Service
public class HelloService {

    public String getGreeting() {
        return "Привет пользователь!";
    }
}
