package com.example.sumcalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    var outcome = 0 ;
    var number = 0;
    var operation = ""
    val  num  = mutableListOf<String>()

    var  numbers = mutableListOf<Int>()

    fun buttonClicked(view: View) {
        // activity_main layout has textView id in TextView element
        textView.setText("sdfasd")
    }

    fun numberInput(view: View) {
        // view is a button (pressed one) get text and convert to Int
        val digit = (view as Button).text.toString().toInt()
        operation += digit.toString()
        number = number * 10 + digit
        textView.setText(operation)
    }

    fun add(view: View){
        operation += "+"
        num.add(number.toString())
        num.add("+")
        number = 0
        textView.setText(operation)
    }

    fun subtraction(view: View){
        operation += "-"
        num.add(number.toString())
        num.add("-")
        number = 0
        textView.setText(operation)
    }

    fun divide(view: View){
        operation += "/"
        num.add(number.toString())
        num.add("/")
        number = 0
        textView.setText(operation)
    }
    fun multiply(view: View){
        operation += "*"
        num.add(number.toString())
        num.add("*")
        number = 0
        textView.setText(operation)
    }


    fun dispaly(view: View){

        num.add(number.toString())

        var wass = true

        val  actions  = mutableListOf<String>("/","*","+","-")
        for (j in actions) {
            wass = true
            while (wass) {
                wass = false
                for (i in 0 until num.size) {
                    if (num[i] == j) {
                        wass = true
                        var helpp = 0
                        when(j){
                            actions[0] -> helpp = num[i - 1].toInt() / num[i + 1].toInt()
                            actions[1] -> helpp = num[i - 1].toInt() * num[i + 1].toInt()
                            actions[2] -> helpp = num[i - 1].toInt() + num[i + 1].toInt()
                            actions[3] -> helpp = num[i - 1].toInt() - num[i + 1].toInt()
                            else ->{
                                print ("mistake")
                            }
                        }
                        num[i - 1] = helpp.toString()
                        num.removeAt(i)
                        num.removeAt(i)

                        break
                    }
                }
            }
        }





        operation += "="
        operation += num[0]
        textView.setText(operation)
    }

    fun clearAll(view: View){
        operation = ""
        number = 0
        textView.setText(operation)
        num.clear()
    }
}