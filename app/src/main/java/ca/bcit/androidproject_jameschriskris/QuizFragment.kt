package ca.bcit.androidproject_jameschriskris

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.CheckBox
import android.widget.TextView
import androidx.fragment.app.activityViewModels
import androidx.navigation.fragment.findNavController

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"
private var quizName: String? = null
/**
 * A simple [Fragment] subclass.
 * Use the [QuizFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class QuizFragment : Fragment() {

    // TODO: Rename and change types of parameters

    class QuizNavigation(private val fragment: Fragment) : QuizNavigationListener {

        override fun onPrevQuizNavigation() {
            (fragment as QuizFragment).prevQuestion()
        }

        override fun onNextQuizNavigation() {
            (fragment as QuizFragment).nextQuestion()
        }
    }
    private fun generateQuizList(quizName: String) {
        val quizViewModel: QuizViewModel by activityViewModels()
        val quizList = quizViewModel.quizList
        quizList.clear()

        when (quizName) {
            "hiragana_quiz" -> {
                quizList.add(Quiz("あ", listOf("A", "I", "U", "E"), listOf(0), arrayListOf()))
                quizList.add(Quiz("い", listOf("A", "I", "U", "E"), listOf(1), arrayListOf()))
                quizList.add(Quiz("う", listOf("A", "I", "U", "E"), listOf(2), arrayListOf()))
                quizList.add(Quiz("え", listOf("A", "I", "U", "E"), listOf(3), arrayListOf()))
                quizList.add(Quiz("お", listOf("A", "I", "U", "O"), listOf(3), arrayListOf()))
                quizList.add(Quiz("か", listOf("KA", "KI", "KU", "KE"), listOf(0), arrayListOf()))
                quizList.add(Quiz("き", listOf("KA", "KI", "KU", "KE"), listOf(1), arrayListOf()))
                quizList.add(Quiz("く", listOf("KA", "KI", "KU", "KE"), listOf(2), arrayListOf()))
                quizList.add(Quiz("け", listOf("KA", "KI", "KU", "KE"), listOf(3), arrayListOf()))
                quizList.add(Quiz("こ", listOf("KA", "KI", "KU", "KO"), listOf(4), arrayListOf()))
            }
            "katakana_quiz" -> {
                quizList.add(Quiz("ア",  listOf("A", "I", "U", "E"), listOf(0), arrayListOf()))
                quizList.add(Quiz("イ",  listOf("A", "I", "U", "E"), listOf(1), arrayListOf()))
                quizList.add(Quiz("ウ",  listOf("A", "I", "U", "E"), listOf(2), arrayListOf()))
                quizList.add(Quiz("エ",  listOf("A", "I", "U", "E"), listOf(3), arrayListOf()))
                quizList.add(Quiz("オ",  listOf("A", "I", "U", "O"), listOf(3), arrayListOf()))
                quizList.add(Quiz("カ",  listOf("KA", "KI", "KU", "KE"), listOf(0), arrayListOf()))
                quizList.add(Quiz("キ",  listOf("KA", "KI", "KU", "KE"), listOf(1), arrayListOf()))
                quizList.add(Quiz("ク",  listOf("KA", "KI", "KU", "KE"), listOf(2), arrayListOf()))
                quizList.add(Quiz("ケ",  listOf("KA", "KI", "KU", "KE"), listOf(3), arrayListOf()))
                quizList.add(Quiz("コ",  listOf("KA", "KI", "KU", "KE"), listOf(3), arrayListOf()))
            }
            "greetings_quiz" -> {
                // generate different quiz list for greetings
            }
            // ...
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        arguments?.let {
//            param1 = it.getString(ARG_PARAM1)
//            param2 = it.getString(ARG_PARAM2)
//        }
//        val quizViewModel: QuizViewModel by activityViewModels()
//        var quizList = quizViewModel.quizList
//        val Q1 = Quiz("ア", listOf("A", "I", "U", "E"), listOf(0), arrayListOf())
//        val Q2 = Quiz("イ", listOf("A", "I", "U", "E"), listOf(1), arrayListOf())
//        val Q3 = Quiz("ウ", listOf("A", "I", "U", "E"), listOf(2), arrayListOf())
//        quizList.add(Q1)
//        quizList.add(Q2)
//        quizList.add(Q3)
//        generateQuizList()
        arguments?.let {
            quizName = it.getString("quiz_name")
        }
        quizName?.let { generateQuizList(it) }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_quiz, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        updateQuestion()

        val quizViewModel: QuizViewModel by activityViewModels()

        val back = view.findViewById<Button>(R.id.button_quiz_back)
        back.setOnClickListener{
            val backListener = QuizNavigation(this)
            quizViewModel.prevQuestion(backListener)
        }

        val next = view.findViewById<Button>(R.id.button_quiz_next)
        next.setOnClickListener{
            val nextListener = QuizNavigation(this)
            quizViewModel.nextQuestion(nextListener)
        }
    }

    private fun updateQuestion() {

        val quizViewModel: QuizViewModel by activityViewModels()
        val current = quizViewModel.current
        val quizList = quizViewModel.quizList

        println(current)

        val question = activity?.findViewById<TextView>(R.id.textView_quiz_question)
        val check1 = activity?.findViewById<CheckBox>(R.id.checkBox_answer_1)
        val check2 = activity?.findViewById<CheckBox>(R.id.checkBox_answer_2)
        val check3 = activity?.findViewById<CheckBox>(R.id.checkBox_answer_3)
        val check4 = activity?.findViewById<CheckBox>(R.id.checkBox_answer_4)

        // reset everything
        check1?.isChecked = false
        check2?.isChecked = false
        check3?.isChecked = false
        check4?.isChecked = false

        for (ans in quizList[current].choice) {
            when (ans) {
                0 -> check1?.isChecked = true
                1 -> check2?.isChecked = true
                2 -> check3?.isChecked = true
                3 -> check4?.isChecked = true
            }
        }




        question?.text = quizList[current].question
        for (i in 0..3) {
            when (i) {
                0 -> check1?.text = quizList[current].answers[i]
                1 -> check2?.text = quizList[current].answers[i]
                2 -> check3?.text = quizList[current].answers[i]
                3 -> check4?.text = quizList[current].answers[i]
            }
        }
    }

    fun prevQuestion() {

        val quizViewModel: QuizViewModel by activityViewModels()
        val current = quizViewModel.current
        val quizList = quizViewModel.quizList
        println(current)

        if (current > 0) {
            println(current)
            val choice1 = activity?.findViewById<CheckBox>(R.id.checkBox_answer_1)
            val choice2 = activity?.findViewById<CheckBox>(R.id.checkBox_answer_2)
            val choice3 = activity?.findViewById<CheckBox>(R.id.checkBox_answer_3)
            val choice4 = activity?.findViewById<CheckBox>(R.id.checkBox_answer_4)

            val answer = arrayListOf<Int>()

            var index = 0
            while (index < 4) {
                when (index) {
                    // where is the kotlin ternary operator
                    0 -> if (choice1!!.isChecked) answer.add(index)
                    1 -> if (choice2!!.isChecked) answer.add(index)
                    2 -> if (choice3!!.isChecked) answer.add(index)
                    3 -> if (choice4!!.isChecked) answer.add(index)
                }
                index++
            }
            quizList[current].choice = answer
            // get next question from list,
            quizViewModel.decrement()
            updateQuestion()

        } else {
            println("done")
        }

    }

    fun nextQuestion() {
        val quizViewModel: QuizViewModel by activityViewModels()
        val current = quizViewModel.current
        val quizList = quizViewModel.quizList


        val choice1 = activity?.findViewById<CheckBox>(R.id.checkBox_answer_1)
        val choice2 = activity?.findViewById<CheckBox>(R.id.checkBox_answer_2)
        val choice3 = activity?.findViewById<CheckBox>(R.id.checkBox_answer_3)
        val choice4 = activity?.findViewById<CheckBox>(R.id.checkBox_answer_4)

        val answer = arrayListOf<Int>()

        var index = 0
        while (index < 4) {

            when (index) {
                // where is the kotlin ternary operator
                0 -> if (choice1!!.isChecked) answer.add(index)
                1 -> if (choice2!!.isChecked) answer.add(index)
                2 -> if (choice3!!.isChecked) answer.add(index)
                3 -> if (choice4!!.isChecked) answer.add(index)
            }
            index++
        }
        quizList[current].choice = answer


        if (current < quizList.size - 1) {
            quizViewModel.increment()
            // get next question from list,
            println(current)
            updateQuestion()
        } else {
            println("done")
            findNavController().navigate(R.id.action_quizFragment_to_quizCompleteFragment)
        }

    }

    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment QuizFragment.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            QuizFragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}