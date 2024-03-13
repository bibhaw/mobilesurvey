package com.survey.mobilesurvey.persistence;

import com.survey.mobilesurvey.entity.SurveyEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MobileSurveyDataAccess extends JpaRepository<SurveyEntity, Long> {


   List<SurveyEntity> findByUserId(String userId);

   List<SurveyEntity> findByMemberId(String memberId);


}
