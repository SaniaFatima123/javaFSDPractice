package com.example.student.repository;

import com.example.student.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface StudentRepository extends JpaRepository<Student, Integer> {
    //if u want to use custom method using provided standard by jpa then may or may not use query
    List<Student> findByName(String name);

    List<Student> findByStandard(int standard);

    List<Student> findByStandardAndSchool( int standard, String school);

    List<Student> findByStandardOrSchool(int standard, String school);

    //if u want to have Custom method without using provided standard
    // by jpa then use query(can be native SQL Query or HQL/JPQL Query

    //using native SQL Query
    @Query(value = "Select * from students", nativeQuery = true)
    List<Student> findAllStudent();

    //using HQL/JPQL query
    @Query("from Student where name=:nameArgs")
    List<Student> findAllStudentsByName(@Param("nameArgs") String name);


}
