package com.example.projectlessonssumin.domain

interface AllFun {

    fun addFood(food: ListFood)

    fun fixFood(food: ListFood)

    fun getFoodForID (id: Int): ListFood

    fun getShopList(): List<ListFood>

    fun removeFood(food: ListFood)
}