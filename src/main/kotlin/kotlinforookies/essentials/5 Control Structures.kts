package kotlinforookies.essentials

//Let's figure out if you're an adult
println("Type your age")

//1. Read the line just enter.
//2. Convert it to an Int (if it is possible, if not, return null (nothing)).
//3. If the Int is null, return 0
//4. Assign that to a variable called age
val age = readLine()?.toIntOrNull() ?: 0

if (age >= 18) {
    println("Your are an adult")
} else {
    println("You're a minor")
}

//We can write that even more concisely
if (age >= 18) println("Your are an adult") else println("You're a minor")

//Even more concise
println(if (age >= 18) "Your are an adult" else "You're a minor")

