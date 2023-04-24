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

class LoginActivity : AppCompatActivity() {

    private lateinit var db: FirebaseFirestore

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        db = Firebase.firestore
        val loginButton = findViewById<Button>(R.id.button_login_login)
        loginButton.setOnClickListener {
            login()
        }

        val signupButton = findViewById<Button>(R.id.button_login_signup)
        signupButton.setOnClickListener {
            val intent = Intent(this, SignupActivity::class.java)
            startActivity(intent)
        }
    }

    private fun login() {

        val emailInput = findViewById<EditText>(R.id.editText_login_email).text
        val passwordInput = findViewById<EditText>(R.id.editText_login_password).text

        var flag = false
        val loginMessage = findViewById<TextView>(R.id.textView_login_message)

        db.collection("login")
            .get()
            .addOnSuccessListener { result ->
                for (document in result) {
                    Log.d("GET LOGIN", "${document.id} => ${document.data}")
                    // set default variables plz
                    val person = document.toObject<User>()
                    println(person.email + ", " + person.password)
                    if (person.email == emailInput.toString() && person.password == passwordInput.toString()) {
                        println("OK")
                        loginMessage.setTextColor(Color.GREEN)
                        loginMessage.text = getString(R.string.login_message_correct)
                        flag = true
                        break
                    }
                }

                if (flag) {
                    val intent = Intent(this, MainActivity::class.java)
                    startActivity(intent)
                } else {
                    loginMessage.text = getString(R.string.login_message_wrong)
                    passwordInput.clear()
                }

            }
            .addOnFailureListener { exception ->
                Log.w("GET LOGIN", "Error getting documents. ", exception)
            }

        // 1st
        println("Getting Login")

    }
}