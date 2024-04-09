package com.vsions.sms.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vsions.sms.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Long>{

}
