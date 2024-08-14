package com.ozalp.kotlincoroutines

import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking

fun main() {

    // Suspend fonksiyonlar, içerisinde coroutines çalıştırılabilen fonksiyonlardır.

    runBlocking {
        delay(2000)
        myFunction()
    }

}

suspend fun myFunction() {
    coroutineScope {
        delay(4000)
        println("suspend function")
    }
}