package sabillon.pum.data.models;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

import lombok.Getter;
import lombok.Setter;

/**
 * The Class Identificable.
 */
/*
 * @author Miguel Sabillon
 */
@Getter
@Setter
@MappedSuperclass
public class Identificable {

    /** The id. */
    @Id
    @GeneratedValue
    private Long id;

}
