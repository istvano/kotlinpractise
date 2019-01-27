package com.istvanorban.tutorials.kotlin.week1

//defining functions

val helloworld: (Int) -> String = { "Hello World!" }

fun main() {
    val n = 20
    // 1. ordinary. please note "it" is a syntactic sugar in Kotlin
    1.rangeTo(n).map { helloworld(it) }.forEach { System.out.println(it) }
    // 2. point free
    (1..n).map(helloworld).forEach(System.out::println)
}