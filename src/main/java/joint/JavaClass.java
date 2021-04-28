package joint;

public class JavaClass {
    public String hello() {
        return "java";
    }

    public String groovyHello() {
        return new GroovyClass().hello();
    }

    public String kotlinHello() {
        return new KotlinClass().hello();
    }
}
