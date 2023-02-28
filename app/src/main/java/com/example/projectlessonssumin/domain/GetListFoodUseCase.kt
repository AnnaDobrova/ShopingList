package com.example.projectlessonssumin.domain

class GetListFoodUseCase( private val interAllFun: AllFun) {

    fun getShopList(): List<ListFood>{
       return interAllFun.getShopList()
    }
}