package com.ozalp.kotlincoroutines

import kotlinx.coroutines.async
import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking

fun main() {

    runBlocking {

        /*
            launch {
                val downloadedName = downlaodName()
                println(downloadedName)
            }

            launch {
                val downloadedAge = downloadAge()
                println(downloadedAge)
            }

            println()
        */

        val downloadedName = async {
            downloadName()
        }

        val downloadedAge = async {
            downloadAge()
        }

        val username = downloadedName.await()
        val age = downloadedAge.await()

        println(username + " " + age)
    }

}

suspend fun downloadName(): String {
    delay(2000)
    val username = "samet"
    println("username donloaded")
    return username
}

suspend fun downloadAge(): Int {
    delay(4000)
    val age = 22
    println("age downloaded")
    return age
}