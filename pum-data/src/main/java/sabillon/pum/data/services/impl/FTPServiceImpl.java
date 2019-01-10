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

@Service
public class FTPServiceImpl implements FTPService {

    private static Logger LOGGER = LoggerFactory.getLogger(FTPServiceImpl.class);

    @Value("${ftp.server}")
    private String server;

    @Value("${ftp.port}")
    private Integer port;

    @Value("${ftp.user}")
    private String user;

    @Value("${ftp.pass}")
    private String pass;

    private FTPClient client;

    public FTPServiceImpl() {
        this.client = new FTPClient();
    }

    @Override
    public FTPClient open() throws SocketException, IOException {
        this.client.connect(this.server, this.port);
        this.client.login(this.user, this.pass);
        return this.client;
    }

    @Override
    public boolean close() throws Exception {
        this.client.logout();
        this.client.disconnect();
        return this.client.isConnected();
    }

}
