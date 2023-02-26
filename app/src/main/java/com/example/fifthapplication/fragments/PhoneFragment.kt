package com.example.fifthapplication.fragments

import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.fifthapplication.R
import com.google.android.gms.auth.api.phone.SmsRetriever
import com.google.android.gms.tasks.OnFailureListener
import com.google.android.gms.tasks.OnSuccessListener


class PhoneFragment:Fragment(R.layout.activity_verification) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val button = view.findViewById<Button>(R.id.continueBtn)
        button.setOnClickListener {
            findNavController().navigate(R.id.action_phoneFragment_to_smsFragment)
        }


        val client = SmsRetriever.getClient(requireActivity() /* context */)


        val task  = client.startSmsRetriever()


        task.addOnSuccessListener {
            // Successfully started retriever, expect broadcast intent

        }

        task.addOnFailureListener {
            // Failed to start retriever, inspect Exception for more details

        }


    }
}