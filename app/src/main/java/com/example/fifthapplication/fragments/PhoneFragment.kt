package com.example.fifthapplication.fragments

import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.fifthapplication.R

class PhoneFragment:Fragment(R.layout.activity_verification) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val button = view.findViewById<Button>(R.id.continueBtn)

        button.setOnClickListener {
            findNavController().navigate(R.id.action_phoneFragment_to_smsFragment)
        }

    }
}