package com.vladcodingmark.markfirstboot

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import org.yaml.snakeyaml.error.Mark

@RestController
@RequestMapping("/accounts")            // this makes the url "localhost:8080/accounts/hello"
class HelloController {

    data class ViewAccount(val id: Int, val name: String)
    data class CreateAccount(val name: String)
//    @GetMapping("/hello")               //Without the @RequestMapping and only @GetMapping url is "localhost:8080/hello"
//    fun hello(): String = "Welcome, Mark!"

    @GetMapping("/")
    fun getAll(): Iterable<ViewAccount> = listOf(ViewAccount(id = 1, name = "Mark"))

    @PostMapping("/")
    fun create(@RequestBody request: CreateAccount): ViewAccount = ViewAccount(id = 2, name = request.name)
}