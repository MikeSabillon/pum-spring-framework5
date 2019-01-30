package sabillon.pum.data.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import sabillon.pum.data.models.Reference;

/**
 * The Interface ReferenceRepository.
 */
/*
 * @author Miguel Sabillon
 */
@Repository
public interface ReferenceRepository extends CrudRepository<Reference, Long> {

}
