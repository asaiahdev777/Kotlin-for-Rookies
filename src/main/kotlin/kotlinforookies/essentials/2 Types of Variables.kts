package kotlinforookies.essentials

val myString = "This is a string value" //holds text
println("String: $myString")

val myCharacter = 'A' //holds a single character
println("Character: $myCharacter")

val myInt = 1000 //holds a whole number (between -2147483648 & 2147483647)
println("Int: $myInt")

val myLong = 7000000000000  //holds a whole number (between -9223372036854775806L & 9223372036854775807L)
println("Long: $myLong")

val myFloat = 1.4F //holds a decimal number (between 1.4E-45F & 3.4028235E38F)
println("Float: $myFloat")

val myDouble = 1.4 //holds a decimal number (between 4.9E-324 & 1.7976931348623157E308)
println("Double: $myDouble")

val myBooleanTrue = true //a Boolean holds a true/false value
println("Boolean (true): $myBooleanTrue")

val myBooleanFalse = false //a Boolean holds a true/false value
println("Boolean (false): $myBooleanFalse")

//Lists can hold any kind of variable. Have a look:
val myListOfStrings = listOf("Hi,", "everyone.", "Welcome", "to", "Kotlin") //a list that holds strings
println("List of strings: $myListOfStrings")

val myListOfIntegers = listOf(1, 2, 4, 5, 10000, 345, 12) //a list that holds integers
println("List of integers: $myListOfIntegers")
println() //prints empty line

//It is also possible to explicitly state the variable type
//However, usually this is unnecessary, because the compiler can usually tell what kind of variable it is
val myCountry: String = "Canada"
println(myCountry)
val numberOfHoursInDay: Int = 24
println(numberOfHoursInDay)
println()

//Null means nothing
var myNullName: String? = null //If you want a variable to be null, you must explicitly set the type, followed by a ?
println(myNullName)

myNullName = "Henry Ford"
println(myNullName)