import org.apache.spark._
import org.apache.spark.SparkContext
import org.apache.spark.sql._
import org.apache.spark.sql.types._


object first_demo {
  def main(args: Array[String]): Unit = {
    val conf=new SparkConf().setMaster("local[*]").setAppName("first_demo")

    val sc=new SparkContext(conf)

    val appName = "Scala Example - List to Spark Data Frame"
    val master = "local"
    /*Create Spark session with Hive supported.*/
    val spark = SparkSession
      .builder
      .appName(appName)
      .master(master)
      .getOrCreate()
    // For implicit conversions like converting RDDs to DataFrames
    import spark.implicits._

    /* List */
    val data = List(Row("Category A", 100, "This is category A"),
      Row("Category B", 120, "This is category B"),
      Row("Category C", 150, "This is category C"))

    val schema = StructType(List(
      StructField("Category", StringType, true),
      StructField("Count", IntegerType, true),
      StructField("Description", StringType, true)
    ))

    /* Convert list to RDD */
    val rdd = spark.sparkContext.parallelize(data)

    /* Create data frame */
    val df = spark.createDataFrame(rdd, schema)
    print(df.schema)
    df.show()








    //    println(rdd.reduce(_+_))

  }
}
