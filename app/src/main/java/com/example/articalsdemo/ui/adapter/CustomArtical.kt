package com.example.articalsdemo.ui.adapter

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.scale
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.articalsdemo.R
import com.example.articalsdemo.model.Artical

@Composable
fun CustomArtical(artical: Artical){

    Column() {
        Image  (
            painter = painterResource(artical.ImageId),
            modifier = Modifier
                .fillMaxWidth()
                .height(267.dp),
            contentScale = ContentScale.FillBounds,
            contentDescription = ""


        )
        Text(artical.title,
            Modifier
                .background(Color.White)
                .fillMaxWidth()
                .padding(vertical = 20.dp),
                textAlign = TextAlign.Start)
    }

}

@Composable
@Preview
fun CustomItemPreview() {
    CustomArtical(
        artical = Artical(
            id = 0,
            ImageId = R.drawable.tomato,
            title = "Tomatoes: a red-hot solution for several health conditions"

        )
    )
}
