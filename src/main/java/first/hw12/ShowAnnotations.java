package first.hw12;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

public class ShowAnnotations {

    public static void main(String[] args) {
        Person p = new Person("Nino", 26, Gender.MALE);

        System.out.println("Printing Class annotations of: " + p.getClass().getName());
        for (Annotation annotation : p.getClass().getAnnotations()) {
            System.out.println("Class: " + annotation);
        }

        System.out.println();

        System.out.println("Printing Method annotations of: " + p.getClass().getName());
        for (Method method : p.getClass().getDeclaredMethods()) {
            System.out.println(method.getName() + " has annotation: ");
            for (Annotation declaredAnnotation : method.getDeclaredAnnotations()) {
                System.out.println(declaredAnnotation);
            }
        }
    }
}
