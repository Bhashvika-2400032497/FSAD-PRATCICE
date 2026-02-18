package com.klu.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.klu.config.StudentConfig;
import com.klu.model.Student;

public class AnnotationMainApp {

    public static void main(String[] args) {

        ApplicationContext context =
                new AnnotationConfigApplicationContext(StudentConfig.class);

        Student student = context.getBean(Student.class);
        student.display();
    }
}
