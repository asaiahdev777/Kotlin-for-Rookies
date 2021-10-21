package kotlinforookies.essentials

//Methods/functions are blocks of code that do something
//They can take input called arguments (not always) and can output something in return (not always).
//Take a look:
fun printMyFullName(
    firstName: String /*firstName must be a String*/,
    lastName: String /*lastName must be a String*/
) {
    println("My full name is $firstName $lastName")
}

fun printMyAge() {
    println("My age is 16")
}

//To call a method/function, we write the function name, and pass the arguments inside the parentheses
printMyFullName("Asaiah", "Toutouyoutte")
//We can also directly name the arguments like this:
printMyFullName(lastName = "Toutouyoutte", firstName = "Asaiah")
//Or like this
printMyFullName(firstName = "Asaiah", lastName = "Toutouyoutte")
//No arguments to pass
printMyAge()
println() //Just adding a linebreak


//If there's a default value for an argument, you don't need to pass a value
fun printMyFullNameAndAge(
    firstName: String = "John" /*firstName must be a String, and the default value is "John"*/,
    lastName: String = "Doe" /*lastName must be a String, and the default value is "Doe"*/,
    age: Int = 30 /*age must be an Int, and the default value is 39*/
) {
    println("My name is $firstName $lastName and I am $age years old")
}

printMyFullNameAndAge() //Outputs: My name is John Doe and I am 30 years old
printMyFullNameAndAge(age = 35) //Outputs: My name is John Doe and I am 35 years old
printMyFullNameAndAge(lastName = "Doug") //Outputs: My name is John Doug and I am 35 years old
printMyFullNameAndAge(lastName = "Donald", age = 75) //Outputs: My name is John Donald and I am 75 years old
println() //Just adding a linebreak


//If there's a default value for an argument, you don't need to pass a value
fun printMyFullNameAgeCountry(
    firstName: String = "John" /*firstName must be a String, and the default value is "John"*/,
    lastName: String = "Doe" /*lastName must be a String, and the default value is "Doe"*/,
    age: Int /*age must be an Int. There's no default value, so it must be provided*/,
    country: String /*country must be a String. There's no default value, so it must be provided*/
) {
    println("My name is $firstName $lastName and I am $age years old. I am from $country.")
}


//Outputs: My name is Asaiah Toutouyoutte and I am 17 years old. I am from Canada.
printMyFullNameAgeCountry("Asaiah", "Toutouyoutte", 17, "Canada")
//Outputs: My name is John Doe and I am 17 years old. I am from India.
printMyFullNameAgeCountry(age = 17, country = "India")
//Outputs: My name is Colton Dixon and I am 17 years old. I am from India.
printMyFullNameAgeCountry(age = 23, firstName = "Colton", country = "the USA", lastName = "Dixon")