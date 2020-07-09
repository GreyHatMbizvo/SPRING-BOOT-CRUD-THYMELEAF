package com.tmgreyhat.crud.controller;
import com.tmgreyhat.crud.models.Employee;
import com.tmgreyhat.crud.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import javax.validation.Valid;


@Controller
public class EmployeeController {


    //display list of employees


    @Autowired
    private EmployeeRepository repository;

    @GetMapping("/")
    public  String viewHomePage(Model model){

        model.addAttribute("employees", repository.findAll());
        return "index";

    }

    @GetMapping("/add-employee")
    public  String showNewEmployeeForm(Model model){

        Employee employee = new Employee();
        model.addAttribute("employee", employee);
        return  "new_employee";

    }

    @GetMapping("/saveEmployee")
    public  String showForm(Employee employee){

        return  "new_employee";
    }
    @PostMapping("/saveEmployee")
    public String saveEmployee(@Valid Employee employee, BindingResult bindingResult){

        if(bindingResult.hasErrors()){

            return  "saveEmployee";
        }
        repository.save(employee);
        return "redirect:/";
    }

    @GetMapping("/delete-employee/{id}")
    public String  deleteEmployee(@PathVariable(value = "id") long id){

        repository.deleteById(id);
        return  "redirect:/";
    }
    @GetMapping("/update-employee-form/{id}")
    public String updateEmployeeForm(@PathVariable(value ="id") long id, Model model){

        //get employee from repo
        Employee employee = repository.getOne(id);
        model.addAttribute("employee", employee);
        return "update_employee";
    }
}
