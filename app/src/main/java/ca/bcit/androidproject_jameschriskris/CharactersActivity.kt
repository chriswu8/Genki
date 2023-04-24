package ca.bcit.androidproject_jameschriskris

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class CharactersActivity : AppCompatActivity()
{
    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_characters)
        captureIntent()

        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar!!.title = "Alphabet Lesson Characters Activity"
    }

    override fun onSupportNavigateUp(): Boolean
    {
        finish()
        return super.onSupportNavigateUp()
    }


    private fun captureIntent()
    {
        val alphabetButtonOne = findViewById<Button>(R.id.button_language_firstChar)
        val alphabetButtonTwo = findViewById<Button>(R.id.button_language_secondChar)
        val alphabetButtonThree = findViewById<Button>(R.id.button_language_thirdChar)
        val alphabetButtonFour = findViewById<Button>(R.id.button_language_forthChar)

        val alphabetButtonFive = findViewById<Button>(R.id.button_language_fifthChar)
        val alphabetButtonSix = findViewById<Button>(R.id.button_language_sixthChar)
        val alphabetButtonSeven = findViewById<Button>(R.id.button_language_seventhChar)
        val alphabetButtonEight = findViewById<Button>(R.id.button_language_eighthChar)

        val alphabetButtonNine = findViewById<Button>(R.id.button_language_ninthChar)
        val alphabetButtonTen = findViewById<Button>(R.id.button_language_tenthChar)
        val alphabetButtonEleven = findViewById<Button>(R.id.button_language_eleventhChar)
        val alphabetButtonTwelve = findViewById<Button>(R.id.button_language_twelvthChar)

        val alphabetButtonThirteen = findViewById<Button>(R.id.button_language_thirteenthChar)
        val alphabetButtonFourteen = findViewById<Button>(R.id.button_language_fourteenthChar)
        val alphabetButtonFifteen = findViewById<Button>(R.id.button_language_fifteenthChar)
        val alphabetButtonSixteen= findViewById<Button>(R.id.button_language_sixteenthChar)

        val alphabetButtonSeventeen = findViewById<Button>(R.id.button_language_seventeenthChar)
        val alphabetButtonEighteen = findViewById<Button>(R.id.button_language_eighteenthChar)
        val alphabetButtonNineteen = findViewById<Button>(R.id.button_language_nineteenthChar)
        val alphabetButtonTwenty = findViewById<Button>(R.id.button_language_twentiethChar)

        val alphabetButtonTwentyOne = findViewById<Button>(R.id.button_language_twentyfirst_Char)
        val alphabetButtonTwentyTwo = findViewById<Button>(R.id.button_language_twentysecond_Char)
        val alphabetButtonTwentyThree = findViewById<Button>(R.id.button_language_twentythird_Char)
        val alphabetButtonTwentyFour = findViewById<Button>(R.id.button_language_twentyfourth_Char)

        val alphabetButtonTwentyFive = findViewById<Button>(R.id.button_language_twentyfifthChar)
        val alphabetButtonTwentySix= findViewById<Button>(R.id.button_language_twentysixthChar)
        val alphabetButtonTwentySeven = findViewById<Button>(R.id.button_language_twentyseventhChar)
        val alphabetButtonTwentyEight = findViewById<Button>(R.id.button_language_twentyeighthChar)

        val alphabetButtonTwentyNine = findViewById<Button>(R.id.button_language_twentyninthChar)
        val alphabetButtonThirty = findViewById<Button>(R.id.button_language_thiriethChar)
        val alphabetButtonThirtyOne = findViewById<Button>(R.id.button_language_thirtyfirstChar)
        val alphabetButtonThirtyTwo = findViewById<Button>(R.id.button_language_thirtysecondChar)

        val alphabetButtonThirtyThree = findViewById<Button>(R.id.button_language_thirtythirdChar)
        val alphabetButtonThirtyFour = findViewById<Button>(R.id.button_language_thirtyfourthChar)
        val alphabetButtonThirtyFive = findViewById<Button>(R.id.button_language_thirtyfifthChar)
        val alphabetButtonThirtySix = findViewById<Button>(R.id.button_language_thirtysixthChar)

        val alphabetButtonThirtySeven = findViewById<Button>(R.id.button_language_thirtyseventhChar)
        val alphabetButtonThirtyEight = findViewById<Button>(R.id.button_language_thirtyeighthChar)
        val alphabetButtonThirtyNine = findViewById<Button>(R.id.button_language_thirtyninthChar)
        val alphabetButtonForty = findViewById<Button>(R.id.button_language_fortiethChar)

        val alphabetButtonFortyOne = findViewById<Button>(R.id.button_language_fortyfirstChar)
        val alphabetButtonFortyTwo = findViewById<Button>(R.id.button_language_fortysecondChar)
        val alphabetButtonFortyThree = findViewById<Button>(R.id.button_language_fortythirdChar)
        val alphabetButtonFortyFour = findViewById<Button>(R.id.button_language_fortyfourthChar)

        val alphabetButtonFortyFive = findViewById<Button>(R.id.button_language_fortyfifthChar)
        val alphabetButtonFortySix = findViewById<Button>(R.id.button_language_fortysixthChar)
        val alphabetButtonFortySeven = findViewById<Button>(R.id.button_language_fortyseventhChar)

        if (intent.hasExtra("hiragana"))
        {
            val hiragana = intent.getParcelableArrayListExtra<AlphabetCharacter>("hiragana")
            alphabetButtonOne.text = hiragana!![0].character
            alphabetButtonTwo.text = hiragana[1].character
            alphabetButtonThree.text = hiragana[2].character
            alphabetButtonFour.text = hiragana[3].character

            alphabetButtonFive.text = hiragana[4].character
            alphabetButtonSix.text = hiragana[5].character
            alphabetButtonSeven.text = hiragana[6].character
            alphabetButtonEight.text = hiragana[7].character

            alphabetButtonNine.text = hiragana[8].character
            alphabetButtonTen.text = hiragana[9].character
            alphabetButtonEleven.text = hiragana[10].character
            alphabetButtonTwelve.text = hiragana[11].character

            alphabetButtonThirteen.text = hiragana[12].character
            alphabetButtonFourteen.text = hiragana[13].character
            alphabetButtonFifteen.text = hiragana[14].character
            alphabetButtonSixteen.text = hiragana[15].character

            alphabetButtonSeventeen.text = hiragana[16].character
            alphabetButtonEighteen.text = hiragana[17].character
            alphabetButtonNineteen.text = hiragana[18].character
            alphabetButtonTwenty.text = hiragana[19].character

            alphabetButtonTwentyOne.text = hiragana[20].character
            alphabetButtonTwentyTwo.text = hiragana[21].character
            alphabetButtonTwentyThree.text = hiragana[22].character
            alphabetButtonTwentyFour.text = hiragana[23].character

            alphabetButtonTwentyFive.text = hiragana[24].character
            alphabetButtonTwentySix.text = hiragana[25].character
            alphabetButtonTwentySeven.text = hiragana[26].character
            alphabetButtonTwentyEight.text = hiragana[27].character

            alphabetButtonTwentyNine.text = hiragana[28].character
            alphabetButtonThirty.text = hiragana[29].character
            alphabetButtonThirtyOne.text = hiragana[30].character
            alphabetButtonThirtyTwo.text = hiragana[31].character


            alphabetButtonThirtyThree.text = hiragana[32].character
            alphabetButtonThirtyFour.text = hiragana[33].character
            alphabetButtonThirtyFive.text = hiragana[34].character
            alphabetButtonThirtySix.text = hiragana[35].character


            alphabetButtonThirtySeven.text = hiragana[36].character
            alphabetButtonThirtyEight.text = hiragana[37].character
            alphabetButtonThirtyNine.text = hiragana[38].character
            alphabetButtonForty.text = hiragana[39].character

            alphabetButtonFortyOne.text = hiragana[40].character
            alphabetButtonFortyTwo.text = hiragana[41].character
            alphabetButtonFortyThree.text = hiragana[42].character
            alphabetButtonFortyFour.text = hiragana[43].character

            alphabetButtonFortyFive.text = hiragana[44].character
            alphabetButtonFortySix.text = hiragana[45].character
            alphabetButtonFortySeven.text = hiragana[46].character


        }
        else
        {
            val katakana = intent.getParcelableArrayListExtra<AlphabetCharacter>("katakana")
            alphabetButtonOne.text = katakana!![0].character
            alphabetButtonTwo.text = katakana[1].character
            alphabetButtonThree.text = katakana[2].character
            alphabetButtonFour.text = katakana[3].character

        }
        // onClickListeners learned in lecture4
        alphabetButtonOne.setOnClickListener { openFactActivity(0) }
        alphabetButtonTwo.setOnClickListener { openFactActivity(1) }
        alphabetButtonThree.setOnClickListener { openFactActivity(2) }
        alphabetButtonFour.setOnClickListener { openFactActivity(3) }

        alphabetButtonFive.setOnClickListener { openFactActivity(4) }
        alphabetButtonSix.setOnClickListener { openFactActivity(5) }
        alphabetButtonSeven.setOnClickListener { openFactActivity(6) }
        alphabetButtonEight.setOnClickListener { openFactActivity(7) }

        alphabetButtonNine.setOnClickListener { openFactActivity(8) }
        alphabetButtonTen.setOnClickListener { openFactActivity(9) }
        alphabetButtonEleven.setOnClickListener { openFactActivity(10) }
        alphabetButtonTwelve.setOnClickListener { openFactActivity(11) }

        alphabetButtonThirteen.setOnClickListener { openFactActivity(12) }
        alphabetButtonFourteen.setOnClickListener { openFactActivity(13) }
        alphabetButtonFifteen.setOnClickListener { openFactActivity(14) }
        alphabetButtonSixteen.setOnClickListener { openFactActivity(15) }

        alphabetButtonSeventeen.setOnClickListener { openFactActivity(16) }
        alphabetButtonEighteen.setOnClickListener { openFactActivity(17) }
        alphabetButtonNineteen.setOnClickListener { openFactActivity(18) }
        alphabetButtonTwenty.setOnClickListener { openFactActivity(19) }

        alphabetButtonTwentyOne.setOnClickListener { openFactActivity(20) }
        alphabetButtonTwentyTwo.setOnClickListener { openFactActivity(21) }
        alphabetButtonTwentyThree.setOnClickListener { openFactActivity(22) }
        alphabetButtonTwentyFour.setOnClickListener { openFactActivity(23) }

        alphabetButtonTwentyFive.setOnClickListener { openFactActivity(24) }
        alphabetButtonTwentySix.setOnClickListener { openFactActivity(25) }
        alphabetButtonTwentySeven.setOnClickListener { openFactActivity(26) }
        alphabetButtonTwentyEight.setOnClickListener { openFactActivity(27) }

        alphabetButtonTwentyNine.setOnClickListener { openFactActivity(28) }
        alphabetButtonThirty.setOnClickListener { openFactActivity(29) }
        alphabetButtonThirtyOne.setOnClickListener { openFactActivity(30) }
        alphabetButtonThirtyTwo.setOnClickListener { openFactActivity(31) }

        alphabetButtonThirtyThree.setOnClickListener { openFactActivity(32) }
        alphabetButtonThirtyFour.setOnClickListener { openFactActivity(33) }
        alphabetButtonThirtyFive.setOnClickListener { openFactActivity(34) }
        alphabetButtonThirtySix.setOnClickListener { openFactActivity(35) }

        alphabetButtonThirtySeven.setOnClickListener { openFactActivity(36) }
        alphabetButtonThirtyEight.setOnClickListener { openFactActivity(37) }
        alphabetButtonThirtyNine.setOnClickListener { openFactActivity(38) }
        alphabetButtonForty.setOnClickListener { openFactActivity(39) }

        alphabetButtonFortyOne.setOnClickListener { openFactActivity(40) }
        alphabetButtonFortyTwo.setOnClickListener { openFactActivity(41) }
        alphabetButtonFortyThree.setOnClickListener { openFactActivity(42) }
        alphabetButtonFortyFour.setOnClickListener { openFactActivity(43) }

        alphabetButtonFortyFive.setOnClickListener { openFactActivity(44) }
        alphabetButtonFortySix.setOnClickListener { openFactActivity(45) }
        alphabetButtonFortySeven.setOnClickListener { openFactActivity(46) }


    }


    // This function opens the FactActivity, passing data about a specific animal in a Bundle object.
    private fun openFactActivity(index: Int)
    {
        // Select the correct ArrayList based on the animalName passed in the function
        val characters = if (intent.hasExtra("hiragana"))
        {
            intent.getParcelableArrayListExtra<AlphabetCharacter>("hiragana")
        }
        else if (intent.hasExtra("katakana"))
        {
            intent.getParcelableArrayListExtra("katakana")
        }
        else
        {
            null
        }

        val intent = Intent(this, CharacterActivity::class.java)

        val bundle = Bundle()

        bundle.putInt("image", characters!![index].resourceID)
        bundle.putString("header", characters[index].header)
        bundle.putString("subheader", characters[index].subheader)

        intent.putExtras(bundle)
        startActivity(intent)
    }
}