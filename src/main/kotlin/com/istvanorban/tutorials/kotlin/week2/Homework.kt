package com.istvanorban.tutorials.kotlin.week2

inline infix fun Int.dividableBy(divisor: Int) = this % divisor == 0

val toFizzBuzz : (Int) -> (String) = fun(x) = when {
    x dividableBy 15 -> "FizzBuzz"
    x dividableBy 3 -> "Fizz"
    x dividableBy 5 -> "Buzz"
    else -> x.toString()
};

fun main() {
    (1 .. 100).map(toFizzBuzz).forEach(::println);
}