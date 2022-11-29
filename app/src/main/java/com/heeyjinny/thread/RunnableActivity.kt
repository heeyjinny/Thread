package com.heeyjinny.thread

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class RunnableActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_runnable)

        //2
        //Runnable인터페이스를 구현한 클래스를 이용하여
        //스레드 생성하고 로직 처리
        //2-1
        //Thread클래스의 생성자로 Runnable인터페이스를 구현한 클래스 전달하여 변수에 저장
        var thread = Thread(WorkerRunnable())
        //2-2
        //Thread클래스의 start()메서드 호출해 스레드 생성
        thread.start()

        //3
        //Runnable인터페이스를 이용한 스레드는 람다식 변환 가능
        //인터페이스 내부에 메서드가 하나만 있는 경우 변환 가능
        //(아래 따로 클래스를 만들어 인터페이스를 구현하지 및 변수 생성 없이 스래드를 생성할 수 있음)
        Thread{
            var i = 0
            while (i < 10){
                i += 1
                Log.i("LambdaThread", "$i")
            }
        }.start()

    }
}

//1
//Runnable인터페이스 구현하여 스레드 생성
//상속 관계에 있는 클래스도 구현할 수 있음
//Runnable인터페이스를 구현하여 WorkerThread클래스 정의
class WorkerRunnable: Runnable{

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