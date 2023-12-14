package com.jo.clean_skin_service.service;

import com.jo.clean_skin_service.entity.Advice;
import com.jo.clean_skin_service.repository.AdviceRepository;
import org.springframework.stereotype.Service;

@Service
public class AdviceServiceImpl implements AdviceService {

    private final AdviceRepository repository;

    public AdviceServiceImpl(AdviceRepository repository) {
        this.repository = repository;
    }

    @Override
    public Advice getAdvice(String disease) {
        return repository.findByDiseaseName(disease);
    }
}
