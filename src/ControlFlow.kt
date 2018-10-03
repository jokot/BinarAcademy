fun main(args: Array<String>) {
//
    val sesi: String? = "2"
    val materi: Any? = if (sesi!!.isNotEmpty()) sesi else "kosong"

    println(materi)

//
    if (sesi == 2.toString() && sesi.isNotEmpty()) {
        println("sesi $sesi")
    }
//
    for (i in 9 downTo 1) {
        println(i)
    }
//
    when {
        sesi.toInt() % 2 == 0 -> println("genap")
        sesi.toInt() % 2 == 1 -> println("ganjil")
        else -> println(null)
    }
//
    val item = arrayOf("a", 1, true, 3,'f')

    for (i in item) {
        println(i)
    }
//
    var a=10
    while(a<100){
        a++
        println(a)
    }

    do {
        println(a)
    }while (a<19)

//

}
