package com.example.quizapp

object Constants {

    const val USER_NAME: String = "user_name"
    const val TOTAL_QUESTIONS = "total_questions"
    const val CORRECT_ANSWERS: String = "correct_answers"

    fun getQuestions(): ArrayList<Question>{
        val questionList = ArrayList<Question>()

        //1
        val que1 = Question(
            1,"What country does this flag belong to?",
            R.drawable.ic_flag_of_argentina,
            "Argentina","Austrialia",
            "Armenia","Austria",
            1
        )
        questionList.add(que1)

        //2
        val que2 = Question(
            2,"What country does this flag belong to?",
            R.drawable.ic_flag_of_australia,
            "England","France",
            "Australia","USA",
            3
        )
        questionList.add(que2)

        //3
        val que3 = Question(
            3,"What country does this flag belong to?",
            R.drawable.ic_flag_of_brazil,
            "Bangladesh","Austrialia",
            "Armenia","brazil",
            4
        )
        questionList.add(que3)

        //4
        val que4 = Question(
            4,"What country does this flag belong to?",
            R.drawable.ic_flag_of_belgium,
            "England","Barbados",
            "belgium","Belize",
            3
        )
        questionList.add(que4)


        //5
        val que5 = Question(
            5,"What country does this flag belong to?",
            R.drawable.ic_flag_of_fiji,
            "India","fiji",
            "france","Austria",
            2
        )
        questionList.add(que5)


        //6
        val que6 = Question(
            6,"What country does this flag belong to?",
            R.drawable.ic_flag_of_germany,
            "England","Austrialia",
            "Denmark","Germany",
            4
        )
        questionList.add(que6)


        //7
        val que7 = Question(
            7,"What country does this flag belong to?",
            R.drawable.ic_flag_of_denmark,
            "Argentina","egypt",
            "Denmark","Ethiopia",
            3
        )
        questionList.add(que7)


        //8
        val que8 = Question(
            8,"What country does this flag belong to?",
            R.drawable.ic_flag_of_india,
            "Denmark","Austrialia",
            "India","Austria",
            3
        )
        questionList.add(que8)


        //9
        val que9 = Question(
            9,"What country does this flag belong to?",
            R.drawable.ic_flag_of_new_zealand,
            "New Zealand","Austrialia",
            "Armenia","Austria",
            1
        )
        questionList.add(que9)


        return questionList
    }
}