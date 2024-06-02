package ru.netology

fun main() {
    val likes = 21
    if(likes%10==1 && likes!=11){
        println("Понравилось $likes человеку")
    }else{
        println("Понравилось $likes людям")
    }
}
