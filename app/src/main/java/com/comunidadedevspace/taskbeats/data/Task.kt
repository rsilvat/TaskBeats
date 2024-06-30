package com.comunidadedevspace.taskbeats.data


import androidx.room.Entity
import androidx.room.PrimaryKey
import java.io.Serializable
import java.net.IDN

@Entity
data class Task(
    @PrimaryKey (autoGenerate = true)
    val id: Int = 0,
    val title:String,
    val description: String):
    java.io.Serializable
