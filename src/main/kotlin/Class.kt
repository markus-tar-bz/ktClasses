fun main() {
    val myRect = Rectangle(4.0, 7.0) //Here only the init block runs.
    //myRect is an instance of our rectangle class used to call class functions and objects
    println("Rectangle area is ${myRect.area()}")
    println("Rectangle perimeter is ${myRect.perimeter()}")
    println("Is Rectangle square? ${myRect.isSquare()}")

    val myCircle = Circle(5.0) //instance of the circle class
    val myCircle1 = Circle(7.0) // instance of the circle class

    Triangle(2.0, 4.0, 6.0)
    Circle(5.0)
    //classes can be called directly if we don't want to call class functions and objects. Only the init block.

}

fun classs() { //classes can be called directly to functions outside the classes/non-class functions
    val myRect =
        Rectangle(4.0, 7.0) //myRect is an instance of our rectangle class used to call class functions and objects
    val x: Int = 0
    println("Rectangle area is ${myRect.area()}")
    println("Rectangle perimeter is ${myRect.perimeter()}")
    println("Is Rectangle square? ${myRect.isSquare()}")

    val myCircle = Circle(5.0) //instance of the circle class
    val myCircle1 = Circle(7.0) // instance of the circle class

    Triangle(2.0, 4.0, 6.0)
}
