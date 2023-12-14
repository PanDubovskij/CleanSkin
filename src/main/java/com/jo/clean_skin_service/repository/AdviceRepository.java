package com.jo.clean_skin_service.repository;

import com.jo.clean_skin_service.entity.Advice;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface AdviceRepository extends CrudRepository<Advice, Long> {

    List<Advice> findAllByDiseaseNameIgnoreCase(String disease);
}
