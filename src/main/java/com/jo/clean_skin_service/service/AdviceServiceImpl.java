package com.jo.clean_skin_service.service;

import com.jo.clean_skin_service.dto.AdviceDto;
import com.jo.clean_skin_service.entity.Advice;
import com.jo.clean_skin_service.exception.NotFoundException;
import com.jo.clean_skin_service.repository.AdviceRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
class AdviceServiceImpl implements AdviceService {

    private final AdviceRepository repository;

    public AdviceServiceImpl(AdviceRepository repository) {
        this.repository = repository;
    }

    @Override
    public AdviceDto getAdvices(String disease) throws NotFoundException {
        List<Advice> allByDiseaseName = repository.findAllByDiseaseNameIgnoreCase(disease);
        if (!allByDiseaseName.isEmpty()) {
            AdviceDto adviceDto = new AdviceDto(allByDiseaseName.get(0));
            for (Advice a : allByDiseaseName) {
                adviceDto.getAdvices().add(a.getAdviceBody());
            }
            return adviceDto;
        } else {
            throw new NotFoundException("Sorry, we don't know about this disease");
        }
    }
}
