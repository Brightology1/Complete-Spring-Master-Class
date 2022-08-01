package com.brightology.SpringBoot.service;

import com.brightology.SpringBoot.entity.Department;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

public interface DepartmentService {

    public Department saveDepartment(Department department);

    public List<Department> fetchDepartmentList();

    public Department fetchDepartmentById(Long departmentId);
}
