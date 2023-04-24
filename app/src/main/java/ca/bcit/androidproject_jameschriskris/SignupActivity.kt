package ca.bcit.androidproject_jameschriskris

import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import com.google.firebase.firestore.FirebaseFirestore
import com.google.firebase.firestore.ktx.firestore
import com.google.firebase.firestore.ktx.toObject
import com.google.firebase.ktx.Firebase

class SignupActivity : AppCompatActivity() {

    private lateinit var db: FirebaseFirestore

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signup)

        db = Firebase.firestore
        val signupButton = findViewById<Button>(R.id.button_signup_signup)
        signupButton.setOnClickListener {
            checkSignup()
        }
        val loginButton = findViewById<Button>(R.id.button_signup_login)
        loginButton.setOnClickListener {
            val intent = Intent(this, LoginActivity::class.java)
            startActivity(intent)
        }
    }

    private fun checkSignup() {

        val emailInput = findViewById<EditText>(R.id.editText_signup_email).text
        val passwordInput = findViewById<EditText>(R.id.editText_signup_password).text
        val passwordConfirm = findViewById<EditText>(R.id.editText_signup_password2).text

        var flag = false
        val signupMessage = findViewById<TextView>(R.id.textView_signup_message)

        if (passwordInput.toString() == passwordConfirm.toString()) {
            db.collection("login")
                .get()
                .addOnSuccessListener { result ->
                    for (document in result) {
                        Log.d("GET LOGIN", "${document.id} => ${document.data}")
                        // set default variables plz
                        val person = document.toObject<User>()
                        println(person.email)
                        if (person.email == emailInput.toString()) {
                            println("OK")
                            signupMessage.text = getString(R.string.signup_message_taken)
                            flag = true
                            break
                        }
                    }

                    if (!flag) {
                        signupMessage.setTextColor(Color.GREEN)
                        signupMessage.text = getString(R.string.signup_message_success)
                        signup(emailInput.toString(), passwordInput.toString())
                        val intent = Intent(this, LoginActivity::class.java)
                        startActivity(intent)
                    }

                }
                .addOnFailureListener { exception ->
                    Log.w("GET LOGIN", "Error getting documents. ", exception)
                }
        } else {
            passwordConfirm.clear()
            signupMessage.text = getString(R.string.signup_message_wrongPass)
        }


        // 1st
        println("Getting Login")

    }

    private fun signup (email: String, password: String) {
        println("signing up")
        val user = User(email, password)

        db.collection("login")
            .add(user)
            .addOnSuccessListener { documentReference ->
                Log.d("ADD LOGIN", "DocumentSnapshot added with ID: ${documentReference.id}")

                // 2nd
            }
            .addOnFailureListener { e->
                Log.w("ADD PERSON", "Error handing document", e)
            }

        // 1st
        println("Adding!")
    }


}