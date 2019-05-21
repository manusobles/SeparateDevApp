package com.example.uikit

import android.content.Context
import android.util.AttributeSet
import android.util.Log
import android.view.LayoutInflater
import androidx.constraintlayout.widget.ConstraintLayout
import com.example.uikit.databinding.ViewPersonBinding

class PersonView @JvmOverloads constructor(
    context: Context?,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = 0
) : ConstraintLayout(context, attrs, defStyleAttr) {

    private val binding = ViewPersonBinding.inflate(LayoutInflater.from(context), this, true)

    fun setData(person: Person) {
        Log.d("XXX", "set data called PersonView")
        binding.person = person
    }
}