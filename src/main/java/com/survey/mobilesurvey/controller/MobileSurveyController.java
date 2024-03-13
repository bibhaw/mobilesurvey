package com.survey.mobilesurvey.controller;

import com.survey.mobilesurvey.model.SurveyRequest;
import com.survey.mobilesurvey.model.SurveyResponse;
import com.survey.mobilesurvey.service.MobileSurveyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MobileSurveyController {

    @Autowired
    private MobileSurveyService mobileSurveyServiceObject;

    @PostMapping("/surveyResponse")
    public SurveyResponse saveSurveyResponse(@RequestBody SurveyRequest pSurveyResponse){

        return null;
    }
}
