package org.springcore.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfigurationClass {

    @Bean("student")
    public Student getStudent(){
        Student s = new Student();
        s.setName("Anshul");
        s.setAddress("India");
        return s;
    }

    @Bean("teacher")
    public Teacher getTeacher(){
        Teacher teacher = new Teacher(getStudent());
        return teacher;
    }



}
