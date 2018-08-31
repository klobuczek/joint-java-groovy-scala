class ScalaClass {
  def hello: String = "scala"

  def javaHello: String = new JavaClass().hello

  def groovyHello: String = new GroovyClass().hello
}
