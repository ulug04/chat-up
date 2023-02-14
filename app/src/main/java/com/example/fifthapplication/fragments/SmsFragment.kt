package com.example.fifthapplication.fragments

import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.fifthapplication.R
import com.fraggjkee.smsconfirmationview.SmsConfirmationView

class SmsFragment:Fragment(R.layout.fragment_sms) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val button = view.findViewById<Button>(R.id.idBtnSendMessage)

        button.setOnClickListener {
            findNavController().navigate(R.id.action_smsFragment_to_profileInfo)

            val view: SmsConfirmationView = view.findViewById(R.id.sms_code_view)
            view.onChangeListener = SmsConfirmationView.OnChangeListener { code, isComplete ->

            }
        }
    }
}