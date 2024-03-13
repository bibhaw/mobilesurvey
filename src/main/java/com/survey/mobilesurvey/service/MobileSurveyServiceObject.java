package com.survey.mobilesurvey.service;

import com.survey.mobilesurvey.entity.SurveyEntity;
import com.survey.mobilesurvey.model.SurveyRequest;
import com.survey.mobilesurvey.persistence.MobileSurveyDataAccess;
import com.survey.mobilesurvey.util.SurveyUtil;
import org.springframework.beans.factory.annotation.Autowired;

public class MobileSurveyServiceObject implements MobileSurveyService{

    @Autowired
    MobileSurveyDataAccess mobileSurveyDataAccess;
    @Autowired
    SurveyUtil surveyUtil;
    public Boolean saveSurveyResponse(SurveyRequest pSurveyRequest){
        boolean result = false;
        SurveyEntity entityRequest = surveyUtil.buildSurveyEntityFromRequest(pSurveyRequest);
        SurveyEntity  entityResponse = mobileSurveyDataAccess.save(entityRequest);

        if(entityResponse == null) {
            result = false;
        } else {
            result = true;
        }
        return result;
    }
}
