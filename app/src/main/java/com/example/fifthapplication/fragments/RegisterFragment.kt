package com.example.fifthapplication.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.example.fifthapplication.R
import com.example.fifthapplication.databinding.InfoProfileBinding

class RegisterFragment : Fragment (R.layout.info_profile) {

    private var _binding: InfoProfileBinding? = null
    // This property is only valid between onCreateView and
// onDestroyView.
    private val binding get() = _binding!!

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.Setup.setOnClickListener {

            val name = binding.editn.text.toString()
            val phone = binding.edite.text.toString()
            val pass = binding.editp.text.toString()

        registerUser(name, phone, pass)

            binding.edite.text
        }

    }



    private fun registerUser(userName:String, phone:String, password:String) {
        Toast.makeText(requireContext(), "birbalo", Toast.LENGTH_SHORT).show()

    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = InfoProfileBinding.inflate(inflater, container, false)
        val view = binding.root
        return view
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}