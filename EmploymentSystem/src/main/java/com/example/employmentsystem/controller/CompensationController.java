package com.example.employmentsystem.controller;

import com.example.employmentsystem.entity.Compensation;
import com.example.employmentsystem.service.CompensationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/compensation")
public class CompensationController {
    @Autowired
    private CompensationService compensationService;

    // Add mappings for add, history, breakdown, edit
}