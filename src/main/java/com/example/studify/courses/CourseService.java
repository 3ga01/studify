package com.example.studify.courses;

import com.example.studify.courses.dto.CourseRequest;
import com.example.studify.courses.dto.CourseResponse;
import com.example.studify.student.Role;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class CourseService {
    private final CourseRepository courseRepository;
    public CourseResponse registerCourse(CourseRequest request) {
        Optional<Course> courseExists = courseRepository.findByName(request.getName());

        if (courseExists.isPresent()) return CourseResponse.builder()
                .error("Course already exists")
                .build();

    var course =
        Course.builder()
            .name(request.getName())
            .credit_hours(request.getCredit_hours())
            .discipline(request.getDiscipline())
            .score(request.getScore())
            .role(Role.USER)
            .build();

        courseRepository.save(course);

        return CourseResponse.builder()
                .course(course)
                .build();
    }
}
