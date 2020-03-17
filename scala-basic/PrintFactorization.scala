object PrintFactorization extends App {
  Seq(32, 24, 90, 510510).map(Factorization.factorization).map(println)
}
