// Kotlin Beginner Assignment
// Author: Raphael Oluwashina (RAFMAN)
// Course: Software Engineering

fun main() {

    // Variables
    val studentName = "Raphael Oluwashina"
    val nickname = "RAFMAN"
    val university = "Ahmadu Bello University"
    val course = "Computer Engineering"

    // Display information
    println("Welcome to my first Kotlin program!")
    println("-----------------------------------")
    println("Name: $studentName")
    println("Nickname: $nickname")
    println("University: $university")
    println("Course: $course")

    println("\nLearning Kotlin Programming...")

    // Simple function call
    greetUser(studentName)

    // Simple calculation
    val result = addNumbers(5, 7)
    println("Example of a simple calculation: 5 + 7 = $result")
}

// Function to greet user
fun greetUser(name: String) {
    println("Hello $name! This is my Kotlin assignment submission.")
}

// Function to add two numbers
fun addNumbers(a: Int, b: Int): Int {
    return a + b
}
