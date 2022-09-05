package com.example.avoidmemoryleak

import android.content.Context
import android.content.Intent
import android.os.AsyncTask
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {

    private lateinit var asyncTask: MyAsyncTask

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<Button>(R.id.go).setOnClickListener {

        }

//        Intent(this,SecondActivity::class.java).also {
//            startActivity(it)
//        }
    }

//    companion object{
//        lateinit var context: Context
//    }

    private class MyAsyncTask: AsyncTask<Void, Void, Void>() {
        override fun doInBackground(vararg params: Void?): Void {
            TODO("Not yet implemented")
        }

    }
}