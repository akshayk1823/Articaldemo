package com.example.articalsdemo.repo

import com.example.articalsdemo.R
import com.example.articalsdemo.model.Artical

class ArticalRepository {
    fun getAllData() : List<Artical>{
        return listOf(
            Artical(
                id = 0,
                title = "Tomatoes: a red-hot solution for several health conditions”",
                ImageId = R.drawable.tomato

            ),
            Artical(
                id = 1,
                title = "Don't judge each day by the harvest you reap but by the seeds that you plant.”",
                ImageId = R.drawable.brain

            ),
            Artical(
                id = 2,
                title = "Don't judge each day by the harvest you reap but by the seeds that you plant.”",
                ImageId = R.drawable.tomato

            ),
            Artical(
                id = 3,
                title = "Don't judge each day by the harvest you reap but by the seeds that you plant.”",
                ImageId = R.drawable.tomato

            ),
            Artical(
                id = 4,
                title = "Don't judge each day by the harvest you reap but by the seeds that you plant.”",
                ImageId = R.drawable.tomato

            ),
            Artical(
                id = 5,
                title = "Don't judge each day by the harvest you reap but by the seeds that you plant.”",
                ImageId = R.drawable.tomato

            ),
            Artical(
                id = 6,
                title = "Don't judge each day by the harvest you reap but by the seeds that you plant.”",
                ImageId = R.drawable.tomato

            ),
        )

    }

}