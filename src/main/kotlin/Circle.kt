import kotlin.math.PI

class Circle(
    val radius: Double
) {
    init {
        println("Circle created with radius = $radius")
        println("Circle area is ${area()}")
        println("Circle perimeter is ${perimeter()}")

    }
    fun area() = radius * radius * PI
    fun perimeter() = 2 * PI * radius

    //class objects and functions can be called in funs outside the classes by creating an instance of the class
}