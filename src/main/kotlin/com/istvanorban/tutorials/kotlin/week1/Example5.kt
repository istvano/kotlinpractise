package com.istvanorban.tutorials.kotlin.week1

import kotlin.system.measureNanoTime

// Recursive functions

// imperative version declaring the steps we need to get the job done
fun factorialImperative(n: Long): Long {
    var result = 1L
    for (i in 1..n) {
        result *= i
    }
    return result
}

fun functionalFactorialWithIf(n: Long): Long {
    fun go(n: Long, acc: Long): Long = if (n <= 0)  acc  else  go(n - 1, n * acc)
    return go(n, 1)
}

// recursive way to implement
fun functionalFactorialWithIfOpt(n: Long): Long {
    tailrec fun go(n: Long, acc: Long): Long = if (n <= 0)  acc  else  go(n - 1, n * acc)
    return go(n, 1)
}

fun functionalFactorialPattern(n: Long): Long {
    fun go(n: Long, acc: Long): Long = when {
        n <= 0 -> acc
        else -> go(n - 1, n * acc)
    }
    return go(n, 1)
}

// recursive way to implement
fun functionalFactorialPatternOpt(n: Long): Long {
    tailrec fun go(n: Long, acc: Long): Long = when {
        n <= 0 -> acc
        else -> go(n - 1, n * acc)
    }
    return go(n, 1)
}

fun main() {
    val time1 = measureNanoTime {
        println(factorialImperative(10))
    }
    println("Imperative $time1")

    val time2 = measureNanoTime {
        println(functionalFactorialWithIf(10))
    }
    println("recursive with If $time2")

    val time3 = measureNanoTime {
        println(functionalFactorialWithIfOpt(10))
    }
    println("recursive with if opt $time3")

    val time4 = measureNanoTime {
        println(functionalFactorialPattern(10))
    }
    println("recursive with pattern match $time4")

    val time5 = measureNanoTime {
        println(functionalFactorialPatternOpt(10))
    }
    println("recursive with pattern match opt $time5")
}
