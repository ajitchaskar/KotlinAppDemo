package com.example.kotlinappdemo

import android.os.Bundle
import android.util.Log
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.snackbar.Snackbar
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.content_main.*

//  REPL   --    Read, Eval, Print, Loop

class MainActivity : AppCompatActivity()
{
    private var submit: Button? = null;
    var fno: EditText? = null;
    var sno: EditText? = null;


    fun whenDemo()
    {
        val x = 2

        when (x) {
            1 -> println("X is 1")

            2 -> println("X is 2")

            else -> println("X is Unknown")
        }
        Log.d("Value Of X is ", "" + x);
    }

    fun forLoopDemo() {
        for (i in 1..1000) {
            if(i%2==0)
            {
                Log.d("Even No is ", "" + i);
            }
            else {
                Log.d("Odd No is ", "" + i);
            }
        }
    }

    fun doWhileDemo()
    {
        var m:Int=1
        do{
            if(m%2==0)
            {
                Log.d("do while loop  ", "" + m);
            }
            m++
        }while (m<=10)
    }


    fun whileLoopDemo()
    {
        var i:Int = 1
        while (i<=10)
        {
            if(i%2==0) {
                Log.d("while loop ", ""+i)
            }
            i++;
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(toolbar)

        /*ifElseDemo()
        forLoopDemo()
        whenDemo()
        whileLoopDemo()
        doWhileDemo()
        sampleDemo()*/
        stringappend()
        incotoperation()

//        initializedView()

        btn_add!!.setOnClickListener { v: View? ->


            var budle: Bundle = Bundle()

//            fno!!.text.toString()
//            Log.d("MainActivity","FNo" + fno!!.text.toString())
        }

        //ajit()

        fab.setOnClickListener { view ->

            Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                .setAction("Action", null).show()
        }
    }

    private fun incotoperation() {
        var num1: Int = 5
        var num2: Int = 20

        Log.d("3rd Index:", "${num1 + num2}")

    }

    private fun stringappend() {
        var str1: String = "hello"
        var str2: String = "Java"
        Log.d("append","$str1 $str2")
        str1 = "Java"
        str2 = "Hello"

        Log.d("append","$str1 $str2")
    }

    private fun sampleDemo() {
        val ajit=10
        val satish=20
        Log.d("sum of","sum of $ajit and $satish is "+(ajit+satish))
    }

    private fun ifElseDemo() {
        var age:Int=10

        if(age>18)
        {
            Log.d("Eligible for Voting",""+age)
        }
        else{
            Log.d("Not Eligible Voting ",""+age)
        }
    }

//    private fun initializedView() {
//        submit=findViewById(R.id.btn_add)
//    }


    fun ajit() {
        val x: Int = 5
        when (x) {
            1, 4 -> {
                print(" Value is less")
                Log.d("x is ", "" + x)
            }

            else -> { // Note the block
                print("x is greater")
                Log.d("x is ", "" + x)
            }
        }
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        // Inflate the menu; this adds items to the action bar if it is present.
        menuInflater.inflate(R.menu.menu_main, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        return when (item.itemId) {
            R.id.action_settings -> true
            else -> super.onOptionsItemSelected(item)
        }
    }
}
