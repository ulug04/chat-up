package com.example.fifthapplication.fragments.contacts

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.fifthapplication.R
import com.example.fifthapplication.databinding.ContactFragmentBinding
import com.google.firebase.database.ktx.database
import com.google.firebase.ktx.Firebase


class ContactsFragment: Fragment (R.layout.contact_fragment) {


    private var _binding: ContactFragmentBinding? = null
    private val binding get() = _binding!!

    private val database = Firebase.database.reference


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

//        val myAdapter = GroupieAdapter()
//
//        binding.rv.adapter = myAdapter // recyclerView connected with brain (adapter)!
//
//
//
//        val usersFromFirebase = listOf(
//            UserItem( userName = "Ulug", userImage = R.drawable.icon, description = "developer"),
//            UserItem(userName = "Otabek", userImage = R.drawable.wing, description = "doctor"),
//            UserItem(userName = "Ulug", userImage = R.drawable.gmail, description = "smasher"),
//            UserItem(userName = "Ulug", userImage = R.drawable.gmail, description = "smasher"),
//            UserItem(userName = "Ulug", userImage = R.drawable.gmail, description = "smasher"),
//        )
//        myAdapter.addAll(usersFromFirebase)



        val member1 = Members(id = 1, name = "Kenguru", legs = 2)
        val member2 = Members(id = 2, name = "Dog", legs = 4)
        val member3 = Members(id = 3, name = "Fish", legs = 0)



        writeNewUser(member1)
        writeNewUser(member2)
        writeNewUser(member3)

    }


     private fun writeNewUser(animal:Members) {

        database.child("chats").child("group1").setValue(animal.legs)


    }

    data class Members(
        val id: Int,
        val name: String,
        val legs: Int
    )





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