package com.dezzapps.fluitapplication.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import com.dezzapps.fluitapplication.R
import com.dezzapps.fluitapplication.ui.models.Fruit
import com.dezzapps.fluitapplication.viewmodel.MyViewModel

class MainActivity : AppCompatActivity() {

    private lateinit var viewModel: MyViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

       viewModel = ViewModelProviders.of(this).get(MyViewModel::class.java)
        val fruitObserver = Observer<List<Fruit>> {
            for(fruit in it){
                Log.d("Lista de frutas", fruit.name)
            }

            for((index, fruit) in it.withIndex()){
                Log.d("Lista de frutas $index", fruit.name)
            }

        }

        viewModel.getListFruitLiveData().observe(this, fruitObserver)

    }
}
