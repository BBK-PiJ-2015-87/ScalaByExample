/**
  * Created by Workstation on 13/04/2016.
  */
object Sorter extends App {

  def quicksort(xs:Array[Int]) : Array[Int]= {
    if (xs.length <= 1) xs
    else {
      val mid = xs(xs.length/2)
      Array.concat(
        quicksort(xs filter (mid >)),
        xs filter (mid ==),
        quicksort(xs filter (mid <))
      )
    }
  }

  var array = Array(4,2,-9,10,1,0)
  array = quicksort(array)

  array.foreach(println)
}
