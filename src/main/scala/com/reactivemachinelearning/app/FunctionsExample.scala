import org.apache.spark.{SparkContext, SparkConf}

object FunctionsExample extends App {

  val inputData = List(1.0, 2.0, 3.0)

  def average(observations: List[Double]) {
    observations.sum / observations.size
  }

  average(inputData)

  def add(x: Double, y: Double) = {
     x + y
  }

  val sum = inputData.foldLeft(0.0)(add)

  val average = sum / inputData.size

  println(average)

  println(inputData.foldLeft(0.0)(_ + _) / inputData.size)


  val conf = new SparkConf()
    .setAppName("FunctionsExample")
    .setMaster("local[*]")
  val sc = new SparkContext(conf)

  val observations = sc.parallelize(inputData)

  println(observations.fold(0.0)(_ + _) / observations.count())
}


