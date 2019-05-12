package com.example.uikit

import android.content.Context
import android.util.AttributeSet
import android.util.Log
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout

class PersonView @JvmOverloads constructor(
    context: Context?,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = 0
) : ConstraintLayout(context, attrs, defStyleAttr) {

    init {
        inflate(context, R.layout.view_person, this)
    }

    private lateinit var firstNameView: TextView
    private lateinit var lastNameView: TextView

    override fun onFinishInflate() {
        super.onFinishInflate()
        firstNameView = findViewById(R.id.first_name_view)
        lastNameView = findViewById(R.id.last_name_view)
    }

    fun setData(myData: Person) {
        Log.d("XXX", "set data called PersonView")
        firstNameView.text = myData.firstName
        lastNameView.text = myData.lastName
    }
}