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
    num.take(3).foreach(println) // use take() to take just a few to print out:
  }


}

