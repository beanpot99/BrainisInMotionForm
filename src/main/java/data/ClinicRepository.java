package data;

import com.brainsInMotion.brainsinmotionforms.models.ClinicForm;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClinicRepository extends CrudRepository<ClinicForm, Integer> {
}
