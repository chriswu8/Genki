package ca.bcit.androidproject_jameschriskris

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class CharacterActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.alphabet_character_facts)
        captureBundle()

        supportActionBar!!.setDisplayHomeAsUpEnabled(true)
        supportActionBar!!.title = "Alphabet Character Facts Activity"
    }

    override fun onSupportNavigateUp(): Boolean
    {
        finish()
        return super.onSupportNavigateUp()
    }

    private fun captureBundle() {
        val mImageView = findViewById<ImageView>(R.id.imageView_fragment_alphabet)
        val mTextViewHeader = findViewById<TextView>(R.id.textView_header_fragment_alphabet)
        val mTextViewSubHeader = findViewById<TextView>(R.id.textView_subheader_fragment_alphabet)
        val image = intent.extras?.getInt("image")
        val header = intent.extras?.getString("header")
        val subheader = intent.extras?.getString("subheader")

        mImageView.setImageResource(image!!)
        mTextViewHeader.text = header
        mTextViewSubHeader.text = subheader

    }
}