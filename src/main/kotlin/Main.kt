package org.example

fun main() {

    println("--${YELLOW_BOLD_BRIGHT}PASTES${RESET}--")
    var donut:Pasta = Pasta("Donut",300, 52,2.95)
    var croissant:Pasta = Pasta("Croissant",406, 120, 2.45)
    var ensaimada:Pasta = Pasta("Ensaimada", 355, 300, 11.8)

    println(donut)
    println(croissant)
    println(ensaimada)
    println("${CYAN_BOLD_BRIGHT}----------------${RESET}")
    println()
    println("--${GREEN_BOLD_BRIGHT}BEGUDES${RESET}--")

    var aigua:Beguda = Beguda("Aigua", 0.75,false)
    var cafe:Beguda = Beguda("Café", 1.15,true)
    var teVermell:Beguda = Beguda("Té Vermell", 1.5,true)
    var cocaCola:Beguda = Beguda("CocaCola", 2.35,true)

    println(aigua)
    println(cafe)
    println(teVermell)
    println(cocaCola)



}