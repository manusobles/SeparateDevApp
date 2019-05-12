package com.example.app_ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.uikit.Person
import com.example.uikit.PersonView

class UiActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ui)

        findViewById<PersonView>(R.id.person_view1).apply {
            setData(Person(firstName = "Jack", lastName = "Bauer"))
        }
        findViewById<PersonView>(R.id.person_view2).apply {
            setData(Person(firstName = "Homer", lastName = "Simpson"))
        }
    }
}
