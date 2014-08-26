package others

/**
 * Created by paweln1986 on 19.08.14.
 */
object Fibo extends App{
  lazy val N: Stream[BigInt] = BigInt(1)#::N.map(_ + 1)
  lazy val fibo:Stream[BigInt] = BigInt(1)#::BigInt(2)#::fibo.zip(fibo.tail).map(n=>{
    n._1+n._2
  })
  lazy val factorial:Stream[BigInt] = BigInt(1)#::factorial.zip(N).map(n=>n._1*n._2)

}
