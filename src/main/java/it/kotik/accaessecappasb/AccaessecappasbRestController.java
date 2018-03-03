package it.kotik.accaessecappasb;

import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.InputStreamResource;
import org.springframework.core.io.Resource;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@RestController
public class AccaessecappasbRestController {

    @RequestMapping(value = "/words", method = RequestMethod.GET, produces = "application/json;charset=UTF-8")
    @CrossOrigin
    public ResponseEntity<InputStreamResource> getWords() throws IOException {
        Resource r = new ClassPathResource("static/words.json");

        return ResponseEntity
                .ok()
                .body(new InputStreamResource(r.getInputStream()));
    }
}
