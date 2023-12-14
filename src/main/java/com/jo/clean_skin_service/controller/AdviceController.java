package com.jo.clean_skin_service.controller;

import com.jo.clean_skin_service.entity.Advice;
import com.jo.clean_skin_service.service.AdviceService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/advice")
public class AdviceController {

    private final AdviceService service;

    public AdviceController(AdviceService service) {
        this.service = service;
    }

    @GetMapping
    public ResponseEntity<Advice> getAdvice(@RequestParam String disease) {
        Advice advice = service.getAdvice(disease);
        return new ResponseEntity<>(advice, HttpStatus.OK);
    }
}
