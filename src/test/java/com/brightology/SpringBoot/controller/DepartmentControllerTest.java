//package com.brightology.SpringBoot.controller;
//
//import com.brightology.SpringBoot.entity.Department;
//import com.brightology.SpringBoot.service.DepartmentService;
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Test;
//import org.mockito.Mockito;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
//import org.springframework.boot.test.mock.mockito.MockBean;
//import org.springframework.http.MediaType;
//import org.springframework.test.web.servlet.MockMvc;
//import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
//import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
//
//import static org.junit.jupiter.api.Assertions.*;
//import static org.springframework.http.RequestEntity.post;
//import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
//import static org.springframework.web.servlet.function.RequestPredicates.contentType;
//
//@WebMvcTest(DepartmentController.class)
//class DepartmentControllerTest {
//
//    @Autowired
//    private MockMvc mockMvc;
//
//    @MockBean
//    private DepartmentService departmentService;
//
//    private Department department;
//
//    @BeforeEach
//    void setUp() {
//        department = Department.builder()
//                .departmentAddress("Nekede")
//                .departmentCode("E-001")
//                .departmentName("E/E")
//                .departmentId(1L)
//                .build();
//    }
//
//    @Test
//    void saveDepartment() {
//        Department inputDepartment = Department.builder()
//                .departmentAddress("Nekede")
//                .departmentCode("E-001")
//                .departmentName("E/E")
//                .build();
//
//        Mockito.when(departmentService.saveDepartment(inputDepartment)).thenReturn(department);
//
//        mockMvc.perform(post( urlTemplate: "/departments")
//                .contentType(MediaType.APPLICATION_JSON)
//                .content("{\n" +
//                        "    \"departmentName\":\"E/E\",\n" +
//                        "    \"departmentAddress\":\"Nekede\",\n" +
//                        "    \"departmentCode\":\"E-001\"\n" +
//                        "\n" +
//                        "}"))
//                .andExpect(status().isOk());
//    }
//
//    @Test
//    void fetchDepartmentById() {
//    }
//}
//
////3:51:58 - ...