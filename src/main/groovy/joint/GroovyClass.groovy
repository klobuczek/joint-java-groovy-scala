package joint

class GroovyClass {
    String hello() {
        'groovy'
    }

    String javaHello() {
        new JavaClass().hello()
    }

    String kotlinHello() {
        new KotlinClass().hello()
    }
    String scalaHello() {
        new ScalaClass().hello()
    }
}
