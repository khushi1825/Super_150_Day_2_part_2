package com.example.day_2_part_2.controller;
import java.util.*;
import com.example.day_2_part_2.model.StudentModel;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Home {
    @GetMapping("about")
    public List<StudentModel> getStudent(){
        List<StudentModel> students=new ArrayList<>();
        students.add(new StudentModel(1, "Khushi", "khushi@gmail.com"));
        students.add(new StudentModel(2, "Anantika", "anantika@gmail.com"));
        students.add(new StudentModel(3, "Ananya", "ananya@gmail.com"));
        students.add(new StudentModel(4, "Divya", "divya@gmail.com"));
        students.add(new StudentModel(5, "Shanya", "shanya@gmail.com"));

        return students;

    }
}
