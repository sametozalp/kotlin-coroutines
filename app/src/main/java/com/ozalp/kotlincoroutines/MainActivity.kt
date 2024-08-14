package com.ozalp.kotlincoroutines

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import kotlinx.coroutines.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Light Weightness

        // GlobalScope tüm app içerisinde yapılacak kapsamda kullanılır.
        // runBlocking, bloklayarak scope oluşturur. İşlemleri bir yere kadar yapar. runBlocking gelirse onun işlemlerini bitirmesini bekler ve devam eder
        // CoroutineScope, normal scope.

        /*
        hatayı yakalar diğer launchların çökmeisni önler
                supervisorScope {

                }
        */
    }
}