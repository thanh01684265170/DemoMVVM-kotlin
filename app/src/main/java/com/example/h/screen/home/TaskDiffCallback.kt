package com.example.h.screen.home

import android.support.v7.util.DiffUtil
import com.example.h.model.Book

class TaskDiffCallback : DiffUtil.ItemCallback<Book>() {
    override fun areItemsTheSame(p0: Book, p1: Book): Boolean {
        return p0?.id == p1?.id
    }

    override fun areContentsTheSame(p0: Book, p1: Book): Boolean {
        return p0 == p1
    }
}