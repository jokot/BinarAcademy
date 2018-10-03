class User(var name: String,
           var age: Int
)

class UserLain {
    lateinit var name: String
    var age = 0
}

fun main(args: Array<String>) {
    val user = User("jokot", 19)
    user.age = 20

    println("${user.name} umurnya ${user.age}")

    val userLain = UserLain()
    userLain.name = "jokot"

    println("${userLain.name} umurnya ${userLain.age}")
}