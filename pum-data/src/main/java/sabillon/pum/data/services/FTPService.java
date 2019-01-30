package sabillon.pum.data.services;

import org.apache.commons.net.ftp.FTPClient;

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

    // List<T> uploadPhotos(List<PhotoDto> photos);

}
