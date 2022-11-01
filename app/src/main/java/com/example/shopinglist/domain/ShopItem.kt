package com.example.shopinglist.domain

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.google.gson.annotations.SerializedName

@Entity
data class ShopItem(
    @SerializedName("localized_name")
    val name: String,
    @Transient
    val count: Int,
    @Transient
    val enabled: Boolean,
    @PrimaryKey
    var id: Int = UNDEFINED_ID
) {
    companion object {
        const val UNDEFINED_ID = -1
    }
}