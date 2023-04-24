package ca.bcit.androidproject_jameschriskris

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels


class QuizActivity : AppCompatActivity()
{
    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_quiz)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        val quizName = intent.getStringExtra("quiz_name_key")
        if (quizName != null)
        {
            when (quizName)
            {
                "hiragana_quiz" -> loadHiraganaQuiz()
                "katakana_quiz" -> loadKatakanaQuiz()
                "greetings_quiz" -> loadGreetingsQuiz()
                "dialogue_quiz" -> loadDialogueQuiz()
                "vocabulary_quiz" -> loadVocabularyQuiz()
                "grammar_quiz" -> loadGrammarQuiz()
            }
        }
    }



    override fun onSupportNavigateUp(): Boolean
    {
        finish()
        return super.onSupportNavigateUp()
    }

    private fun loadHiraganaQuiz()
    {
        val generatedList = QuizGenerator.generateHiraganaQuizList()
        val quizViewModel: QuizViewModel by viewModels()
        quizViewModel.quizList = generatedList

    }

    private fun loadKatakanaQuiz()
    {
        val generatedList = QuizGenerator.generateKatakanaQuizList()
        val quizViewModel: QuizViewModel by viewModels()
        quizViewModel.quizList = generatedList
    }

    private fun loadGreetingsQuiz()
    {
        val generatedList = QuizGenerator.generateGreetingsQuizList()
        val quizViewModel: QuizViewModel by viewModels()
        quizViewModel.quizList = generatedList
    }

    private fun loadDialogueQuiz()
    {
        val generatedList = QuizGenerator.generateDialogueQuizList()
        val quizViewModel: QuizViewModel by viewModels()
        quizViewModel.quizList = generatedList
    }

    private fun loadVocabularyQuiz()
    {
        val generatedList = QuizGenerator.generateVocabularyQuizList()
        val quizViewModel: QuizViewModel by viewModels()
        quizViewModel.quizList = generatedList
    }

    private fun loadGrammarQuiz()
    {
        val generatedList = QuizGenerator.generateGrammarQuizList()
        val quizViewModel: QuizViewModel by viewModels()
        quizViewModel.quizList = generatedList
    }

}