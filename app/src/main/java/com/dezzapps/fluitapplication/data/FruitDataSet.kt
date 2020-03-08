package com.dezzapps.fluitapplication.data

import com.dezzapps.fluitapplication.ui.models.Fruit

class FruitDataSet {

    fun createListFruit(): List<Fruit>{

        return listOf(
            Fruit("manzana", "Rojo", 1000.0f, 200.0f),
            Fruit("Pera", "Verde", 1200.0f, 300.0f),
            Fruit("Banana", "Amarillo", 100.0f, 100.0f),
        Fruit("Uvas", "Morado", 500.0f, 100.0f),
        Fruit("Naranja", "Amarillo", 700.0f, 100.0f),
        Fruit("melocoton", "amarillo", 200.0f, 100.0f))

    }
}