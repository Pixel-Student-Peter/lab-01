package com.example.petshop

class Angry(date: String): Mood(date) {
    override fun currentMood(): String {
        return "Currently angry"
    }
}