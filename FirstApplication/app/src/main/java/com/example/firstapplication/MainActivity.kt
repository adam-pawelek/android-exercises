package com.example.firstapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    // View class need to be used in parameter, even it is not used

    var numberClicked321 = 0
    fun buttonClicked(view: View) {
        // activity_main layout has textView id in TextView element

        val strHelp: String  = getString( R.string.button_clicked_txt)
        numberClicked321+=1

         var str4 = strHelp + numberClicked321.toString()
        textView.setText(str4)
    }


}




