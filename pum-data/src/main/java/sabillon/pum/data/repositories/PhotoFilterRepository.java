package sabillon.pum.data.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import sabillon.pum.data.models.PhotoFilter;

/**
 * The Interface PhotoFilterRepository.
 */
/*
 * @author Miguel Sabillon
 */
@Repository
public interface PhotoFilterRepository extends CrudRepository<PhotoFilter, Long> {

}
