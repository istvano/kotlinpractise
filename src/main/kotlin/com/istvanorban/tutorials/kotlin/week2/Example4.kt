package com.istvanorban.tutorials.kotlin.week2

// Higher order functions
// https://kotlinlang.org/docs/reference/functions.html


//in fix notation is important


// https://kotlinlang.org/docs/reference/lambdas.html

// if the last param is a lambda, it can be passed outside
fun unless(condition: Boolean, block: () -> Unit){
    if (!condition) block()
}

fun main() {



    val sunday = false
    unless(sunday) {
        println("It is homework day")
    }
}
