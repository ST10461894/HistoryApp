Introduction to mobile Application and web design 

Introduction

The App presented below was made for Sarah. Sarah is an educator and avid history buff who is looking to using technology for the purpose of inspiring young minds. She needs an app that compares a users age to that of a famous person in history who had past away. This app is to be made is Kotlin programming language Kotlin is a general-purpose development language which is mainly used for Android mobile app development. It is a statically typed objected-oriented programming language which is interoperable with Java class libraries, Android and the Java virtual machine (JVM) It was originally designed to improve on Java programming language and is usually used together in conjunction with Java (Lutkevich 2024). Present Below are details of the app made with the specifications requested.


App Interface

The app is free to use and runs on majority of devices which use the android operating system. As seen in the image below the Virtual device used to run the app is a Pixel 3a with an Android 14 “Upside Down Cake” operating system: ![image](https://github.com/ST10461894/HistoryApp/assets/164021418/af4e40ab-14c1-4cbc-b724-a861d9054908)
 

The interface displays a globe with the background of books in a library. The top section shows the apps title whereas the middle section is where the user would enter their age. Below enter age are two buttons in purple aligned to each other, one its named “Generate” and the other is “Clear”. The generate button runs input typed in, the clear button “clear” when pressed will reset the app back to its starting mode. The bottom section of the screen displays the globe with the background of books in a library and presents the output of the details entered in the middle section. The overall theme and design of the app was created in alignment with its purpose for users.

Input & Functionality

The app code background makes use of the different topics discussed in learning units 1 2 3, these being if else statements input and output, variables, data types, login and operators. All these various functions have been implemented to in order to provide the app an engaging user-interface aswell as an appealing design made to captivate the end users as they interact with its functions. As presented in the code below the if else statement was used. If Else statements are used in the execution of both the true part and the part of a given condition. If condition is true, then the if block will be executed whereas if its false, the else block code will then be executed Kotlin(2024). 
 
![image](https://github.com/ST10461894/HistoryApp/assets/164021418/1062ec38-7bf7-46a8-8281-fc56b7bcac79)

The above screenshot shows the if else statement used for the function generateInfo. The output will first execute “No data found”. If the age is a whole number that is within the range of 20 to 100 years but does not align to one of the people listed on record. The output will then execute “Age is out of range” if the number entered is not in-between the range of 20 to 100 years old. Furthermore, the output will then produce in an else statement “Age is an invalid format” if the age entered is a decimal number. 

Included in the apps code are the details of many different people who were prominent figures in their careers. The prominent figure and their career fields which are covered include: Bob Marley- was a Jamaican reggae singer, songwriter, guitarist known as “The King of Reggae Music”, Stan Lee- Comic book writer, editor, publisher & producer, Paul Walker- Hollywood actor most known from the fast and furious series, Akira Toriyama- Japanese manga artist, character designer and Creator of the Dragon ball anime series, Diego Maradona- was an Argentine professional football player and manager who is widely regarded as one of the greatest players in the history of football, Michael Jackson- an American singer, dancer, songwriter and philanthropist notably known as the “King of Pop”, Kenneth Kaunda- a Zambian politician who had served as the first president of the republic of Zambia from 1964 to 1991 being at the forefront in the struggle for Independence against British colonel rule, Kobe Bryant-American professional basketball player for the Los Angeles Lakers and winner of five NBA championships, two-time NBA finals MVP and is widely regarded as being one of the greatest players in the history of Basketball. Steve Irwin- was an Australian zookeeper, television personality, conservationist, animal wildlife educator and environmentalist most notably known as “The crocodile hunter”. Tupac Shakur- an American rapper and actor who is regarded by many as being one of the best rappers of all time. Malcom X - an American human rights activist, promotor of Islam within the black community, vocal advocate for black empowerment and prominent figure in the civil rights movement. Winnie Mandela - a South African politician, anti-apartheid activist and second wife of Nelson Mandela. Martin Luther King Junior 39- an American Christian minister, political philosopher and activist who was one of the most prominent leaders of the civil rights movement from 1955 to 1968.

 ![image](https://github.com/ST10461894/HistoryApp/assets/164021418/804e13a4-8adc-4b76-a33a-eb3f836dfcaf)

The above code shows how output is generated based on the input of age which is assigned to 12 different entries under the function getPersonInfo. In this case above a When statement is used which is a conditional expression with multiple branches whereby the value of the first matching branch would the equate to the value of the overall expression. 

GitHub

GitHub is a online software tool that allows users to store the source code for a project aswell as track the all the changes that were made to the code. It allows developers to collaborate on their projects more effectively by providing the tools for managing the potential conflicting changes made from multiple developers. Each of the file changes are recorded as commits, which are organised into branches, providing a structured history of the development of the project. This system allows developers to work on different branches independently then later merge their changes back ti the main branch (Badkar 2023)  It is a great tool allowing developers to change, improve and adapt software from public repositories for free and is regarded as the most popular platform for collaboration on coding projects (Lutkevich 2024).  All related files and source code for the app is stored on GitHub for developers to view and make corrections where necessary.  


Conclusion

The App created was designed so users can compare their age with famous people who have passed away. It caters to users of all ages and genders as it runs no explicit or offensive content. It runs on a variety of android phones and tablets from brands such as Samsung, Huawei, Tecno, and Google Pixel.  The app has an engaging interface created to captivate students’ interests making use of different elements such as illustration, history-themed graphics, pictures, background, colours, and fonts.  It has a simple and easy to understand interface where users would enter their age in the blank space then click on the “generate” button and the result if matching will display the name of a famous person in history and text describing what they were known for. Overall, the app is great for Sarah to share with her students to keep them inspired by history and stay committed to the ever expanding world of technology. 

References

Badkar, A. 2023. What is Git Repository and How to Create one. [Online] available at: https://www.simplilearn.com/tutorials/git-tutorial/what-is-a-git-repository  [Accessed 3 April 2024]
Kotlin 2024. Why Kotlin. [Online] available at: Kotlin Programming Language (kotlinlang.org) [Accessed 3 April 2024]
Lutkevich. B. 2024. What is Kotlin.[Online] available at: https://www.techtarget.com/whatis/definition/Kotlin [Accessed April 2024]  
The IIE 2024 Introduction to Mobile Application Development [IMAD5112 ASSIGNMENT BRIEF]. Unpublished.

Application Video Walkthrough:
https://youtu.be/aAGIHXR12DI?si=zd-Ph5E64zUOhTZ_

(Complete Kotlin Source Code Below)
package com.mawasa.historyapp

import android.os.Bundle
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.google.android.material.button.MaterialButton

class MainActivity : AppCompatActivity() {

    private lateinit var ageEditText: EditText
    private lateinit var btnGenerate: MaterialButton
    private lateinit var btnClear: MaterialButton
    private lateinit var txtOutput: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        // Initialize views
        initViews()
    }

    private fun initViews() {
        ageEditText = findViewById(R.id.ageEditText)
        btnGenerate = findViewById(R.id.btn_generate)
        btnClear = findViewById(R.id.btn_clear)
        txtOutput = findViewById(R.id.txt_output)

        // Set click listeners
        btnGenerate.setOnClickListener { generateInfo() }
        btnClear.setOnClickListener { clearAge() }
    }

    private fun generateInfo() {
        val ageText = ageEditText.text.toString()
        val age = ageText.toIntOrNull()

        if (age != null && age in 20..100) {
            txtOutput.text = getPersonInfo(age) ?: "No Data Found"
        } else {
            txtOutput.text = when (age) {
                null -> "Invalid format"
                !in 20..100 -> "Age is out of range"
                else -> "Age is an invalid format" // This case is when age is not an integer
            }
        }
    }

    private fun clearAge() {
        ageEditText.text = null
    }

    private fun getPersonInfo(age: Int): String? {
        return when (age) {
            36 -> "Bob Marley - Jamaican reggae singer, songwriter, guitarist known as “The King of Reggae Music”"
            95 -> "Stan Lee - American Comic book writer, editor, publisher & producer. He rose up the ranks from a family run business called Timely Comics which would later become Marvel Comics."
            40 -> "Paul Walker - American Hollywood actor most known from his role as Brian O’Conner from the fast and furious series"
            68 -> "Akira Toriyama - Japanese manga artist, character designer and Creator of the Dragon ball anime series"
            60 -> "Diego Maradona - Argentine professional football player and manager who is widely regarded as one of the greatest players in the history of football"
            50 -> "Michael Jackson - American singer, dancer, songwriter and philanthropist notably known as the “King of Pop”"
            97 -> "Kenneth Kaunda - Zambian politician who had served as the first president of the republic of Zambia from 1964 to 1991 being at the forefront in the struggle for Independence against British colonel rule"
            41 -> "Kobe Bryant - American professional basketball player for the Los Angeles Lakers and winner of five NBA championships, two-time NBA finals MVP and is widely regarded as being one of the greatest players in the history of Basketball."
            44 -> "Steve Irwin - Australian zookeeper, television personality, conservationist, animal wildlife educator and environmentalist most notably known as “The crocodile hunter”."
            25 -> "Tupac Shakur - American rapper and actor who is regarded by many as being one of the best rappers of all time."
            39 -> "Martin Luther King Junior - American Christian minister, political philosopher and activist who was one of the most prominent leaders of the civil rights movement from 1955 to 1968."
            81 -> "Winnie Mandela - South African politician, anti-apartheid activist, and second wife of Nelson Mandela."
            else -> null
        }
    }
}

