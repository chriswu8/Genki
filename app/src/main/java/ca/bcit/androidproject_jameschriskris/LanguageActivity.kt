package ca.bcit.androidproject_jameschriskris

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.Button


class LanguageActivity : AppCompatActivity()
{
    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_language)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)


        val quizButton = findViewById<Button>(R.id.quizButton_language)
        quizButton.setOnClickListener {
            swapLessonAndQuizFragments(quizButton)
        }
        val lessonButton = findViewById<Button>(R.id.lessonButton_language)
        lessonButton.setOnClickListener {
            swapLessonAndQuizFragments(lessonButton)
        }
    }

    override fun onSupportNavigateUp(): Boolean
    {
        finish()
        return super.onSupportNavigateUp()
    }

    private fun swapLessonAndQuizFragments(v: View){

        val quizButton = findViewById<Button>(R.id.quizButton_language)
        val lessonButton = findViewById<Button>(R.id.lessonButton_language)

        val fragment = supportFragmentManager.findFragmentById(R.id.fragmentContainerView)
        val ft = supportFragmentManager.beginTransaction()
        if (fragment is LessonsFragment){
            if (v == quizButton) {
                ft.replace(R.id.fragmentContainerView, QuizzesFragment.newInstance())
            }
        } else {
            if (v == lessonButton) {
                ft.replace(R.id.fragmentContainerView, LessonsFragment.newInstance())
            }
        }
        ft.commit()
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean
    {
        menuInflater.inflate(R.menu.menu_appbar, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean
    {
        when (item.itemId) {
            R.id.menuItem_actionbar_hiragana -> {
                val intent = Intent(this, ChartActivity::class.java)
                intent.putExtra("key", "hiragana")
                startActivity(intent)
            }
            R.id.menuItem_actionbar_katakana -> {
                val intent = Intent(this, ChartActivity::class.java)
                intent.putExtra("key", "katakana")
                startActivity(intent)
            }
            R.id.menuItem_actionbar_about -> {
                val intent = Intent(this, ChartActivity::class.java)
                intent.putExtra("key", "about")
                startActivity(intent)
            }
        }
        return super.onOptionsItemSelected(item)
    }
}