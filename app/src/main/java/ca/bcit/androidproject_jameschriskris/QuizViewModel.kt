package ca.bcit.androidproject_jameschriskris

import androidx.lifecycle.ViewModel
import java.text.DecimalFormat

class QuizViewModel: ViewModel() {

    var quizList = ArrayList<Quiz>()
    var current: Int = 0


    fun increment() {
        current += 1
    }

    fun decrement() {
        current -= 1
    }

    fun nextQuestion(listener: QuizNavigationListener) {
        listener.onNextQuizNavigation()
    }

    fun prevQuestion(listener: QuizNavigationListener) {
        listener.onPrevQuizNavigation()
    }

    fun calculatePercentage(): String {
        var score = 0.0
        val total = quizList.size
        for (i in 0 until quizList.size) {
            val expectedAnswer = quizList[i].correct.size
            var correctAnswer = 0.0
            var wrongAnswer = 0.0
            for (j in 0 until quizList[i].correct.size) {
                var found = false
                for (k in 0 until quizList[i].choice.size) {
                    if (quizList[i].choice.size > quizList[i].correct.size) {
                        wrongAnswer += quizList[i].choice.size - quizList[i].correct.size
                    }
                    if (quizList[i].choice[k] == quizList[i].correct[j]) {
                        correctAnswer++
                        found = true
                        break
                    }
                }
                if (!found) {
                    wrongAnswer++
                }
            }

            score += if ((correctAnswer + wrongAnswer) > expectedAnswer) {
                (correctAnswer) / (correctAnswer + wrongAnswer)
            } else {
                if (correctAnswer + wrongAnswer == 0.0) {
                    wrongAnswer++
                }
                (correctAnswer / (expectedAnswer + wrongAnswer))
            }
        }

        val df = DecimalFormat("#.##")
        return df.format(score / total * 100).toString()
    }
}