package com.example.fifthapplication.fragments

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.example.fifthapplication.R
import com.fraggjkee.smsconfirmationview.SmsConfirmationView

class SmsFragment:Fragment(R.layout.fragment_sms) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val view: SmsConfirmationView = view.findViewById(R.id.sms_code_view)
        view.onChangeListener = SmsConfirmationView.OnChangeListener { code, isComplete ->

        }
    }
}