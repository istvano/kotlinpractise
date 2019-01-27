package com.istvanorban.tutorials.kotlin.week1

// functions are first class citizens
// see https://developer.mozilla.org/en-US/docs/Glossary/First-class_Function

// https://kotlinlang.org/docs/reference/functions.html

// we can define them ANYWHERE we can define a variable
fun simpleFunction() {
    System.out.println("Simple function")
}

fun functionInFunction() {
    fun insideFunction() {
        System.out.println("functionInFunction - inside")
    }
    System.out.println("functionInFunction - main")
    insideFunction()
}

//function type
val capitalize: (String) -> (String) = { it.capitalize() }
//function programming
val capitalizeOther = String::capitalize

fun main() {
    simpleFunction()
    functionInFunction()
    println(capitalize("Hello World"))
    println(capitalizeOther("Hello World Two"))
}