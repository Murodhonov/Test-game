package com.example.testgame

import android.annotation.SuppressLint
import android.graphics.Color
import android.graphics.Color.parseColor
import android.os.Build
import android.os.Bundle
import android.view.View
import android.widget.*
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import java.util.*

class MainActivity : AppCompatActivity() {

    private var javob = 0
    private var ans = 0
    private var correct = 0
    private var wrong = 0

    private var random1 = Random().nextInt(20)
    private var random2 = Random().nextInt(20)
    private var random3 = Random().nextInt(20)

    private val amal = Random().nextInt(4)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        actionBar?.hide()

        random()

        findViewById<LinearLayout>(R.id.answer1).setOnClickListener {
            findViewById<LinearLayout>(R.id.answer2).isEnabled = false
            findViewById<LinearLayout>(R.id.answer3).isEnabled = false
            findViewById<LinearLayout>(R.id.answer4).isEnabled = false
            if (findViewById<TextView>(R.id.ans1).text.toString().toInt() == javob) {
                Toast.makeText(this, "To'g'ri javob", Toast.LENGTH_SHORT).show()
                findViewById<ImageView>(R.id.img1).setImageResource(R.drawable.icons8_checkmark_48px_1)
                findViewById<ImageView>(R.id.img1).visibility = View.VISIBLE
                findViewById<ImageView>(R.id.img1).setColorFilter(Color.GREEN)
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
                    findViewById<LinearLayout>(R.id.a).background.setTint(ContextCompat.getColor(this, R.color.green))
                }
                findViewById<TextView>(R.id.ans1).setTextColor(Color.GREEN)
                ans = 1
                correct++

            } else {
                Toast.makeText(this, "Noto'g'ri javob", Toast.LENGTH_SHORT).show()
                findViewById<ImageView>(R.id.img1).setImageResource(R.drawable.icons8_multiply_100px_2)
                findViewById<ImageView>(R.id.img1).visibility = View.VISIBLE
                findViewById<ImageView>(R.id.img1).setColorFilter(Color.RED)
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
                    findViewById<LinearLayout>(R.id.a).background.setTint(
                        ContextCompat.getColor(
                            this,
                            R.color.red
                        )
                    )
                }
                findViewById<TextView>(R.id.ans1).setTextColor(Color.RED)
                ans = 1
                wrong++
            }
            findViewById<TextView>(R.id.correct).text = correct.toString()
            findViewById<TextView>(R.id.wrong).text = wrong.toString()

        }
        findViewById<LinearLayout>(R.id.answer2).setOnClickListener {
            findViewById<LinearLayout>(R.id.answer1).isEnabled = false
            findViewById<LinearLayout>(R.id.answer3).isEnabled = false
            findViewById<LinearLayout>(R.id.answer4).isEnabled = false
            if (findViewById<TextView>(R.id.ans2).text.toString().toInt() == javob) {
                Toast.makeText(this, "To'g'ri javob", Toast.LENGTH_SHORT).show()
                findViewById<ImageView>(R.id.img2).setImageResource(R.drawable.icons8_checkmark_48px_1)
                findViewById<ImageView>(R.id.img2).visibility = View.VISIBLE
                findViewById<ImageView>(R.id.img2).setColorFilter(Color.GREEN)
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
                    findViewById<LinearLayout>(R.id.b).background.setTint(
                        ContextCompat.getColor(
                            this,
                            R.color.green
                        )
                    )
                }
                findViewById<TextView>(R.id.ans2).setTextColor(Color.GREEN)
                ans = 2
                correct++
            } else {
                Toast.makeText(this, "Noto'g'ri javob", Toast.LENGTH_SHORT).show()
                findViewById<ImageView>(R.id.img2).setImageResource(R.drawable.icons8_multiply_100px_2)
                findViewById<ImageView>(R.id.img2).visibility = View.VISIBLE
                findViewById<ImageView>(R.id.img2).setColorFilter(Color.RED)
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
                    findViewById<LinearLayout>(R.id.b).background.setTint(
                        ContextCompat.getColor(
                            this,
                            R.color.red
                        )
                    )
                }
                findViewById<TextView>(R.id.ans2).setTextColor(Color.RED)
                ans = 2
                wrong++
            }
            findViewById<TextView>(R.id.correct).text = correct.toString()
            findViewById<TextView>(R.id.wrong).text = wrong.toString()

        }
        findViewById<LinearLayout>(R.id.answer3).setOnClickListener {
            findViewById<LinearLayout>(R.id.answer1).isEnabled = false
            findViewById<LinearLayout>(R.id.answer2).isEnabled = false
            findViewById<LinearLayout>(R.id.answer4).isEnabled = false
            if (findViewById<TextView>(R.id.ans3).text.toString().toInt() == javob) {
                Toast.makeText(this, "To'g'ri javob", Toast.LENGTH_SHORT).show()
                findViewById<ImageView>(R.id.img3).setImageResource(R.drawable.icons8_checkmark_48px_1)
                findViewById<ImageView>(R.id.img3).visibility = View.VISIBLE
                findViewById<ImageView>(R.id.img3).setColorFilter(Color.GREEN)
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
                    findViewById<LinearLayout>(R.id.c).background.setTint(
                        ContextCompat.getColor(
                            this,
                            R.color.green
                        )
                    )
                }
                findViewById<TextView>(R.id.ans3).setTextColor(Color.GREEN)
                ans = 3
                correct++

            } else {
                Toast.makeText(this, "Noto'g'ri javob", Toast.LENGTH_SHORT).show()
                findViewById<ImageView>(R.id.img3).setImageResource(R.drawable.icons8_multiply_100px_2)
                findViewById<ImageView>(R.id.img3).visibility = View.VISIBLE
                findViewById<ImageView>(R.id.img3).setColorFilter(Color.RED)

                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
                    findViewById<LinearLayout>(R.id.c).background.setTint(
                        ContextCompat.getColor(
                            this,
                            R.color.red
                        )
                    )
                }
                findViewById<TextView>(R.id.ans3).setTextColor(Color.RED)
                ans = 3
                wrong++
            }
            findViewById<TextView>(R.id.correct).text = correct.toString()
            findViewById<TextView>(R.id.wrong).text = wrong.toString()

        }
        findViewById<LinearLayout>(R.id.answer4).setOnClickListener {
            findViewById<LinearLayout>(R.id.answer1).isEnabled = false
            findViewById<LinearLayout>(R.id.answer2).isEnabled = false
            findViewById<LinearLayout>(R.id.answer3).isEnabled = false
            if (findViewById<TextView>(R.id.ans4).text.toString().toInt() == javob) {
                Toast.makeText(this, "To'g'ri javob", Toast.LENGTH_SHORT).show()
                findViewById<ImageView>(R.id.img4).setImageResource(R.drawable.icons8_checkmark_48px_1)
                findViewById<ImageView>(R.id.img4).visibility = View.VISIBLE
                findViewById<ImageView>(R.id.img4).setColorFilter(Color.GREEN)
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
                    findViewById<LinearLayout>(R.id.d).background.setTint(
                        ContextCompat.getColor(
                            this,
                            R.color.green
                        )
                    )
                }
                findViewById<TextView>(R.id.ans4).setTextColor(Color.GREEN)
                ans = 4
                correct++
            } else {
                Toast.makeText(this, "Noto'g'ri javob", Toast.LENGTH_SHORT).show()
                findViewById<ImageView>(R.id.img4).setImageResource(R.drawable.icons8_multiply_100px_2)
                findViewById<ImageView>(R.id.img4).visibility = View.VISIBLE
                findViewById<ImageView>(R.id.img4).setColorFilter(Color.RED)
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
                    findViewById<LinearLayout>(R.id.d).background.setTint(
                        ContextCompat.getColor(
                            this,
                            R.color.red
                        )
                    )
                }
                findViewById<TextView>(R.id.ans4).setTextColor(Color.RED)
                ans = 4
                wrong++
            }
            findViewById<TextView>(R.id.correct).text = correct.toString()
            findViewById<TextView>(R.id.wrong).text = wrong.toString()
        }

        findViewById<Button>(R.id.btn).setOnClickListener {
            if (ans == 0) {
                Toast.makeText(this, "Javob belgilanmadi !!", Toast.LENGTH_SHORT).show()
            } else {
                findViewById<ProgressBar>(R.id.loader).progress = findViewById<ProgressBar>(R.id.loader).progress + 10
                random()
            }
        }

    }

    @SuppressLint("SetTextI18n")
    private fun random() {

        findViewById<LinearLayout>(R.id.answer4).isEnabled = true
        findViewById<LinearLayout>(R.id.answer1).isEnabled = true
        findViewById<LinearLayout>(R.id.answer2).isEnabled = true
        findViewById<LinearLayout>(R.id.answer3).isEnabled = true

        if (findViewById<ProgressBar>(R.id.loader).progress == 100) {

            val view = View.inflate(this,R.layout.dialog,null)
            "Correct Answers: \n$correct".also { view.findViewById<TextView>(R.id.correctans).text = it }
            view.findViewById<TextView>(R.id.wrongans).text = "Wrong Answers: \n$wrong"
            val builder = AlertDialog.Builder(this)
            builder.setView(view)
            val dialog = builder.create()
            dialog.show()
            dialog.window?.setBackgroundDrawableResource(android.R.color.transparent)
            findViewById<ProgressBar>(R.id.loader).progress = 0
            findViewById<TextView>(R.id.wrong).text = 0.toString()
            findViewById<TextView>(R.id.correct).text = 0.toString()
            correct=0
            wrong=0
            random()
        } else {
            findViewById<ImageView>(R.id.img1).visibility = View.GONE
            findViewById<ImageView>(R.id.img1).setColorFilter(parseColor("#252a40"))
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
                findViewById<LinearLayout>(R.id.a).background.setTint(
                    ContextCompat.getColor(
                        this,
                        R.color.purple_700
                    )
                )
            }
            findViewById<TextView>(R.id.ans1).setTextColor(parseColor("#252a40"))


            findViewById<ImageView>(R.id.img2).visibility = View.GONE
            findViewById<ImageView>(R.id.img2).setColorFilter(parseColor("#252a40"))
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
                findViewById<LinearLayout>(R.id.b).background.setTint(
                    ContextCompat.getColor(
                        this,
                        R.color.purple_700
                    )
                )
            }
            findViewById<TextView>(R.id.ans2).setTextColor(parseColor("#252a40"))

            findViewById<ImageView>(R.id.img3).visibility = View.GONE
            findViewById<ImageView>(R.id.img3).setColorFilter(parseColor("#252a40"))
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
                findViewById<LinearLayout>(R.id.c).background.setTint(
                    ContextCompat.getColor(
                        this,
                        R.color.purple_700
                    )
                )
            }
            findViewById<TextView>(R.id.ans3).setTextColor(parseColor("#252a40"))

            findViewById<ImageView>(R.id.img4).visibility = View.GONE
            findViewById<ImageView>(R.id.img4).setColorFilter(parseColor("#252a40"))
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
                findViewById<LinearLayout>(R.id.d).background.setTint(
                    ContextCompat.getColor(
                        this,
                        R.color.purple_700
                    )
                )
            }
            findViewById<TextView>(R.id.ans4).setTextColor(parseColor("#252a40"))


            ans = 0

            when (amal) {
                0 -> {
                    findViewById<TextView>(R.id.txt_1).text = "$random1 + $random2 = "
                    javob = random1 + random2
                }

                1 -> {
                    findViewById<TextView>(R.id.txt_1).text = "$random1 - $random2 = "
                    javob = random1 - random2
                }

                2 -> {
                    findViewById<TextView>(R.id.txt_1).text = "$random1 * $random2 = "
                    javob = random1 * random2
                }

                3 -> {
                    try {
                        if (random1 % random2 != 0) throw Exception()
                        findViewById<TextView>(R.id.txt_1).text = "$random1 / $random2 = "
                        javob = random1 / random2
                    } catch (e: Exception) {
                        random()
                    }

                }
            }

            radEkranYoz()
        }

    }

    private fun randomSonAniqla() {
        random1 = Random().nextInt(20)
        random2 = Random().nextInt(20)
        random3 = Random().nextInt(20)

        if (random1 == random2 || random2 == random3 || random3 == random1) {
            randomSonAniqla()
        }
    }

    private fun radEkranYoz() {
        val tj = Random().nextInt(4)
        randomSonAniqla()

        when (tj) {
            0 -> {
                findViewById<TextView>(R.id.ans1).text = javob.toString()
                findViewById<TextView>(R.id.ans2).text = random1.toString()
                findViewById<TextView>(R.id.ans3).text = random2.toString()
                findViewById<TextView>(R.id.ans4).text = random3.toString()
            }
            1 -> {
                findViewById<TextView>(R.id.ans2).text = javob.toString()
                findViewById<TextView>(R.id.ans1).text = random1.toString()
                findViewById<TextView>(R.id.ans3).text = random2.toString()
                findViewById<TextView>(R.id.ans4).text = random3.toString()
            }
            2 -> {
                findViewById<TextView>(R.id.ans3).text = javob.toString()
                findViewById<TextView>(R.id.ans2).text = random1.toString()
                findViewById<TextView>(R.id.ans1).text = random2.toString()
                findViewById<TextView>(R.id.ans4).text = random3.toString()
            }
            3 -> {
                findViewById<TextView>(R.id.ans4).text = javob.toString()
                findViewById<TextView>(R.id.ans2).text = random1.toString()
                findViewById<TextView>(R.id.ans3).text = random2.toString()
                findViewById<TextView>(R.id.ans1).text = random3.toString()
            }
        }
    }
}