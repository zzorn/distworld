import sbt._

class DistWorldProject(info: ProjectInfo) extends DefaultProject(info) with AkkaProject
{
  val scalatest = "org.scalatest" % "scalatest" % "1.3"

/*
  val akkaStm = akkaModule("stm")
  val akkaTypedActor = akkaModule("typed-actor")
  val akkaRemote = akkaModule("remote")
  val akkaHttp = akkaModule("http")
  val akkaAmqp = akkaModule("amqp")
  val akkaCamel = akkaModule("camel")
  val akkaSpring = akkaModule("spring")
  val akkaJta = akkaModule("jta")
  val akkaCassandra = akkaModule("persistence-cassandra")
  val akkaMongo = akkaModule("persistence-mongo")
  val akkaRedis = akkaModule("persistence-redis")
*/
  
}