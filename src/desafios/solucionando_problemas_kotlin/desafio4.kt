const val MIN_TESTS = 1
const val MAX_TESTS = 500
private const val LEVEL_ONE = 9
private const val LEVEL_TWO = 19

fun main(){

   val numberTests = readLine()!!.toInt()

   if (numberTests > MIN_TESTS && numberTests <=MAX_TESTS) {
      for (i in MIN_TESTS..MAX_TESTS){
         val turtleLevel = identifyTurtleLevel()
         println(turtleLevel)
      }
   }
}


fun identifyTurtleLevel():Int {
   val strListSpeedTurtles:List<String> = readLine()!!.split(" ")

   val listSpeedTurtles = strListSpeedTurtles.map { it.toInt() }

   val turtleMaxSpeed:Int = listSpeedTurtles.max() as Int

   when{
      turtleMaxSpeed <= LEVEL_ONE -> return 1
      turtleMaxSpeed <= LEVEL_TWO -> return 2
      else -> return 3
   }
}

