package com.example.a121140139_pam_latihan_8

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "users")
data class User(
    @PrimaryKey(autoGenerate = true)
    val id: Long = 0,
    val username: String,
    val email: String,
    val firstName: String,
    val lastName: String,
    val avatar: String
)