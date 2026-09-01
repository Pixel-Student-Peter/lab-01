package com.example.petshop

abstract class Mood(date: String) {
    abstract fun currentMood(): String
}