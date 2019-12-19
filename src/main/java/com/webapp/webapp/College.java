package com.webapp.webapp;


import ch.qos.logback.core.net.SyslogOutputStream;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;


@Component
public class College {

    @Value("${college.Name}")
    private String collegeName;

    @Value(value = "1912")
    private int year;

    @Autowired
    private Principal principal;

    @Autowired
    @Qualifier(value = "musicTeacher")
    private Teacher teacher;

    public void info(){
        System.out.println("Im the college info method of name: " + collegeName + "built in:" + year) ;
        principal.principalInfo();
        teacher.teach();


    }

}
