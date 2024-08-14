package com.ozalp.kotlincoroutines

import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main() {

    runBlocking {
        launch {
            delay(2000)
            println("runblocking")
        }
    }
    // burdaki kodlar runBlocking bitmeden çalışmaz
}