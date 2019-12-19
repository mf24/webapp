package com.webapp.webapp;

import org.springframework.stereotype.Component;

@Component
public class MusicTeacher implements Teacher{

    @Override
    public void teach() {
        System.out.println("Im teaching music");
    }
}
