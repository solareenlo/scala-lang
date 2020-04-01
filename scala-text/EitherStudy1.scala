case class User2(id: Int, name: String, addressId: Option[Int])
case class Address(id: Int, name: String, postalCode: Option[String])

sealed abstract class PostalCodeResult
case class  Success(postalCode: String) extends PostalCodeResult
abstract class Failure extends PostalCodeResult
case object UserNotFound extends Failure
case object UserNotHasAddress extends Failure
case object AddressNotFound extends Failure
case object AddressNotHasPostalCode extends Failure

object EitherStudy1 extends App {
  val userDatabase: Map[Int, User2] = Map (
    1 -> User2(1, "Taro", Some(1)),
    2 -> User2(2, "Jiro", Some(2)),
    3 -> User2(3, "Mike", None)
  )

  val addressDatabase: Map[Int, Address] = Map (
    1 -> Address(1, "Roppongi", Some("123-4567")),
    2 -> Address(2, "Shibuya", None)
  )

  def findUser(userId: Int): Either[Failure, User2] = {
    userDatabase.get(userId).toRight(UserNotFound)
  }

  def findAddress(user: User2): Either[Failure, Address] = {
    for {
      addressId <- user.addressId.toRight(UserNotHasAddress)
      address <- addressDatabase.get(addressId).toRight(AddressNotFound)
    } yield address
  }

  def findPostalCode(address: Address): Either[Failure, String] = {
    address.postalCode.toRight(AddressNotHasPostalCode)
  }

  def getPostalCodeResult(userId: Int): PostalCodeResult = {
    (for {
      user <- findUser(userId)
      address <- findAddress(user)
      postalCode <- findPostalCode(address)
    } yield Success(postalCode)).merge
  }

  println(findUser(1))
  findUser(1) match {
    case Right(r) => println(r)
    case Left(l) => println(l)
  }
  println(findAddress(User2(1,"Taro",Some(1))))
  println(getPostalCodeResult(1))
  println(getPostalCodeResult(2))
  println(getPostalCodeResult(3))
  println(getPostalCodeResult(4))
}
