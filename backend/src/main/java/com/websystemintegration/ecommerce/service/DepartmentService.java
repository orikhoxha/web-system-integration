package com.websystemintegration.ecommerce.service;

import com.websystemintegration.ecommerce.domain.Department;
import com.websystemintegration.ecommerce.domain.Item;

import java.util.List;

public interface DepartmentService {

    List<Department> findAll();

    Department findOne(Long id);

    Department save(Department department);


    List<Department> getDepartmentByMain(String mainDepartment);

    void removeDepartment(Long id);
}
