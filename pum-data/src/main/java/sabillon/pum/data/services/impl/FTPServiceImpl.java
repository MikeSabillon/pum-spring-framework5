package sabillon.pum.data.services.impl;

import java.io.IOException;
import java.net.SocketException;

import org.apache.commons.net.ftp.FTPClient;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

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
    private static Logger LOGGER = LoggerFactory.getLogger(FTPServiceImpl.class);

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

    /**
     * Instantiates a new FTP service impl.
     */
    public FTPServiceImpl() {
        this.client = new FTPClient();
    }

    /*
     * (non-Javadoc)
     * 
     * @see sabillon.pum.data.services.FTPService#open()
     */
    @Override
    public FTPClient open() throws SocketException, IOException {
        this.client.connect(this.server, this.port);
        this.client.login(this.user, this.pass);
        return this.client;
    }

    /*
     * (non-Javadoc)
     * 
     * @see sabillon.pum.data.services.FTPService#close()
     */
    @Override
    public boolean close() throws Exception {
        this.client.logout();
        this.client.disconnect();
        return this.client.isConnected();
    }

}
