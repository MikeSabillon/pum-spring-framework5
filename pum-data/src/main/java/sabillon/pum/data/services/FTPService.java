package sabillon.pum.data.services;

import org.apache.commons.net.ftp.FTPClient;

/*
*@author Miguel Sabillon
*/

public interface FTPService {

    FTPClient open() throws Exception;

    boolean close() throws Exception;

}
