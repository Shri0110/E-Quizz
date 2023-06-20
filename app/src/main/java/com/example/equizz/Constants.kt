package com.example.equizz

object Constants {
    const val USER_NAME: String="user_name"
    const val TOTAL_QUESTIONS: String ="total_question"
    const val CORRECT_ANSWERS: String ="correct_answer"
    fun getQuestions(): ArrayList<Question> {
        val questionslist = ArrayList<Question>()
        val que1 = Question(1,
            "Which state has the largest population?",
            "Uttar Pradesh",
            "Rajasthan",
            "Goa",
            "Punjab",
            1)
        questionslist.add(que1)
        val que2 =Question(2,
            "World Red Cross Day is celebrated every year on?",
            "18May",
            "8May",
            "18June",
            "8June",
            2)
        questionslist.add(que2)
        val que3 =Question(
            3,
            "In which state Elephant Cave is located?",
            "Mizoram",
            "Orissa",
            "Manipur",
            "Meghalaya",
            4
        )
        questionslist.add(que3)
        val que4 =Question(4,
            "India's largest petrochemical complex is located at?",
            "Gujarat",
            "Assam",
            "Rajasthan",
            "Maharashtra",
            1

        )
        questionslist.add(que4)
        val que5= Question(
            5,
            "Under which of the following trees, Buddha got enlightment?",
            "Ficus benghalensis",
            "Ficus religiosa",
            "Ficus microcarpa",
            " Ficus elastica",
            2
        )
        questionslist.add(que5)
        val que6 = Question(
            6,
            "In which city the India’s first-ever national police museum will be established?",
            "Chennai",
            "Delhi",
            "Mumbai",
            "Bangalore",
            2
        )
        questionslist.add(que6)
        val que7 =Question(
            7,
            "Dimensions of a basketball court is?",
            "28 m x 15 m",
            "26 m x 14 m",
            " 27 m x 16 m",
            "28 m x 16 m",
            1
        )
        questionslist.add(que7)
        val que8 =Question(
            8,
            "When did the first Afghan war happen?",
            "1843",
            "1839",
            "1827",
            "1848",
            2
        )
        questionslist.add(que8)
        val que9 =Question(
            9,
            "Panchayati Raj belongs to?",
            "Residual list",
            "Concurrent list",
            "State list",
            "Union list",
            3
        )
        questionslist.add(que9)
        val que10 =Question(
            10,
            "When did the World Trade Organization come into existence?",
            "1992",
            "1993",
            "1994",
            "1995",
            4
        )
        questionslist.add(que10)

        return questionslist
    }
}