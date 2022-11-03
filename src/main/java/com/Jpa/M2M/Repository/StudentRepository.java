package com.Jpa.M2M.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Jpa.M2M.Entity.Student;

public interface StudentRepository extends JpaRepository<Student,Long>{

}
