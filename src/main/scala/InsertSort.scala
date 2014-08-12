import scala.collection.mutable.ListBuffer

/**
 * Created by paweln1986 on 11.08.14.
 */
object InsertSort extends App {
  val test = ListBuffer(2, 1,5,2,10,11,2,4)
  println("sorted: "+sort(test))
  def sort(l:ListBuffer[Int]):ListBuffer[Int] = {
    val toSort = l
    for(x <- 1 until toSort.length){
      val tmp = toSort(x)
      var j = x -1
      while (j > -1 && toSort(j)<tmp){
        toSort(j+1) = toSort(j)
        j-=1
      }
      toSort(j+1) = tmp
    }
    toSort
  }
}
