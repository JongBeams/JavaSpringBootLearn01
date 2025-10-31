package io.jongbeom.springboot.intellij.leranspringboot;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;


// http://localhost:8080/courses
// URL Course 를 사용하여 간단한 Rest API 제작
// URL 입력 시 id, name, author 반환
/*
    [
         {
         "id": 1,
         "name": "Learn AWS",
         "author": "in28minutes"
         }
    ]
*/

@RestController
public class CourseController {


    // Course 반환 목록 : id, name, author
    // URL /courses 입력 시 반환
    @RequestMapping("/courses")
    public List<Course> retrieveAllCourses(){
        return Arrays.asList(
                new Course(1,"Learn AWS","JangJongBeom"),
                new Course(2,"Learn DevOps","JangJongBeom"),
                new Course(3,"Learn Azure","JangJongBeom"),
                new Course(4,"Learn GCP","JangJongBeom")

        );
    }





}
