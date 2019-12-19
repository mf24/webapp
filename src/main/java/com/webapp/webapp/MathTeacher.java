package com.webapp.webapp;

import org.springframework.stereotype.Component;

@Component
public class MathTeacher implements Teacher {

    @Override
    public void teach() {

        System.out.println("Im teaching math");

    }
}
