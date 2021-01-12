import org.apache.spark.sql.SparkSession

object BasicActTransform {
  def main(args: Array[String]): Unit = {
    val appName = "Actions and Transformations"
    val master = "local"
    val spark = SparkSession
      .builder
      .appName(appName)
      .master(master)
      .getOrCreate()

    // sparkContext exists in sparkSessions, that defined in val spark
    val num = spark.sparkContext.parallelize(List(1, 2, 3))

    // prints each element of RDD
    //prints 1 2 3 on separate line
    num.collect().foreach(println) // collect is not a good idea, though, when the RDD has billions of lines.
    num.take(3).foreach(println) // use take() to take just a few to print out

    // filter
    val equal_two = num.filter(x => x == 2)
    equal_two.collect().foreach(println) // prints 2

    //map
    import scala.math.pow
    val squares_ = num.map(x => x * x )
    squares_.collect().foreach(println) // prints 1, 4, 9

    //flatMap
    num.flatMap(x => 0.to(x)).collect().foreach(println) // prints 0, 1, 0, 1, 2, 0, 1, 2, 3
  }


}
