package ca.bcit.androidproject_jameschriskris

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.cardview.widget.CardView

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [LessonsFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class LessonsFragment : Fragment()
{
    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null

    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View?
    {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_lessons, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val hiraganaCard = activity?.findViewById<CardView>(R.id.cardView_lessons_hiragana)
        val katakanaCard = activity?.findViewById<CardView>(R.id.cardView_lessons_katakana)

        hiraganaCard?.setOnClickListener {
            goToHiragana()
        }

        katakanaCard?.setOnClickListener {
            goToKatakana()
        }

        val greetingsCard = activity?.findViewById<CardView>(R.id.cardView_lessons_greetings)
        val dialogueCard = activity?.findViewById<CardView>(R.id.cardView_lessons_dialogue)
        val vocabularyCard = activity?.findViewById<CardView>(R.id.cardView_lessons_vocabulary)
        val grammarCard = activity?.findViewById<CardView>(R.id.cardView_lessons_grammar)

        var intent : Intent
        greetingsCard?.setOnClickListener {
            intent = Intent(activity, LessonActivity::class.java)
            intent.putExtra("0", R.drawable.greetings_pg1)
            intent.putExtra("1", R.drawable.greetings_pg2)
            intent.putExtra("2", R.drawable.greetings_pg3)
            startActivity(intent)
        }

        dialogueCard?.setOnClickListener {
            intent = Intent(activity, LessonActivity::class.java)
            intent.putExtra("0", R.drawable.dialogue_pg1)
            intent.putExtra("1", R.drawable.dialogue_pg2)
            startActivity(intent)
        }

        vocabularyCard?.setOnClickListener {
            intent = Intent(activity, LessonActivity::class.java)
            intent.putExtra("0", R.drawable.vocabulary_pg1)
            intent.putExtra("1", R.drawable.vocabulary_pg2)
            startActivity(intent)
        }

        grammarCard?.setOnClickListener {
            intent = Intent(activity, LessonActivity::class.java)
            intent.putExtra("0", R.drawable.grammar_pg1)
            intent.putExtra("1", R.drawable.grammar_pg2)
            intent.putExtra("2", R.drawable.grammar_pg3)
            intent.putExtra("3", R.drawable.grammar_pg4)
            startActivity(intent)
        }
    }

    private fun goToHiragana()
    {
        val intent = Intent(activity, CharactersActivity::class.java)

        val hiragana = ArrayList<AlphabetCharacter>()

        hiragana.add(AlphabetCharacter(character = "Hiragana_a", header = "Lesson 1", subheader = "Hiragana", R.drawable.hiragana_a))
        hiragana.add(AlphabetCharacter(character = "Hiragana_i",  header = "Lesson 1" , subheader = "Hiragana", R.drawable.hiragana_i))
        hiragana.add(AlphabetCharacter(character = "Hiragana_u", header = "Lesson 1" , subheader = "Hiragana", R.drawable.hiragana_u))
        hiragana.add(AlphabetCharacter(character = "Hiragana_e", header = "Lesson 1" , subheader = "Hiragana", R.drawable.hiragana_e))
        hiragana.add(AlphabetCharacter(character = "Hiragana_o", header = "Lesson 1" , subheader = "Hiragana", R.drawable.hiragana_o))
        hiragana.add(AlphabetCharacter(character = "Hiragana_ka", header = "Lesson 1" , subheader = "Hiragana", R.drawable.hiragana_ka))
        hiragana.add(AlphabetCharacter(character = "Hiragana_ki", header = "Lesson 1" , subheader = "Hiragana", R.drawable.hiragana_ki))
        hiragana.add(AlphabetCharacter(character = "Hiragana_ku", header = "Lesson 1" , subheader = "Hiragana", R.drawable.hiragana_ku))
        hiragana.add(AlphabetCharacter(character = "Hiragana_ke", header = "Lesson 1" , subheader = "Hiragana", R.drawable.hiragana_ke))
        hiragana.add(AlphabetCharacter(character = "Hiragana_ko", header = "Lesson 1" , subheader = "Hiragana", R.drawable.hiragana_ko))
        hiragana.add(AlphabetCharacter(character = "Hiragana_sa", header = "Lesson 1" , subheader = "Hiragana", R.drawable.hiragana_sa))

        hiragana.add(AlphabetCharacter(character = "Hiragana_shi", header = "Lesson 1" , subheader = "Hiragana", R.drawable.hiragana_shi))
        hiragana.add(AlphabetCharacter(character = "Hiragana_su", header = "Lesson 1" , subheader = "Hiragana", R.drawable.hiragana_su))
        hiragana.add(AlphabetCharacter(character = "Hiragana_se", header = "Lesson 1" , subheader = "Hiragana", R.drawable.hiragana_se))
        hiragana.add(AlphabetCharacter(character = "Hiragana_so", header = "Lesson 1" , subheader = "Hiragana", R.drawable.hiragana_so))

        hiragana.add(AlphabetCharacter(character = "Hiragana_ta", header = "Lesson 1" , subheader = "Hiragana", R.drawable.hiragana_ta))
        hiragana.add(AlphabetCharacter(character = "Hiragana_chi", header = "Lesson 1" , subheader = "Hiragana", R.drawable.hiragana_chi))
        hiragana.add(AlphabetCharacter(character = "Hiragana_tsu", header = "Lesson 1" , subheader = "Hiragana", R.drawable.hiragana_tsu))
        hiragana.add(AlphabetCharacter(character = "Hiragana_te", header = "Lesson 1" , subheader = "Hiragana", R.drawable.hiragana_te))

        hiragana.add(AlphabetCharacter(character = "Hiragana_to", header = "Lesson 1" , subheader = "Hiragana", R.drawable.hiragana_to))
        hiragana.add(AlphabetCharacter(character = "Hiragana_na", header = "Lesson 1" , subheader = "Hiragana", R.drawable.hiragana_na))
        hiragana.add(AlphabetCharacter(character = "Hiragana_ni", header = "Lesson 1" , subheader = "Hiragana", R.drawable.hiragana_ni))
        hiragana.add(AlphabetCharacter(character = "Hiragana_nu", header = "Lesson 1" , subheader = "Hiragana", R.drawable.hiragana_nu))

        hiragana.add(AlphabetCharacter(character = "Hiragana_ne", header = "Lesson 1" , subheader = "Hiragana", R.drawable.hiragana_ne))
        hiragana.add(AlphabetCharacter(character = "Hiragana_no", header = "Lesson 1" , subheader = "Hiragana", R.drawable.hiragana_no))
        hiragana.add(AlphabetCharacter(character = "Hiragana_ha", header = "Lesson 1" , subheader = "Hiragana", R.drawable.hiragana_ha))
        hiragana.add(AlphabetCharacter(character = "Hiragana_hi", header = "Lesson 1" , subheader = "Hiragana", R.drawable.hiragana_hi))

        hiragana.add(AlphabetCharacter(character = "Hiragana_fu", header = "Lesson 1" , subheader = "Hiragana", R.drawable.hiragana_fu))
        hiragana.add(AlphabetCharacter(character = "Hiragana_he", header = "Lesson 1" , subheader = "Hiragana", R.drawable.hiragana_he))
        hiragana.add(AlphabetCharacter(character = "Hiragana_ho", header = "Lesson 1" , subheader = "Hiragana", R.drawable.hiragana_ho))
        hiragana.add(AlphabetCharacter(character = "Hiragana_ma", header = "Lesson 1" , subheader = "Hiragana", R.drawable.hiragana_ma))

        hiragana.add(AlphabetCharacter(character = "Hiragana_mi", header = "Lesson 1" , subheader = "Hiragana", R.drawable.hiragana_mi))
        hiragana.add(AlphabetCharacter(character = "Hiragana_mu", header = "Lesson 1" , subheader = "Hiragana", R.drawable.hiragana_mu))
        hiragana.add(AlphabetCharacter(character = "Hiragana_me", header = "Lesson 1" , subheader = "Hiragana", R.drawable.hiragana_me))
        hiragana.add(AlphabetCharacter(character = "Hiragana_mo", header = "Lesson 1" , subheader = "Hiragana", R.drawable.hiragana_mo))

        hiragana.add(AlphabetCharacter(character = "Hiragana_ya", header = "Lesson 1" , subheader = "Hiragana", R.drawable.hiragana_ya))
        hiragana.add(AlphabetCharacter(character = "Hiragana_yu", header = "Lesson 1" , subheader = "Hiragana", R.drawable.hiragana_yu))
        hiragana.add(AlphabetCharacter(character = "Hiragana_ho", header = "Lesson 1" , subheader = "Hiragana", R.drawable.hiragana_ho))
        hiragana.add(AlphabetCharacter(character = "Hiragana_yo", header = "Lesson 1" , subheader = "Hiragana", R.drawable.hiragana_yo))

        hiragana.add(AlphabetCharacter(character = "Hiragana_ra", header = "Lesson 1" , subheader = "Hiragana", R.drawable.hiragana_ra))
        hiragana.add(AlphabetCharacter(character = "Hiragana_ri", header = "Lesson 1" , subheader = "Hiragana", R.drawable.hiragana_ri))
        hiragana.add(AlphabetCharacter(character = "Hiragana_ru", header = "Lesson 1" , subheader = "Hiragana", R.drawable.hiragana_ru))
        hiragana.add(AlphabetCharacter(character = "Hiragana_re", header = "Lesson 1" , subheader = "Hiragana", R.drawable.hiragana_re))

        hiragana.add(AlphabetCharacter(character = "Hiragana_ro", header = "Lesson 1" , subheader = "Hiragana", R.drawable.hiragana_ro))
        hiragana.add(AlphabetCharacter(character = "Hiragana_wa", header = "Lesson 1" , subheader = "Hiragana", R.drawable.hiragana_wa))
        hiragana.add(AlphabetCharacter(character = "Hiragana_o", header = "Lesson 1" , subheader = "Hiragana", R.drawable.hiragana_o))
        hiragana.add(AlphabetCharacter(character = "Hiragana_n", header = "Lesson 1" , subheader = "Hiragana", R.drawable.hiragana_n))

        hiragana.add(AlphabetCharacter(character = "Hiragana_pyo", header = "Lesson 1" , subheader = "Hiragana", R.drawable.hiragana_pyo))

        intent.putParcelableArrayListExtra("hiragana", hiragana)
        startActivity(intent)
    }

    private fun goToKatakana()
    {
        val intent = Intent(activity, CharactersActivity::class.java)
        val katakana = ArrayList<AlphabetCharacter>()
        katakana.add(AlphabetCharacter(character = "Katakana_a", header = "Lesson 2", subheader = "Katakana", R.drawable.katakana_a))
        katakana.add(AlphabetCharacter(character = "Katakana_i", header = "Lesson 2" , subheader = "Katakana", R.drawable.katakana_i))
        katakana.add(AlphabetCharacter(character = "Katakana_u", header = "Lesson 2" , subheader = "Katakana", R.drawable.katakana_u))
        katakana.add(AlphabetCharacter(character = "Katakana_yu", header = "Lesson 2" , subheader = "Katakana", R.drawable.katakana_yu))
        intent.putParcelableArrayListExtra("katakana", katakana)
        startActivity(intent)
    }

    companion object
    {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @return A new instance of fragment LessonsFragment.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance() =
            LessonsFragment().apply {
//                arguments = Bundle().apply {
//                    putString(ARG_PARAM1, param1)
//                    putString(ARG_PARAM2, param2)
//                }
            }
    }

    // ----------------------------------------------------------------------------------------  //

    // ------------------- Lecture 5 Notes (pages 22 to 39 Lecture Video) ------------------------- //



}