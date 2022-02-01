package com.example.demo

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class DemoApplication {
	@Bean
	fun runStuff() {
		MyCoolClass().writeText()
	}
}

fun main(args: Array<String>) {
	runApplication<DemoApplication>(*args)
}
