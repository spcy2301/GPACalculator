package com.example.gpacalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val toast = Toast.makeText(applicationContext, "Please fill in all fields!", Toast.LENGTH_LONG)
        var sum = 0
        var a = 0
        var b = 0
        var c = 0
        var d = 0
        var e = 0


        ok.setOnClickListener(){
            if(this.text1.text.toString()=="" && this.text2.text.toString()=="" && this.text3.text.toString()==""&& this.text4.text.toString()==""
                && this.text5.text.toString()==""){
                toast.show()
            }else
                if (this.cre1.text.toString()=="" && this.cre2.text.toString()=="" && this.cre3.text.toString()==""&& this.cre4.text.toString()==""
                    && this.cre5.text.toString()==""){
                    toast.show()
                }else
                    if (this.poi1.text.toString()=="" &&this.poi2.text.toString()==""&&this.poi3.text.toString()==""&&this.poi4.text.toString()==""
                        &&this.poi5.text.toString()==""){
                        toast.show()
                    }else
                            a = cre1.text.toString().toInt()
                            b = cre2.text.toString().toInt()
                            c = cre3.text.toString().toInt()
                            d = cre4.text.toString().toInt()
                            e = cre5.text.toString().toInt()
                            var t1 = poi1.text.toString().toDouble()
                            var t2 = poi2.text.toString().toDouble()
                            var t3 = poi3.text.toString().toDouble()
                            var t4 = poi4.text.toString().toDouble()
                            var t5 = poi5.text.toString().toDouble()
                            var a1:Double=cre1.text.toString().toDouble()
                            var a2:Double=cre2.text.toString().toDouble()
                            var a3:Double=cre3.text.toString().toDouble()
                            var a4:Double=cre4.text.toString().toDouble()
                            var a5:Double=cre5.text.toString().toDouble()
                    sum = a+b+c+d+e
                    total.setText(sum.toString())
                    var total1 = t1*a1
                    var total2 = t2*a2
                    var total3 = t3*a3
                    var total4  =t4*a4
                    var total5 = t5*a5
                    var totoo = total1+total2+total3+total4+total5
                    var gpa = totoo/sum
                    var gpaa= String.format("%.2f", gpa).toDouble()
                    sum3.setText("$gpaa")


        }
        clear.setOnClickListener(){
            text1.setText(null)
            text2.setText(null)
            text3.setText(null)
            text4.setText(null)
            text5.setText(null)
            cre1.setText(null)
            cre2.setText(null)
            cre3.setText(null)
            cre4.setText(null)
            cre5.setText(null)
            poi1.setText(null)
            poi2.setText(null)
            poi3.setText(null)
            poi4.setText(null)
            poi5.setText(null)

        }
    }
}