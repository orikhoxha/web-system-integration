package com.websystemintegration.ecommerce.controller;

import com.websystemintegration.ecommerce.domain.Department;
import com.websystemintegration.ecommerce.domain.Item;
import com.websystemintegration.ecommerce.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


/* API for departments REST CRUD. Calls the service helper class for data manipulation */
@RestController
@RequestMapping("/api/departments")
public class DepartmentController {

    @Autowired
    DepartmentService departmentService;

    /* Accepts a Department object, returs the new object with id assigned */
    @PostMapping(value = "/")
    public Department addDepartment(@RequestBody Department department){ return departmentService.save(department);}


    @GetMapping
    public List<Department> getDepartments(){
        return departmentService.findAll();
    }


    /* Updates a department */
    @PutMapping(value = "/{id}")
    public ResponseEntity<Object> updateItem(@RequestBody Department department , @PathVariable Long id) {

        Department theItem = departmentService.findOne(id);
        if(null == theItem){
            return ResponseEntity.notFound().build();
        }
        department.setId(id);
        departmentService.save(department);
        return ResponseEntity.noContent().build();
    }
}
