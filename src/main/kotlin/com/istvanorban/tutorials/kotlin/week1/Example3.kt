package com.istvanorban.tutorials.kotlin.week1

// https://kotlinlang.org/docs/reference/control-flow.html
// in Kotlin if is an expression!
val a = 5
val b = 6
val max = if (a > b) a else b

// Pattern matching is powerful tool and should be used instead of if when possible
fun main() {
    val x = 22
    val validNumbers = 21..30
    when (x) {
        in 1..10 -> print("x is in the range")
        in validNumbers -> print("x is valid")
        !in 10..20 -> print("x is outside the range")
        else -> print("none of the above")
    }
}

fun hasPrefix(x: Any) = when(x) {
    is String -> x.startsWith("prefix")
    else -> false
}