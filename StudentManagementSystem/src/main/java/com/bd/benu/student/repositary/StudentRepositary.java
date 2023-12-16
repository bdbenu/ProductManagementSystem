package com.bd.benu.student.repositary;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bd.benu.student.model.Student;

public interface StudentRepositary extends JpaRepository<Student, Serializable>{

}
