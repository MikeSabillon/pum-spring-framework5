package sabillon.pum.data.models;

import javax.persistence.Entity;

import lombok.Getter;
import lombok.Setter;

/*
*@author Miguel Sabillon
*/

@Getter
@Setter
@Entity(name = "PHOTOS")
public class Photos {

    private String code;
    private String name;
    private String dir;

}
