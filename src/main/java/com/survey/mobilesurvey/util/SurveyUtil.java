package com.survey.mobilesurvey.util;

import com.survey.mobilesurvey.entity.SurveyEntity;
import com.survey.mobilesurvey.model.SurveyRequest;
import org.springframework.stereotype.Component;

@Component
public class SurveyUtil {

    public SurveyEntity buildSurveyEntityFromRequest(SurveyRequest request){

        SurveyEntity entity = new SurveyEntity();
        //save all data into entity

        return entity;
    }
}
