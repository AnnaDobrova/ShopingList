package com.example.projectlessonssumin.domain

class GetFoodForID(private val interAllFun: AllFun) {

    fun getFoodForID (id: Int): ListFood{
      return  interAllFun.getFoodForID(id)
    }
}