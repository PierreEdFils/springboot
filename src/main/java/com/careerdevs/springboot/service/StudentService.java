package com.careerdevs.springboot.service;

import com.careerdevs.springboot.model.Student;

public interface StudentService  {
    Student getById(int id);
    Student getByName(String name);
    boolean save(Student student);

}
