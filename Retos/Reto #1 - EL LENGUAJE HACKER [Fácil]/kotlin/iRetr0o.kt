fun main() {
    println(leetCode(word = "1337"))
    println(leetCode(word = "Texto de prueba para comprobar que funciona"))
}

fun leetCode(word: String): String {
    val leetDictionary = mapOf("A" to "4", "B" to "I3", "C" to "[", "D" to ")", "E" to "3", "F" to "|=", "G" to "&", "H" to "#", "I" to "1", "J" to ",_|", "K" to ">|", "L" to "1", "M" to "/\\/\\", "N" to "^/", "O" to "0", "P" to "|*", "Q" to "(_,)", "R" to "I2", "S" to "5", "T" to "7", "U" to "(_)", "V" to "\\/", "W" to "\\/\\/", "X" to "><", "Y" to "j", "Z" to "2", "1" to "L", "2" to "R", "3" to "E", "4" to "A", "5" to "S", "6" to "b", "7" to "T", "8" to "B", "9" to "g", "0" to "o")

    var leetWord = ""
    for (letter in word) {
        leetWord += leetDictionary[letter.uppercase()] ?: letter
    }

    return leetWord
}