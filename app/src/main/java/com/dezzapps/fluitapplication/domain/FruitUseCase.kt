package com.dezzapps.fluitapplication.domain

import com.dezzapps.fluitapplication.data.FruitDataSet
import com.dezzapps.fluitapplication.ui.models.Fruit

class FruitUseCase {

    val fruitDataSet = FruitDataSet()

    fun getListFruits(): List<Fruit>{
        return fruitDataSet.createListFruit()
    }
}