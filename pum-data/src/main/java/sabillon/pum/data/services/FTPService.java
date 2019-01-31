package sabillon.pum.data.services;

import java.util.List;

import org.apache.commons.net.ftp.FTPClient;

import sabillon.pum.data.dtos.PhotoDto;
import sabillon.pum.data.models.UploadReportPhoto;

/*
*@author Miguel Sabillon
*/

/**
 * The Interface FTPService.
 */
public interface FTPService {

    /**
     * Open.
     *
     * @return the FTP client
     * @throws Exception
     *             the exception
     */
    FTPClient open() throws Exception;

    /**
     * Close.
     *
     * @return true, if successful
     * @throws Exception
     *             the exception
     */
    boolean close() throws Exception;

    /**
     * Upload photos.
     *
     * @param photos
     *            the photos
     * @return the list
     */
    List<UploadReportPhoto> uploadPhotos(List<PhotoDto> photos);

}
