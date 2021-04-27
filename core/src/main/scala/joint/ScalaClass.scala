package joint

class ScalaClass {
  def hello: String = "scala"

  def javaHello: String = new joint.JavaClass().hello

  def groovyHello: String = new joint.GroovyClass().hello

//  def kotlinHello: String = new joint.KotlinClass().hello
}
