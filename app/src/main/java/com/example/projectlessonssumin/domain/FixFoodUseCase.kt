package com.example.projectlessonssumin.domain

class FixFoodUseCase(private val interAllFun: AllFun) {

    fun fixFood(food: ListFood) {
        interAllFun.fixFood(food)
    }
}