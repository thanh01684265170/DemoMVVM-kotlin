package com.example.h.screen.home

import android.content.Context
import android.databinding.DataBindingUtil
import android.support.v7.recyclerview.extensions.ListAdapter
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.h.databinding.ItemBinding
import com.example.h.model.Book
import kotlinx.android.synthetic.main.item.view.*

class BookAdapter(var c: Context, var lists: ArrayList<Book>) :
    ListAdapter<Book, BookAdapter.ViewHolder>(TaskDiffCallback()) {

    override fun onBindViewHolder(p0: ViewHolder, p1: Int) {
        p0.bindData(lists[p1])
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
//        val view: View = LayoutInflater.from(c).inflate(R.layout.item, parent, false)
        val itemBinding: ItemBinding = DataBindingUtil
            .inflate(LayoutInflater.from(c),R.layout.item, parent, false)
        return ViewHolder(itemBinding)
    }

    override fun submitList(list: MutableList<Book>?) {

        val listBook = ArrayList<Book>()
        if (listBook != null) {
            listBook.addAll(list ?: ArrayList<Book>())
        }
        super.submitList(listBook)

    }

    class ViewHolder(itemBinding: ItemBinding) : RecyclerView.ViewHolder(itemBinding) {

        fun bindData(book: Book) {
            itemView.text_name.text = book.ten
            itemView.text_gia.text = book.gia.toString()
        }
    }
}