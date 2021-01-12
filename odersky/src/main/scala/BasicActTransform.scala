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

  }


}

