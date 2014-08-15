package sorting

/**
 * Created by paweln1986 on 15.08.14.
 */
object QuickSort extends App {
  val list = List(1,222222,20,12,33,4,52,34,67,8,4 ,5, 6, 1, 21, 45,12 ,12 ,4, 13 , 24 , 234)
  println(quickSort(list))

  def quickSort(list:List[Int]):List[Int]={
    if(list.length<2) list
    else{
      val pivot = list(list.length/2)
      quickSort(list filter (pivot >_))++(list filter (pivot==_))++quickSort(list filter(pivot < _))
    }
  }
}
