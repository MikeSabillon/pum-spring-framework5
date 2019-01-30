package sabillon.pum.data.models;

import javax.persistence.Entity;

import lombok.Getter;
import lombok.Setter;

// TODO: Auto-generated Javadoc
/*
*@author Miguel Sabillon
*/

/**
 * The Class FtpServer.
 */
@Getter
@Setter
@Entity(name = "FTP_SERVERS")
public class FtpServer extends Identificable {

    /** The name. */
    private String name;

    /** The server. */
    private String server;

    /** The username. */
    private String username;

    /** The password. */
    private String password;

}
