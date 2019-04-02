package com.example.h.screen.home

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import com.example.h.R
import com.example.h.model.Book
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerview.layoutManager = LinearLayoutManager(this)
        recyclerview.hasFixedSize()
        val adapter =  BookAdapter(this, getLists())
        recyclerview.adapter = adapter

        adapter.submitList(getLists())

    }


    fun getLists(): ArrayList<Book> {
        var lists = ArrayList<Book>()
        lists.add(Book(1,"thanh",101))
        lists.add(Book(2,"thanh",102))
        lists.add(Book(3,"thanh",103))
        lists.add(Book(4,"thanh",104))
        lists.add(Book(5,"thanh",105))
        lists.add(Book(6,"thanh",106))
        return lists;
    }

}
