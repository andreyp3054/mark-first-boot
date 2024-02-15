package com.vladcodingmark.markfirstboot

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class MarkFirstBootApplication

fun main(args: Array<String>) {
	runApplication<MarkFirstBootApplication>(*args)
}
