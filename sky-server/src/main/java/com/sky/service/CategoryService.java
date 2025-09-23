package com.sky.service;

import com.sky.dto.CategoryDTO;
import org.springframework.stereotype.Service;

@Service
public interface CategoryService {
    void save(CategoryDTO categoryDTO);
}
