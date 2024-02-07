

class Rectangle( //constructor put in parentheses, used to construct an object of a class. You have to define the data type
    val a: Double,
    val b: Double

)  {
    init {
        println("Rectangle created with a = $a and b = $b")
    }

    fun area() = a * b
    fun perimeter() = 2*(a + b)
    fun isSquare() = a == b

    //class objects and functions can be called in funs outside the classes by creating an instance of the class
}