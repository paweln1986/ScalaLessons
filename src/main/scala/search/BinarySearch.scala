package search

/**
 * Created by paweln1986 on 05.08.14.
 */
object BinarySearch extends App {
 val testList = List(1,2,3,4, 25)
  val search = binarySearch(25, testList)
  println(search)

  def binarySearch(target:Int,l:List[Int]):Option[Int] = {
    def recursiveSearch(low:Int, high:Int):Option[Int] = (low+high)/2 match{
      case _ if high<low => None
      case mid if l(mid) > target => recursiveSearch(low, mid-1)
      case mid if l(mid) < target => recursiveSearch(mid+1, high)
      case mid  => Some(mid)
    }
    recursiveSearch(0, l.size-1)
  }
}
