package com.webapi.project.apiproject1.controllers;

import com.webapi.project.apiproject1.dto.EmployeeDTO;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping(path = "/employees")
public class EmployeeController {

//    @GetMapping(path = "/getSecretMessage")
//    public String getMySecretMessage(){
//        return "Secret Message";
//    }
    @GetMapping(path = "/{employeeId}")
    public EmployeeDTO getEmployeeById(@PathVariable(name="employeeId") Long id){
        return new EmployeeDTO(23,employeeId,"hello","kalasielvan@gmail.com", LocalDate.of(2024,1,20),true);
    }

    @GetMapping
    public String getAllEmployees(@RequestParam(required = false) Integer age){
        return "Hi age "+age;

    }
    @PutMapping
    public EmployeeDTO createNewEmployee(@RequestBody EmployeeDTO inputEmployee){
        inputEmployee.setId(100L);
        return inputEmployee;
    }

}
