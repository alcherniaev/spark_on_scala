object first_steps_chapter {

  // functions
  def max(x: Int, y: Int): Int = {
    if (x > y) x
    else y
  }

  // if we don't use recursion, we can write func without defining an output type
  def max_1(x: Int, y: Int) = if (x > y) x else y

  var str_ = List("Concise", "is", "nice")
  str_.foreach(println)

}
