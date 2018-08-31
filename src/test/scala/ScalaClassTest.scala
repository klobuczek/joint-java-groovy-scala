import org.junit.Assert.assertEquals
import org.junit.Test

class ScalaClassTest {
  @Test
  def testHello(): Unit = assertEquals("scala", new ScalaClass().hello)

  @Test
  def testJavaHello(): Unit = assertEquals("java", new ScalaClass().javaHello)

  @Test
  def testGroovyHello(): Unit = assertEquals("groovy", new ScalaClass().groovyHello)
}
