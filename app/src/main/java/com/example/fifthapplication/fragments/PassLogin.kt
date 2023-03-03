package com.example.fifthapplication.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.fifthapplication.R
import com.example.fifthapplication.databinding.InfoProfileBinding
import com.example.fifthapplication.databinding.LoginPassBinding

class PassLogin: Fragment(R.layout.login_pass) {

    private var _binding: LoginPassBinding? = null
    private val binding get() = _binding!!


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.toregister.setOnClickListener {
            findNavController().navigate(R.id.action_passLogin_to_registerFragment)
        }

    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = LoginPassBinding.inflate(inflater, container, false)
        val view = binding.root
        return view
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}