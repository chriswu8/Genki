package ca.bcit.androidproject_jameschriskris

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle


class ChartActivity : AppCompatActivity()
{
    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_chart)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)


        val fragment = when (intent.getStringExtra("key")) {
            "hiragana" ->
            {
                HiraganaFragment()
            }
            "katakana" ->
            {
                KatakanaFragment()
            }
            else ->
            {
                AboutFragment()
            }
        }
        supportFragmentManager.beginTransaction().replace(R.id.fragmentContainerView_chart, fragment).commit()
    }

    override fun onSupportNavigateUp(): Boolean
    {
        finish()
        return super.onSupportNavigateUp()
    }
}