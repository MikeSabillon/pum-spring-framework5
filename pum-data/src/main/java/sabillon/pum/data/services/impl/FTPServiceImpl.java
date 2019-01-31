package sabillon.pum.data.services.impl;

import java.io.IOException;
import java.net.SocketException;
import java.util.List;

import org.apache.commons.net.ftp.FTPClient;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import sabillon.pum.data.dtos.PhotoDto;
import sabillon.pum.data.models.UploadReportPhoto;
import sabillon.pum.data.repositories.UploadReportPhotoRepository;
import sabillon.pum.data.services.FTPService;

/*
*@author Miguel Sabillon
*/

/**
 * The Class FTPServiceImpl.
 */
@Service
public class FTPServiceImpl implements FTPService {

    /** The logger. */
    private final Logger logger = LoggerFactory.getLogger(FTPServiceImpl.class);

    private final UploadReportPhotoRepository uploadReportPhotoRepository;

    /** The server. */
    @Value("${ftp.server}")
    private String server;

    /** The port. */
    @Value("${ftp.port}")
    private Integer port;

    /** The user. */
    @Value("${ftp.user}")
    private String user;

    /** The pass. */
    @Value("${ftp.pass}")
    private String pass;

    /** The client. */
    private FTPClient client;

    public FTPServiceImpl(UploadReportPhotoRepository uploadReportPhotoRepository) {
        this.uploadReportPhotoRepository = uploadReportPhotoRepository;
    }

    /*
     * (non-Javadoc)
     * 
     * @see sabillon.pum.data.services.FTPService#open()
     */
    @Override
    public FTPClient open() throws SocketException, IOException {
        // logger.info("Attempting connection to ftp server...");
        // this.client.connect(this.server, this.port);
        // logger.info("Connected: " + this.client.isConnected());
        // boolean loggedIn = this.client.login(this.user, this.pass);
        // logger.info("Logged In: " + loggedIn);
        return null;
    }

    /*
     * (non-Javadoc)
     * 
     * @see sabillon.pum.data.services.FTPService#close()
     */
    @Override
    public boolean close() throws Exception {
        // logger.info("Closing connection to fpt...");
        // this.client.logout();
        // this.client.disconnect();
        // logger.info("Connection closed successfully.");
        return false;
    }

    /*
     * (non-Javadoc)
     * 
     * @see sabillon.pum.data.services.FTPService#uploadPhotos(java.util.List)
     */
    @Override
    public List<UploadReportPhoto> uploadPhotos(List<PhotoDto> photos) {
        return null;
    }

}
