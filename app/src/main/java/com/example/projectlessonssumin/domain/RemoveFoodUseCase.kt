package com.example.projectlessonssumin.domain

class RemoveFoodUseCase(private val interAllFun: AllFun) {

    fun removeFood(food: ListFood) {
        interAllFun.removeFood(food)
    }
}