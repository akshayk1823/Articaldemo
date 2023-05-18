package com.example.articalsdemo.ui.activity

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.KeyboardArrowLeft
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
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


            TopAppBar(
                title = {
                    Text( modifier = Modifier.fillMaxWidth(),
                        textAlign = TextAlign.Start,text = "Articles")

                },
                navigationIcon = {
                    IconButton(onClick = {}) {
                        Icon(Icons.Filled.KeyboardArrowLeft, "backIcon")
                    }
                },
                backgroundColor = Color.White,
                contentColor = Color.Black
            )


        }
    }
}


