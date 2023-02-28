package com.example.projectlessonssumin.domain

class AddFoodUseCase(private val interAllFun: AllFun) {

    fun addFood(food: ListFood) {
        interAllFun.addFood(food)
    }
}