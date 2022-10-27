class Circle(private var radius: Double, private var color: String)  {

        constructor(): this(radius = 1.0, color = "red")

        constructor(radius: Double): this(radius, color = "red")

        fun getArea() = Math.PI * radius * radius

        fun getCircumference() = 2 * Math.PI * radius

        fun getColor() = color

        fun getDescription() = "Radius: ${radius.removeZero()}\t Color: $color"

    }

fun Double.removeZero(): String{
     val temp = this.toString()
        return if (temp.takeLast(2) == ".0") temp.substringBefore(".") else temp
}