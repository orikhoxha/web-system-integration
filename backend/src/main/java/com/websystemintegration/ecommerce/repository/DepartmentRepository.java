package com.websystemintegration.ecommerce.repository;

import com.websystemintegration.ecommerce.domain.Department;
import org.springframework.data.repository.CrudRepository;

import java.util.List;


public interface DepartmentRepository extends CrudRepository<Department, Long> {

    List<Department> getDepartmentsByMainDepartment(String mainDepartment);

}
