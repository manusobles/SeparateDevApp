package com.example.app_ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.example.app_ui.databinding.ActivityUiBinding
import com.example.uikit.Person

class UiActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        DataBindingUtil.setContentView<ActivityUiBinding>(this, R.layout.activity_ui).apply {
            data1 = Person(firstName = "Jack", lastName = "Bauer")
            data2 = Person(firstName = "Homer", lastName = "Simpson")
        }
    }
}
