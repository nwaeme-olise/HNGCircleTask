fun main() {
    val circle1 = Circle()
    val circle2 = Circle(2.0)
    val circle3 = Circle(2.0, "blue")

    val circleList: List<Circle> = listOf(circle1, circle2, circle3)

    var i = 1
    for (circle in circleList){
        println("Circle $i\nArea: ${circle.getArea()}\nCircumference: ${circle.getCircumference()}\nDescription: ${circle.getDescription()}\nColor: ${circle.getColor()}\n")
        i++
    }
}