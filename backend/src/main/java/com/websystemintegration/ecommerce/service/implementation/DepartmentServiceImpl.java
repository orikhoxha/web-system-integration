package com.websystemintegration.ecommerce.service.implementation;

import com.websystemintegration.ecommerce.domain.Department;
import com.websystemintegration.ecommerce.domain.Item;
import com.websystemintegration.ecommerce.repository.DepartmentRepository;
import com.websystemintegration.ecommerce.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DepartmentServiceImpl implements DepartmentService {


    @Autowired
    DepartmentRepository departmentRepository;

    @Override
    public List<Department> findAll() {
        return (List<Department>)departmentRepository.findAll();
    }

    @Override
    public Department findOne(Long id) {
        return departmentRepository.findOne(id);
    }

    @Override
    public Department save(Department department) {
       return  departmentRepository.save(department);
    }

    @Override
    public List<Department> getDepartmentByMain(String mainDepartment) {
        return departmentRepository.getDepartmentsByMainDepartment(mainDepartment);
    }

    @Override
    public void removeDepartment(Long id) {
        departmentRepository.delete(id);
    }
}
