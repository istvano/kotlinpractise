package com.istvanorban.tutorials.kotlin.week1

// Higher order functions
// https://kotlinlang.org/docs/reference/functions.html
// https://kotlinlang.org/docs/reference/lambdas.html

// if the last param is a lamba, it can be passed outside
fun unless(condition: Boolean, block: () -> Unit){
    if (!condition) block()
}


// check https://github.com/hemanth/functional-programming-jargon

// compoese https://github.com/MarioAriasC/funKTionale/wiki/Function-composition
// closure https://kotlinlang.org/docs/reference/lambdas.html
// partial application
// currying https://realjenius.com/2017/08/24/kotlin-curry/ and https://github.com/MarioAriasC/funKTionale/wiki/Currying
// supported via external lib https://arrow-kt.io/  ( merge from https://github.com/MarioAriasC/funKTionale/wiki)

fun main() {
    val sunday = false
    unless(sunday) {
        println("It is homework day")
    }
}
