fun main(args: Array<String>) {
    val a = arrayOf(1, 2, "yeah", 't', true, 1f)
    ArrayAny(a)
}

fun ArrayAny(array: Array<Any>) {
    for (i in array) {
        when (i) {
            is Int -> println("$i is Integer")
            is Char -> println("$i is Character")
            is Boolean -> println("$i is Boolean")
            is String -> println("$i is String")
            is Float -> println("$i is Float")
        }
    }
}
