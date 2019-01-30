package sabillon.pum.data.models;

import java.sql.Timestamp;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToOne;

import lombok.Getter;
import lombok.Setter;

/**
 * The Class Photo.
 */
/*
 * @author Miguel Sabillon
 */
@Getter
@Setter
@Entity(name = "PHOTOS")
public class Photo extends Identificable {

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

    /** The report. */
    @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.DETACH, mappedBy = "photo")
    private UploadReportPhoto report;

    /** The reference. */
    @OneToOne(fetch = FetchType.LAZY, mappedBy = "photo")
    private Reference reference;

}
