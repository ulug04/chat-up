package com.example.fifthapplication.fragments.contacts

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.fifthapplication.R
import com.example.fifthapplication.databinding.ContactFragmentBinding
import com.xwray.groupie.GroupieAdapter


class ContactsFragment: Fragment (R.layout.contact_fragment) {


    private var _binding: ContactFragmentBinding? = null
    private val binding get() = _binding!!


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val myAdapter = GroupieAdapter()

        binding.rv.adapter = myAdapter // recyclerView connected with brain (adapter)!



        val usersFromFirebase = listOf(
            UserItem( userName = "Ulug", userImage = R.drawable.icon, description = "developer"),
            UserItem(userName = "Otabek", userImage = R.drawable.wing, description = "doctor"),
            UserItem(userName = "Ulug", userImage = R.drawable.gmail, description = "smasher"),
            UserItem(userName = "Ulug", userImage = R.drawable.gmail, description = "smasher"),
            UserItem(userName = "Ulug", userImage = R.drawable.gmail, description = "smasher"),
        )


        myAdapter.addAll(usersFromFirebase)



    }









    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = ContactFragmentBinding.inflate(inflater, container, false)
        val view = binding.root
        return view
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}