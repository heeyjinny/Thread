package com.heeyjinny.thread

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlin.concurrent.thread

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //코틀린에서 제공하는 thread()구현
        //파라미터로 start=true를 전달하여 백그라운드 사용
        thread(start = true) {
            var i = 0
            while (i < 10){
                i += 1
                Log.i("KotlinThread", "$i")
            }
        }

    }
}

