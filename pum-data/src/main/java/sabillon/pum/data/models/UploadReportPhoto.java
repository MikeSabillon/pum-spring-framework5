package sabillon.pum.data.models;

import javax.persistence.Entity;
import javax.persistence.OneToOne;

import lombok.Getter;
import lombok.Setter;

/*
*@author Miguel Sabillon
*/
/**
 * The Class UploadReportPhoto.
 */
@Getter
@Setter
@Entity(name = "UPLOAD_REPORT_PHOTOS")
public class UploadReportPhoto extends Identificable {

    /** The uploaded. */
    private boolean uploaded;

    /** The photo. */
    @OneToOne
    private Photo photo;

}
