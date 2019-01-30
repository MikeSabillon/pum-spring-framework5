package sabillon.pum.data.models;

import java.sql.Timestamp;

import javax.persistence.Entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * The Class PhotoFilter.
 */
/*
 * @author Miguel Sabillon
 */

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "PHOTO_FILTERS")
public class PhotoFilter extends Identificable {

    /** The pattern. */
    private String pattern;

    /** The modified date. */
    private Timestamp modifiedDate;

}
