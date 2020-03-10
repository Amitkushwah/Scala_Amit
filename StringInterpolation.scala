object StringInterpolation {
    def main(args: Array[String]){
        val name = "Amit"
        val age = 20
        println("My name is " + name + " and age is " + age + " years old")
        println(s"My name is $name and age is $age years old")
        println(f"My name is $name%s and age is $age%f year old")
    }
}