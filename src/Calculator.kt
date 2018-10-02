fun added(a:Int, b:Int):Int {
    return a+b
}
fun reduced(a:Int, b:Int):Int{
    return a-b
}
fun main(args: Array<String>) {
    val a=10
    val b=10
    println("a = $a")
    println(b)
    print("a+b = ${added(a,b)}")
    print("a*b = ${reduced(a,b)}")
}
