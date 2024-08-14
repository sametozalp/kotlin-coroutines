package com.ozalp.kotlincoroutines

import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch

fun main() {

    GlobalScope.launch {
        repeat(100_000) {
            launch {
                println("android")
            }
        }
    }
}