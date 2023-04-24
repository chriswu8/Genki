package ca.bcit.androidproject_jameschriskris

class QuizGenerator
{
    companion object
    {
        fun generateHiraganaQuizList(): ArrayList<Quiz>
        {
            val quizList = ArrayList<Quiz>()
            quizList.add(Quiz("What is あ?", listOf("A", "I", "U", "E"), listOf(0), arrayListOf()))
            quizList.add(Quiz("What is い?", listOf("A", "I", "U", "E"), listOf(1), arrayListOf()))
            quizList.add(Quiz("What is う?", listOf("A", "I", "U", "E"), listOf(2), arrayListOf()))
            quizList.add(Quiz("Which doesn't have an 'a' sound?", listOf("へ", "ち", "そ", "わ"), listOf(0, 1, 2), arrayListOf()))
            return quizList
        }

        fun generateKatakanaQuizList(): ArrayList<Quiz>
        {
            val quizList = ArrayList<Quiz>()
            quizList.add(Quiz("What is ア?", listOf("A", "I", "U", "E"), listOf(0), arrayListOf()))
            quizList.add(Quiz("What is イ?", listOf("A", "I", "U", "E"), listOf(1), arrayListOf()))
            quizList.add(Quiz("What is ウ?", listOf("A", "I", "U", "E"), listOf(2), arrayListOf()))
            quizList.add(Quiz("Which doesn't have an 'a' sound?", listOf("ヘ", "チ", "ソ", "ワ"), listOf(0, 1, 2), arrayListOf()))
            return quizList
        }

        fun generateGreetingsQuizList(): ArrayList<Quiz>
        {
            val quizList = ArrayList<Quiz>()
            quizList.add(Quiz("How do you say good morning?", listOf("Ohayo", "Konnichiwa", "Oyasumi", "Sayonara"), listOf(0), arrayListOf()))
            quizList.add(Quiz("How do you say good afternoon?", listOf("Ohayo", "Konnichiwa", "Oyasumi", "Sayonara"), listOf(1), arrayListOf()))
            quizList.add(Quiz("How do you say good night?", listOf("Ohayo", "Konnichiwa", "Oyasumi", "Sayonara"), listOf(2), arrayListOf()))
            quizList.add(Quiz("How do you say good bye?", listOf("Ohayo", "Konnichiwa", "Oyasumi", "Sayonara"), listOf(3), arrayListOf()))
            return quizList
        }

        fun generateDialogueQuizList(): ArrayList<Quiz>
        {
            val quizList = ArrayList<Quiz>()
            quizList.add(Quiz("What does いま、なんじですか　mean?", listOf("What day is it today", "What time is it now", "What is your name", "What is your occupation"), listOf(1), arrayListOf()))
            quizList.add(Quiz("What does じゅうにじはん　mean?", listOf("2PM", "3PM", "12PM", "12:30PM"), listOf(3), arrayListOf()))
            quizList.add(Quiz("What does ありがとうございます　mean?", listOf("Thank you", "You are welcome", "No thank you", "Excellent"), listOf(0), arrayListOf()))
            quizList.add(Quiz("How did Takeshi respond to Mary's gratitude?", listOf("は", "もちろん", "すみません", "いいえ"), listOf(3), arrayListOf()))
            return quizList
        }

        fun generateVocabularyQuizList(): ArrayList<Quiz>
        {
            val quizList = ArrayList<Quiz>()
            quizList.add(Quiz("Translate ’um...' to hiragana", listOf("あの", "だいがく", "ともだち", "ばんごう"), listOf(0), arrayListOf()))
            quizList.add(Quiz("Translate ’college' to hiragana", listOf("あの", "だいがく", "ともだち", "ばんごう"), listOf(1), arrayListOf()))
            quizList.add(Quiz("Translate ’friend' to hiragana", listOf("あの", "だいがく", "ともだち", "ばんごう"), listOf(2), arrayListOf()))
            quizList.add(Quiz("Translate ’number' to hiragana", listOf("あの", "だいがく", "ともだち", "ばんごう"), listOf(3), arrayListOf()))
            return quizList
        }

        fun generateGrammarQuizList(): ArrayList<Quiz>
        {
            val quizList = ArrayList<Quiz>()
            quizList.add(Quiz("りゅうがくせい＿。", listOf("です", "か", "は", "の"), listOf(0), arrayListOf()))
            quizList.add(Quiz("りゅうがくせいです＿。", listOf("です", "か", "は", "の"), listOf(1), arrayListOf()))
            quizList.add(Quiz("わたし＿Maryです。", listOf("です", "か", "は", "の"), listOf(2), arrayListOf()))
            quizList.add(Quiz("たけしさん＿おかあさんはせんせいです。", listOf("です", "か", "は", "の"), listOf(3), arrayListOf()))
            return quizList
        }
    }
}