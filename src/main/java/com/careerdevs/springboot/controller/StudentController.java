package com.careerdevs.springboot.controller;


import com.careerdevs.springboot.model.Student;
import com.careerdevs.springboot.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/student")
public class StudentController {

    @Autowired
    StudentService studentService;

    @GetMapping("/id")
    public Student getById(@RequestParam(value = "id", defaultValue = "1") int id) {

        return studentService.getById(id);
    }


    @RequestMapping(value = "/name", method = RequestMethod.GET)
    public Student getByName(@RequestParam(value = "name", defaultValue = "nakesh") String name) {
        return studentService.getByName(name);
    }

    @PostMapping("/save")
    public boolean saveStudent(@RequestBody(required = true) Student student) {
        return studentService.save(student);
    }

}
