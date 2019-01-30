package sabillon.pum.web.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

public interface PhotoController {

    @PostMapping("/upload")
    default ResponseEntity<Boolean> uploadPhoto() {
        return new ResponseEntity<>(false, HttpStatus.NOT_IMPLEMENTED);
    }

    @GetMapping("/download")
    default ResponseEntity<Byte[]> getPhoto(@RequestParam("id") Integer id) {
        return new ResponseEntity<>(null, HttpStatus.NOT_IMPLEMENTED);
    }

}
