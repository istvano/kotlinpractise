package com.istvanorban.tutorials.kotlin.week3


fun main() {
    //lambda
    val lambda1 = {"Test"}
    println(lambda1())
    println(lambda1.invoke())

    //lambda with parameters
    val lambda2 = {s:String -> s}
    println(lambda2("First param"))
    println(lambda2.invoke("First param with invoke"))

    //higher order function as param
    fun higherOrderFun( s: String, f:(String) -> Int): Int {
        return f(s)
    }

    println(higherOrderFun("Test", String::length))

    //an example where this is very powerful. Let's suppose we had to do fibanocci sequence

    fun fibonacciImp(n:Int): Collection<Int> {
        val res = mutableListOf(0,1)
        for (i in 2..n-1) {
            res.add(res.get(i-2)+res.get(i-1))
        }
        return res
    }

    println(fibonacciImp(10))

    //functional implementation with only immutable and lambda
    fun fibonacci(): Sequence<Int> {
        return generateSequence(Pair(0, 1), { Pair(it.second, it.first + it.second) }).map { it.first }
    }

    println(fibonacci().take(10).toList())

    //an example of lazy evaluation in functional programming
    val seq = generateSequence(0, {it.inc()})
    seq.take(20).forEach { print(" $it ") }
    println("")

    //assign functions to a lambda
    fun combineLength(s1: String, s2: String): Int = s1.length + s2.length
    val lambdaFunc = ::combineLength

    println(lambdaFunc("hello", "world"))

    //this is why ::println and ::print are in the scope
}
