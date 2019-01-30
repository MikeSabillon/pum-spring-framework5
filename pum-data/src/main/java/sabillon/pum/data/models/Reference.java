package sabillon.pum.data.models;

import javax.persistence.Entity;
import javax.persistence.OneToOne;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/*
*@author Miguel Sabillon
*/

/**
 * The Class Reference.
 */
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "REFERENCES")
public class Reference extends Identificable {

    /** The reference. */
    private String reference;

    /** The photo. */
    @OneToOne
    private Photo photo;

}
