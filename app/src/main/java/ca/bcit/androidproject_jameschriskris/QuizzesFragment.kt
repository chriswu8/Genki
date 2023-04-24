package ca.bcit.androidproject_jameschriskris

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.cardview.widget.CardView
import androidx.fragment.app.Fragment


// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [QuizzesFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class QuizzesFragment : Fragment()
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
        return inflater.inflate(R.layout.fragment_quizzes, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val quizMap = mapOf(
            R.id.cardView_quizzes_hiragana to "hiragana_quiz",
            R.id.cardView_quizzes_katakana to "katakana_quiz",
            R.id.cardView_quizzes_greetings to "greetings_quiz",
            R.id.cardView_quizzes_dialogue to "dialogue_quiz",
            R.id.cardView_quizzes_vocabulary to "vocabulary_quiz",
            R.id.cardView_quizzes_grammar to "grammar_quiz"
        )

        for ((cardId, quizName) in quizMap) {
            view.findViewById<CardView>(cardId)?.setOnClickListener {
                val intent = Intent(activity, QuizActivity::class.java)
                intent.putExtra("quiz_name_key", quizName)
                startActivity(intent)
            }
        }
    }

    companion object
    {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @return A new instance of fragment QuizzesFragment.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance() =
            QuizzesFragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}