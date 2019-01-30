package sabillon.pum.data.services;

import java.util.List;

import sabillon.pum.data.dtos.PhotoDto;

/*
*@author Miguel Sabillon
*/

/**
 * The Interface PhotoService.
 */
public interface PhotoService {

    /**
     * Upload photos.
     *
     * @param photos
     *            the photos
     * @return true, if successful
     */
    boolean uploadPhotos(List<PhotoDto> photos);

}
