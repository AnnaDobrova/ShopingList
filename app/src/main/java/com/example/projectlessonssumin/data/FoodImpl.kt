package com.example.projectlessonssumin.data

import com.example.projectlessonssumin.domain.AllFun
import com.example.projectlessonssumin.domain.ListFood

object FoodImpl : AllFun {

    private var counter = 0
    private val listFood = mutableListOf<ListFood>()

    override fun addFood(food: ListFood) {
        if (food.id == ListFood.COUNTER_ID){
           food.id = counter++
        }
        listFood.add(food)
    }

    override fun fixFood(food: ListFood) {
        val oldElement = getFoodForID(food.id)
        listFood.remove(oldElement)
        addFood(food)
    }

    override fun getFoodForID(id: Int): ListFood {
        return listFood.find {
            it.id == id
        } ?: throw java.lang.RuntimeException("ID with this number $id not found")
    }

    override fun getShopList(): List<ListFood> {
        return listFood.toList()
    }

    override fun removeFood(food: ListFood) {
        listFood.remove(food)
    }
}