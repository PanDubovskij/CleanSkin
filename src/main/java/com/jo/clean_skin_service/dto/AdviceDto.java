package com.jo.clean_skin_service.dto;

import com.jo.clean_skin_service.entity.Advice;

import java.util.ArrayList;
import java.util.List;

public class AdviceDto {
    private Long adviceId;
    private String diseaseName;
    private List<String> advices;


    public AdviceDto() {
    }

    public AdviceDto(Advice advice) {
        this.adviceId = advice.getAdviceId();
        this.diseaseName = advice.getDiseaseName();
        advices = new ArrayList<>();
    }

    public Long getAdviceId() {
        return adviceId;
    }

    public String getDiseaseName() {
        return diseaseName;
    }

    public List<String> getAdvices() {
        return advices;
    }
}
