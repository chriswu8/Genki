package ca.bcit.androidproject_jameschriskris

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView


class MainActivity : AppCompatActivity()
{
    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val languageList = arrayListOf<Pair<String, Int>>()
        languageList.add(Pair("Chinese", R.drawable.icon_china))
        languageList.add(Pair("Danish", R.drawable.icon_denmark))
        languageList.add(Pair("Dutch", R.drawable.icon_netherlands))
        languageList.add(Pair("French", R.drawable.icon_france))
        languageList.add(Pair("German", R.drawable.icon_germany))
        languageList.add(Pair("Italian", R.drawable.icon_italy))
        languageList.add(Pair("Japanese", R.drawable.icon_japan))
        languageList.add(Pair("Norwegian", R.drawable.icon_norway))
        languageList.add(Pair("Korean", R.drawable.icon_korea))


        val adapter = LanguageAdapter(languageList, this)
        adapter.setOnItemClickListener(object : LanguageAdapter.OnItemClickListener {
            override fun onItemClick() {
                val intent = Intent(this@MainActivity, LanguageActivity::class.java)
                startActivity(intent)
            }
        })
        val recycler = findViewById<RecyclerView>(R.id.recyclerView_languages)
        recycler.adapter = adapter
        recycler.layoutManager = LinearLayoutManager(this)


    }
}