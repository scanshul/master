package com.lms.service.impl;

import com.lms.dto.InstructorDto;
import com.lms.entity.InstructorEntity;
import com.lms.repository.InstructorRepository;
import com.lms.service.InstructorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class InstructorServiceImpl implements InstructorService {

    @Autowired
    private InstructorRepository instructorRepository;

    @Override
    public List<InstructorDto> getInstructorDetails() {
        List<InstructorEntity> entity = instructorRepository.findAll();
        return entity.stream().
                map(obj -> new InstructorDto(obj.getId(), obj.getName(),
                        obj.getEmail())).collect(Collectors.toCollection(ArrayList::new));
    }
}
