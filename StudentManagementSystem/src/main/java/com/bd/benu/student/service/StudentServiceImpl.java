package com.bd.benu.student.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bd.benu.student.model.Student;
import com.bd.benu.student.repositary.StudentRepositary;

@Service
public class StudentServiceImpl implements IStudentService {

	@Autowired
	private StudentRepositary studentRepositary;

	@Override
	public boolean createStudent(Student student) {

		return studentRepositary.save(student).getsId() != null;
	}

	@Override
	public List<Student> students() {

		return studentRepositary.findAll();
	}

	@Override
	public Student studentsById(Integer sid) {

		Optional<Student> findById = studentRepositary.findById(sid);
		if (findById.isPresent()) {
			Student student = findById.get();
			return student;
		}
		return null;
	}

	@Override
	public boolean deleteStudent(Integer sid) {

		Optional<Student> findById = studentRepositary.findById(sid);
		studentRepositary.deleteById(sid);
		if(findById!=null) {
			return true;
		}

		return false;
	}

}
