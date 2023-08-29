object TempConv {
  def avgeTemp(temps: List[Double]): Double = {
    val fTemps = temps.map(c => (c * 9.0/5.0) + 32.0)
    val sum = fTemps.reduce((t, x) => t + x)
    sum / fTemps.length
  }
  
  def main(args: Array[String]): Unit = {
    val temps = List(0, 10, 20, 30).map(_.toDouble) // Convert input to Double
    val avgTemp = avgeTemp(temps)
    println(s"Avg Fahrenheit temp: $avgTemp")
  }
}
