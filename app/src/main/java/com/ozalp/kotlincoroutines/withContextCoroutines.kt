package com.ozalp.kotlincoroutines

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
import kotlinx.coroutines.withContext

fun main() {

    // Threadleri değiştirebiliriz.

    runBlocking {

        launch(Dispatchers.Default) {

            println("Context: " + coroutineContext)

            withContext(Dispatchers.IO) {
                println("Context: " + coroutineContext)
            }
        }
    }
}