package com.krashkrosh748199.spinner

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Spinner
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val spFirst=findViewById<Spinner>(R.id.spMonths)

        val customList= listOf("First","Second","Third","Fourth")
        val adapter=ArrayAdapter<String>(this, androidx.appcompat.R.layout.support_simple_spinner_dropdown_item,customList)
       spFirst.adapter=adapter



        spFirst.onItemSelectedListener = object:AdapterView.OnItemSelectedListener{

            override fun onNothingSelected(p0: AdapterView<*>?) {

            }
            override fun onItemSelected(adapterView: AdapterView<*>?, view: View?, position: Int, id: Long) {
Toast.makeText(this@MainActivity,
    "you selected ${adapterView?.getItemAtPosition(position).toString()}",
    Toast.LENGTH_LONG).show()
            }

        }

    }
}