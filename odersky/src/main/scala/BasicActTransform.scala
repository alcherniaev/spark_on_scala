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



    // Transformations


    // filter
    val equal_two = num.filter(x => x == 2)
    equal_two.collect().foreach(println) // prints 2

    //map
    import scala.math.pow
    val squares_ = num.map(x => x * x )
    squares_.collect().foreach(println) // prints 1, 4, 9

    //flatMap
    num.flatMap(x => 0.to(x)).collect().foreach(println) // prints 0, 1, 0, 1, 2, 0, 1, 2, 3

    // mapPartition
    val nump = num.mapPartitions(x => x.map(x => x * x)) // pass each partition through a function
    nump.collect().foreach(println) // prints 1, 4, 9


    // union, intersect, cartesian
    val num2 = spark.sparkContext.parallelize(List(3, 4, 5))

    num.union(num2).collect().foreach(println)
    num.intersection(num2).collect().foreach(println)
    num.cartesian(num2).collect().foreach(println)


    // Actions

    num.collect()
    num.take(2)
    num.count()
    num.reduce((x, y) => x + y)
    //num.saveAsTextFile("hdfs://file.txt")

    // Some Key-Value Operators

    // reduceByKey
    val pets = spark.sparkContext.parallelize(
      List(("cat", 1), ("dog", 1), ("cat", 2)))
    pets.reduceByKey(_ + _).collect().foreach(println)
  }


}

