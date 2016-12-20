package springaop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpring {

    Person person;

    public static void main(String[] args) {
        System.out.println("Hello, Spring AOP!");

        ApplicationContext context = new ClassPathXmlApplicationContext("application-context.xml");

        Person korey = (Person) context.getBean(Person.class);
        greet(korey);
    }

    private static void greet(Person person) {
        System.out.println("Hello, " + person.getName() + "!");
    }
}
