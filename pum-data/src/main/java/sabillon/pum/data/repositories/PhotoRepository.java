package sabillon.pum.data.repositories;

import org.springframework.data.repository.CrudRepository;

import sabillon.pum.data.models.Photo;

/*
*@author Miguel Sabillon
*/

/**
 * The Interface PhotoRepository.
 */
public interface PhotoRepository extends CrudRepository<Photo, Long> {

}
