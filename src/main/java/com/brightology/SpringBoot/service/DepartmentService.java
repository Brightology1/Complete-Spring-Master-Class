package com.brightology.SpringBoot.service;

import com.brightology.SpringBoot.entity.Department;
import com.brightology.SpringBoot.error.DepartmentNotFoundException;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

public interface DepartmentService {

    public Department saveDepartment(Department department);

    public List<Department> fetchDepartmentList();

    public Department fetchDepartmentById(Long departmentId) throws DepartmentNotFoundException;

    public void deleteDepartmentById(Long departmentId);

    public Department updateDepartment(Long departmentId, Department department);

    public Department fetchDepartmentByName(String departmentName);

    public Department fetchDepartmentByAddress(String departmentAddress);
}
