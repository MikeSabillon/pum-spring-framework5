package sabillon.pum.data.dtos;

import java.sql.Timestamp;

import lombok.Getter;
import lombok.Setter;

/*
*@author Miguel Sabillon
*/

@Getter
@Setter
public class PhotoDto {

    /** The code. */
    private String code;

    /** The name. */
    private String name;

    /** The extension. */
    private String extension;

    /** The dir. */
    private String dir;

    /** The modified date. */
    private Timestamp modifiedDate;

    /** The photo. */
    private Byte[] photo;

    /** The uploaded. */
    private boolean uploaded;

}
