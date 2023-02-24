package com.wzy.ai.software.xsxkms.controller;

import com.wzy.ai.software.xsxkms.entity.Student;
import com.wzy.ai.software.xsxkms.repository.StudentRepository;
import org.springframework.web.bind.annotation.*;

/**
 * @author Torther
 */
@RestController
@RequestMapping("/student")
public class StudentController {
    private final StudentRepository studentRepository;

    public StudentController(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @PostMapping("/add")
    public @ResponseBody String add(@RequestParam String name
            , @RequestParam Integer age, @RequestParam String gender) {
        Student student = new Student();
        student.setName(name);
        student.setAge(age);
        student.setGender(gender);
        studentRepository.save(student);
        return "新增成功";
    }

    @DeleteMapping("/del/{id}")
    public @ResponseBody String delete(@PathVariable("id") int id) {
        studentRepository.deleteById(id);
        return "删除成功";
    }

    @GetMapping("/selectall")
    public Iterable<Student> selectAll() {
        return studentRepository.findAll();
    }

    @PutMapping("/update")
    public @ResponseBody String update(@RequestBody Student student) {
        //TODO
        return "修改成功";
    }
}
