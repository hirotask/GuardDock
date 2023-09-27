package com.github.hirotask.spring.GuardDock

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class GuardDockApplication

fun main(args: Array<String>) {
	runApplication<GuardDockApplication>(*args)
}
