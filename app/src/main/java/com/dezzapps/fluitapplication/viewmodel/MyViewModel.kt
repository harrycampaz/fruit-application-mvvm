package com.dezzapps.fluitapplication.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.dezzapps.fluitapplication.domain.FruitUseCase
import com.dezzapps.fluitapplication.ui.models.Fruit

class MyViewModel: ViewModel() {

    private val fruitUseCase = FruitUseCase()
    private val listData = MutableLiveData<List<Fruit>>()

    init {
        getListFruits()
    }

    fun setListData(listFruits: List<Fruit>){

        listData.value = listFruits

    }

    private fun getListFruits(){
        setListData(fruitUseCase.getListFruits())
    }

    fun getListFruitLiveData(): LiveData<List<Fruit>>{
        return listData
    }

}