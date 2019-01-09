package sabillon.pum.web.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Miguel Sabillon The Class PhotoController.
 */
@RestController
@RequestMapping("/photo")
public class PhotoController {

    /**
     * Gets the photo example.
     *
     * @return the photo example
     */
    @GetMapping("/getPhoto")
    public String getPhotoExample() {
        return "Some Photo";
    }

}
