fun main(){
    println(evenlySpaced(2,4,6))
}
fun evenlySpaced(a: Int, b: Int, c: Int): Boolean{
    var one: Int = a - b
    var two: Int = b - c
    return one == two
}































