package net.anwar.pres;

import net.anwar.metier.IMetier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class PresSpringAnnotation {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext("net.anwar");
        IMetier metier = context.getBean(IMetier.class);
        System.out.println(metier.calcul());
    }
}
