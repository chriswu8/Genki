package ca.bcit.androidproject_jameschriskris

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView


class LessonActivity : AppCompatActivity()
{
    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lesson)

        val recycler = findViewById<RecyclerView>(R.id.recyclerView_lesson)
        val imageList = arrayListOf<Int>()

        for (i in 0 until (intent.extras?.size() ?: 0))
        {
            intent?.getIntExtra(i.toString(), 0)?.let { imageList.add(it) }
        }

        recycler.adapter = LessonAdapter(imageList)
        recycler.layoutManager = LinearLayoutManager(this)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)
    }

    override fun onSupportNavigateUp(): Boolean
    {
        finish()
        return super.onSupportNavigateUp()
    }

}