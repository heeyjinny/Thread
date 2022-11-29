package com.heeyjinny.thread

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class ThreadActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_thread)

        //2
        //변수 threas를 선언하여 WorkerThread객체를 생성해 별도의 스레드 생성
        var thread = WorkerThread()
        //2-1
        //start()메서드를 호출하여 run()메서드에 정의된 로직을 생성된 스레드가 처리함
        thread.start()

    }
}

//1
//Thread클래스를 상속받아 스레드 생성
//Thread클래스를 상속받아 WorkerThread클래스 정의
class WorkerThread: Thread(){

    //1-1
    //run()메서드를 오버라이드 하여 스레드가 처리할 로직 정의
    //run()메서드의 실행이 끝나면 스레드는 종료됨
    override fun run(){
        //1-2
        //변수 i의 값이 10이 될 때까지 반복하고
        //로그캣 창에 출력하는 코드 작성
        var i = 0
        while (i < 10){
            i += 1
            Log.i("Thread","$i")
        }
    }

}