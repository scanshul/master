package com.lms.service;

import com.lms.dto.InstructorDto;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface InstructorService {
    List<InstructorDto> getInstructorDetails();
}
