package com.example.articalsdemo.ui.activity

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import com.example.articalsdemo.model.Artical
import com.example.articalsdemo.repo.ArticalRepository
import com.example.articalsdemo.ui.adapter.CustomArtical

class MainActivity :ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            val articalRepository = ArticalRepository()
            val getAllData = articalRepository.getAllData()
            LazyColumn(){
                items(items =getAllData){
                        Artical ->  CustomArtical(artical = Artical)
                }
            }
        }
    }
}


