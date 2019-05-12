package com.example.separatedevapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.uikit.Person
import com.example.uikit.PersonView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<PersonView>(R.id.person_view).apply {
            setData(Person(firstName = "John", lastName = "Smith"))
        }
    }
}
