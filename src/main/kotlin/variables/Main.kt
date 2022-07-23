package variables

import kotlinx.datetime.LocalDate
import kotlinx.datetime.Month

val favLangauge : String? = null

fun main() {
    //val can be reassigned as it is final were as var can be reassigned

    //Name can not be changed after declaration
    val name = "Yusuf"

    //age can change after declaration
    var age = 15

    //every september the age is incremented by 1
    val currentDate: LocalDate = LocalDate.now()
    if (currentDate.month == Month.SEPTEMBER) {
        age++
    }

    //pretty useful
    when (favLangauge) {
        null -> println("Java is my favourite language")
        else -> println(favLangauge)
    }

    println("Name is $name and I am $age years old")
}