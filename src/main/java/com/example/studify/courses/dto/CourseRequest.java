package com.example.studify.courses.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@RequiredArgsConstructor
public class CourseRequest {
    private String name;
    private int credit_hours;
    private String discipline;
    private int score;
}
