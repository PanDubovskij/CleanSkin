package com.jo.clean_skin_service.repository;

import com.jo.clean_skin_service.entity.Advice;
import org.springframework.data.repository.CrudRepository;

public interface AdviceRepository extends CrudRepository<Advice, Long> {

    Advice findByDiseaseName(String disease);
}
