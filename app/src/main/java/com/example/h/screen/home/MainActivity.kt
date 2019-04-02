package com.example.h.screen.home

import android.databinding.DataBindingUtil
import android.databinding.ObservableField
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import com.example.h.databinding.ActivityMainBinding
import com.example.h.model.Book

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_main)
        var title: ObservableField<String> = ObservableField()
        var bindding: ActivityMainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        title.set("Phạm Quang thanh")
        bindding.main

        bindding.recyclerview.layoutManager = LinearLayoutManager(this)
        bindding.recyclerview.hasFixedSize()
        val adapter = BookAdapter(this, getLists())
        bindding.recyclerview.adapter = adapter

        adapter.submitList(getLists())

    }

    fun getLists(): ArrayList<Book> {
        var lists = ArrayList<Book>()
        lists.add(Book(1, "thanh", 101))
        lists.add(Book(2, "thanh", 102))
        lists.add(Book(3, "thanh", 103))
        lists.add(Book(4, "thanh", 104))
        lists.add(Book(5, "thanh", 105))
        lists.add(Book(6, "thanh", 106))
        return lists;
    }
}
