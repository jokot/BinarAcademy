
fun added(a:Int, b:Int):Int {
    return a+b
}
fun reduced(a:Int, b:Int):Int{
    return a-b
}
fun multiplied(a:Int,b:Int):Int{
    return a*b
}
fun devided(a:Int, b:Int):Int{
    return a/b
}
fun main(args: Array<String>) {
    val a=10
    val b=10
    println("a = $a")
    println(b)
    println("a+b = ${added(a,b)}")
    println("a-b = ${reduced(a,b)}")
    println("a*b = ${multiplied(a,b)}")
    println("a/b = ${devided(a,b)}")

}
