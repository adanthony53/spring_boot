package com.example.controller;


import com.example.entity.Student;
import com.example.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/hello")
public class HelloController {

    @Autowired
    private StudentRepository studentRepository;

    @GetMapping("/index")
    public ModelAndView index() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("index");
        modelAndView.addObject("list", studentRepository.findAll());
        return modelAndView;
    }

    @GetMapping("/findById/{id}")
    public ModelAndView findById(@PathVariable("id") long id) {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("update");
        modelAndView.addObject("student", studentRepository.findById(id));
        return modelAndView;
    }

    @PostMapping("/save")
    public String save(Student student) {
        studentRepository.saveOrUpdate(student);
        return "redirect:/hello/index";
    }

    @PostMapping("/update")
    public String update(Student student) {
        studentRepository.saveOrUpdate(student);
        return "redirect:/hello/index";
    }

    @GetMapping("/deleteById/{id}")
    public String deleteById(@PathVariable("id") long id) {
        studentRepository.deleteById(id);
        return "redirect:/hello/index";
    }
}
