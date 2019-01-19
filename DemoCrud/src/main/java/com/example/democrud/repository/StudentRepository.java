package com.example.democrud.repository;

import java.util.List;

import org.springframework.data.domain.Sort.Direction;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.democrud.model.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long>{

	//List<Student> findAllById(Direction asc);

}
