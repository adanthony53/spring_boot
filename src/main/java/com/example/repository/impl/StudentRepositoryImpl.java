package com.example.repository.impl;

import com.example.entity.Student;
import com.example.repository.StudentRepository;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.HashMap;

@Repository
public class StudentRepositoryImpl implements StudentRepository {

    private static Map<Long, Student> studentMap;
    static {
        studentMap = new HashMap<>();
        studentMap.put(1L, new Student(1L, "Alice", 20));
        studentMap.put(2L, new Student(2L, "Bob", 18));
        studentMap.put(3L, new Student(3L, "Charlie", 19));
    }

    @Override
    public Collection<Student> findAll() {
        return studentMap.values();
    }

    @Override
    public Student findById(long id) {
        return studentMap.get(id);
    }

    @Override
    public void saveOrUpdate(Student student) {
        studentMap.put(student.getId(), student);
    }

    @Override
    public void deleteById(long id) {
        studentMap.remove(id);
    }
}
