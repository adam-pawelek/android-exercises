package com.example.employeesapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.bumptech.glide.Glide
import kotlinx.android.synthetic.main.activity_help.*
import org.json.JSONObject

class EmployeeActivity : AppCompatActivity() {
    // EmployeeActivity's onCreate
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_employee)

        // get data from intent
        val bundle: Bundle? = intent.extras;
        if (bundle != null) {
            val employeeString = bundle!!.getString("employee")
            val employee = JSONObject(employeeString)
            val name = employee["firstName"]
            // modify here to display other employee's data too!
            Toast.makeText(this, "Name is $name", Toast.LENGTH_LONG).show()
            nameTextView.text = employee["firstName"].toString() + " " + employee["lastName"].toString()
            titleTextView.text = employee["title"].toString()
            emailTextView.text = employee["email"].toString()
            phonetextView.text = employee["phone"].toString()
            departmentTextView.text = employee["department"].toString()
            Glide.with(this).load(employee["image"].toString()).into(imageView);

        }
    }
}