package com.example.demo

import com.expediagroup.graphql.server.operations.Query
import org.springframework.stereotype.Component

@Component
class QueryResolver(private val helloService: HelloService) : Query {
    fun hello(): String = helloService.hello()
}

