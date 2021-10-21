package kotlinforookies.essentials

//A class is code structure that is used to represent a concept (a blueprint)
//Classes contain variables, properties, and methods
//An object is an actual instance of a class

class Person
    ( //Start of constructor
    val firstName: String = "John" /*Constructor parameters can have default arguments too.*/,
    val lastName: String = "Doe",
    var age: Int,
    var country: String
) /*End of constructor*/ {

    //The intializer function is called when the object is first instantiated
    init {
        println("Thanks for brining me to life.")
    }

    fun getFullName() = "$firstName $lastName"

    fun printFullName() = println("I am " + getFullName()) //or "I am ${getFullName()}"

    fun printAge() = println("I am $age years old")

    fun introducePerson() = println("Hi! My name is ${getFullName()}. I am $age years old and I hail from $country")

    fun immigrate(newCountry: String) {
        println("See, I am from $country. I am moving to $newCountry.")
        country = newCountry
        println("I'll reveal my new identity")
        introducePerson()
    }

}

val colombianMan = Person(age = 10, country = "Colombia", firstName = "Carlos", lastName = "Merinda")
colombianMan.introducePerson() //To call a method on an object, type the object/variable name, dot, then the method name

println()

val chineseMan = Person(firstName = "Li", lastName = "Feng", age = 23, country = "China")
chineseMan.immigrate("South Korea")

println()

val frenchWoman = Person(firstName = "Marie", lastName = "St. Louis", age = 23, country = "France")
frenchWoman.introducePerson()
frenchWoman.age = frenchWoman.age + 15 //Age is a property of the Person class
frenchWoman.introducePerson()

println()

//Look at this (interesting, hmmn?)
frenchWoman.age = colombianMan.age + chineseMan.age + frenchWoman.age
frenchWoman.country = "Cuba"
frenchWoman.introducePerson()