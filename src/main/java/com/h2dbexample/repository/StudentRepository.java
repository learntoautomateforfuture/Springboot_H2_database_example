package com.h2dbexample.repository;
import com.h2dbexample.model.Student;
import org.springframework.data.repository.CrudRepository;

public interface StudentRepository extends CrudRepository<Student, Integer>
{
}
