fun main(args: Array<String>) {
    println(loveCheck(2,6))
}
fun loveCheck(boy: Int, gal: Int): Boolean {
    var fPetal = boy % 2 == 0
    var sPetal = gal % 2 == 1

    return fPetal == sPetal
}