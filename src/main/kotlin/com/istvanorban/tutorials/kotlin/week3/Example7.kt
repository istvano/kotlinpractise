package com.istvanorban.tutorials.kotlin.week3

// check https://github.com/hemanth/functional-programming-jargon

fun square(n: Int) = n * n
fun triple(n: Int) = 3 * n

fun compose(f: (Int) -> Int, g: (Int) -> Int): (Int) -> Int = { f(g(it)) }

// supported via external lib https://arrow-kt.io/  ( merge from https://github.com/MarioAriasC/funKTionale/wiki)

fun main() {

    // function application
    println(square(triple(2)))

    // Functional composition https://github.com/MarioAriasC/funKTionale/wiki/Function-composition

    val squareOfTriple = compose(::square, ::triple);
    println(squareOfTriple(2))

    // closure https://kotlinlang.org/docs/reference/lambdas.html and Currying
    // currying https://realjenius.com/2017/08/24/kotlin-curry/ and https://github.com/MarioAriasC/funKTionale/wiki/Currying

    val addTo : (Int) -> ((Int) -> (Int)) = {x -> { y -> x + y }}

    val addFive = addTo(5)

    System.out.println(addFive(3))

}
