package com.ozalp.kotlincoroutines

import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

fun main() {
    // coroutine scope
    CoroutineScope(Dispatchers.Default).launch {
        println("coroutine scope ")
    }
}