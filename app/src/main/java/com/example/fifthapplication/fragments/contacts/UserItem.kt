package com.example.fifthapplication.fragments.contacts

import android.view.View
import com.example.fifthapplication.R
import com.example.fifthapplication.databinding.ListItemBinding
import com.xwray.groupie.viewbinding.BindableItem


class UserItem( val userName: String, val userImage: Int, val description: String ) : BindableItem<ListItemBinding>() {

    override fun bind(viewBinding: ListItemBinding, position: Int) {

        viewBinding.description.text = description

        viewBinding.title.text = userName

        viewBinding.icon.setImageResource(userImage)

    }


    override fun getLayout() = R.layout.list_item
    override fun initializeViewBinding(view: View): ListItemBinding = ListItemBinding.bind(view)


}