class GroovyClass {
    String hello() {
        'groovy'
    }

    String javaHello() {
        new JavaClass().hello()
    }

    String scalaHello() {
        new ScalaClass().hello()
    }
}
