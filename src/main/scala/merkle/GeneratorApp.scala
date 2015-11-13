package merkle

import scala.util.Random

object GeneratorApp extends App {

  val TREE_SIZE = 8
  val STRING_SIZE = 8

  val rnd = new Random
  val dataSet = (1 to TREE_SIZE).map(x => Random.alphanumeric.take(STRING_SIZE).mkString).toList
  val fullFile  = dataSet.mkString("")


  val tree = MerkleTree.create(dataSet)
  val hash = tree.hash

  println(dataSet)
  println(fullFile)
  println(hash)
  println(tree)


}
