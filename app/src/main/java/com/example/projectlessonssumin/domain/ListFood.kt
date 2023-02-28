package com.example.projectlessonssumin.domain

data class ListFood(
    val name: String,
    val count: Int,
    val enable: Boolean,
    var id: Int = COUNTER_ID
){
    companion object{
        const val COUNTER_ID = -1
    }
}
