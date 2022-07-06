package com.brainsInMotion.brainsinmotionforms.models.data;

import com.brainsInMotion.brainsinmotionforms.models.ClinicForm;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClinicFormRepository extends CrudRepository<ClinicForm, Integer> {
}
