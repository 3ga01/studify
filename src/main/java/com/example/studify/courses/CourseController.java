package com.example.studify.courses;

import com.example.studify.courses.dto.CourseRequest;
import com.example.studify.courses.dto.CourseResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController("/course")
@RequiredArgsConstructor
public class CourseController {
    private final CourseService courseService;

    @PostMapping("/register")
    public ResponseEntity<CourseResponse> registerCourse(@RequestBody CourseRequest request) {
        return ResponseEntity.ok().body(courseService.registerCourse(request));
    }
}
