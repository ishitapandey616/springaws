package com.aws.springboot.repo;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.aws.springboot.entity.Course;

public interface CourseRepository extends JpaRepository<Course, Serializable> {

}
