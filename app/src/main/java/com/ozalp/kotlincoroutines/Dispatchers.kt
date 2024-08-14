package com.ozalp.kotlincoroutines

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main() {

    // Dispatchers
    // hangi threadlerde çağırabileceğimizi söyleyebiliyoruz.
    // Dispatchers.Default: CPU Intensive. Çok yoğun işlerde kullanılır. (işlemci)
    // Dispatchers.IO: Network işlemleri, Input / Output
    // Dispatchers.Main: UI
    // Dispatchers.Unconfined: Inherited dispatcer. Çalıştırıldığı yeri miras alır

    runBlocking {
        launch(Dispatchers.Main) {
            println("Main Thread: " + Thread.currentThread().name)
        }

        launch(Dispatchers.IO) {
            println("IO Thread: " + Thread.currentThread().name)
        }

        launch(Dispatchers.Default) {
            println("Default Thread: " + Thread.currentThread().name)
        }

        launch(Dispatchers.Unconfined) {
            println("Unconfined Thread: " + Thread.currentThread().name)
        }
    }

}