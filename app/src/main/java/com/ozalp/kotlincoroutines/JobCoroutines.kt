package com.ozalp.kotlincoroutines

import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main() {

    // job

    runBlocking {

        val myJob = launch {
            delay(2000)
            println("job")
        }

        myJob.invokeOnCompletion {
            println("my job end")
        }

        myJob.cancel() // aktif işi siler içerisinde iş varsa
    }
}