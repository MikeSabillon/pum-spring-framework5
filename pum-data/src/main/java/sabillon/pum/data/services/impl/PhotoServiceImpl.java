package sabillon.pum.data.services.impl;

import java.sql.Timestamp;
import java.util.List;

import org.springframework.stereotype.Service;

import sabillon.pum.data.dtos.PhotoDto;
import sabillon.pum.data.models.Photo;
import sabillon.pum.data.repositories.PhotoRepository;
import sabillon.pum.data.services.PhotoService;

/*
*@author Miguel Sabillon
*/

@Service
public class PhotoServiceImpl implements PhotoService {

    private final PhotoRepository photoRepository;

    public PhotoServiceImpl(PhotoRepository photoRepository) {
        this.photoRepository = photoRepository;
    }

    @Override
    public boolean uploadPhotos(List<PhotoDto> photos) {
        for (PhotoDto photo : photos) {
            Photo newPhoto = new Photo();
            newPhoto.setName(photo.getName());
            newPhoto.setCode(photo.getCode());
            newPhoto.setExtension(photo.getExtension());
            newPhoto.setDir(photo.getDir());
            newPhoto.setModifiedDate(new Timestamp(System.currentTimeMillis()));
            newPhoto = this.photoRepository.save(newPhoto);
        }
        return true;
    }

}
