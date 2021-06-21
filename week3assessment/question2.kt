fun main() {
    val how = "hello Adabe, how was your weekend?"
    val go = reverse(how)
    println(go)
}

fun reverse(str: String):
        String {
    var reverseString = ""
    for (i in str.length - 1 downTo 0) {
        reverseString += str[i]
    }
    return reverseString

}

