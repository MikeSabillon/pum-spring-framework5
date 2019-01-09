package sabillon.pum.web.bootstrap;

import java.io.IOException;

import org.apache.commons.net.ftp.FTPClient;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

/*
*@author Miguel Sabillon
*/
@Component
public class FakeFTPServerInitializer implements CommandLineRunner {

    private static Logger LOGGER = LoggerFactory.getLogger(FakeFTPServerInitializer.class);

    @Override
    public void run(String... args) throws Exception {
        this.initServer();
    }

    private void initServer() throws IOException {
        FTPClient ftpClient = new FTPClient();
        ftpClient.connect("localhost", 51434);
        ftpClient.login("root", "root");
        LOGGER.info(ftpClient.isConnected() + "");
        ftpClient.disconnect();
    }

}