package com.example.demo

import org.springframework.stereotype.Component

@Component
class HelloService {
    fun hello(): String = "Hello, GraphQL!"
}

