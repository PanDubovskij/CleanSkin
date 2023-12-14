package com.jo.clean_skin_service.entity;

import jakarta.persistence.*;

@Entity
public class Advice {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "advice_id")
    private Long adviceId;
    @Column(name = "disease_name")
    private String diseaseName;
    @Column(name = "advice_body")
    private String adviceBody;


    public void setAdviceId(Long id) {
        this.adviceId = id;
    }

    public void setDiseaseName(String diseaseName) {
        this.diseaseName = diseaseName;
    }

    public void setAdviceBody(String adviceBody) {
        this.adviceBody = adviceBody;
    }

    public Long getAdviceId() {
        return adviceId;
    }

    public String getDiseaseName() {
        return diseaseName;
    }

    public String getAdviceBody() {
        return adviceBody;
    }
}
