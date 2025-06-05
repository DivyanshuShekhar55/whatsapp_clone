package com.skywalker.whatsapp_clone.presentation.callscreen

data class CallItemModel(
    val image : Int,
    val name : String,
    val isMissedCall : Boolean,
    val lastCalledTime: String,
)
