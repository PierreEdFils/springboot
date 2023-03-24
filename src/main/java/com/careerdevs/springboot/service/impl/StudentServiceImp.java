package com.careerdevs.springboot.service.impl;

import com.careerdevs.springboot.model.Student;
import com.careerdevs.springboot.service.StudentService;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImp implements StudentService {
    @Override
    public Student getById(int id) {
        // getting student from table by passing id
        Student s = new Student();
        s.setId(id);
        s.setName("name-" + id);
        s.setMobileNo("11111111");
       return s;

    }

    @Override
    public Student getByName(String name) {
        Student s = new Student();
        s.setId(2);
        s.setName(name);
        s.setMobileNo("222222222");
        return null;
    }

    @Override
    public boolean save(Student student) {
        System.out.println("id-" +student.getId() + "name-"+student.getName() + "mobile-" +student.getMobileNo());
        return false;
    }

}
