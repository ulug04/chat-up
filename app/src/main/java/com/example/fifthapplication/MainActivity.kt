package com.example.fifthapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView
import android.widget.Toast
import com.example.fifthapplication.fragments.ItemList

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


            val language = arrayOf<String>("C","C++","Java")
            val description = arrayOf<String>(

                "TEST3 description",)

            val imageId = arrayOf<Int>(
                R.drawable.ic_launcher_background,R.drawable.ic_launcher_background,R.drawable.ic_launcher_background
            )
            override fun onCreate(savedInstanceState: Bundle?) {
                super.onCreate(savedInstanceState)
                setContentView(R.layout.activity_main)

                val listView = findViewById(R.id.listView) as ListView
                val ItemList = ItemList(this,language,description,imageId)
                listView.adapter = ItemList


                listView.setOnItemClickListener(){adapterView, view, position, id ->
                    val itemAtPos = adapterView.getItemAtPosition(position)
                    val itemIdAtPos = adapterView.getItemIdAtPosition(position)
                    Toast.makeText(this, "Click on item at $itemAtPos its item id $itemIdAtPos", Toast.LENGTH_LONG).show()
    }
}