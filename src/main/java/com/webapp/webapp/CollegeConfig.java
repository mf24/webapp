package com.webapp.webapp;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan(basePackages = "com.webapp.webapp")
@PropertySource("classpath:application.properties")
public class CollegeConfig {

   /* @Bean(name="colBean")
    public College collegeBean(){
        College college = new College();
        college.setPrincipal(principalBean());
        college.setTeacher(mathTeacherBean());
        return college;
    }

    @Bean
    public Principal principalBean(){
        return new Principal();
    }

    @Bean
    public Teacher mathTeacherBean(){
        return new MathTeacher();
    }
*/
}
