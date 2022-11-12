package recursomulta.backend.controller;

import lombok.extern.log4j.Log4j2;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import recursomulta.backend.requests.RecursoDeMultaPost;

import javax.validation.Valid;

@RestController
@RequestMapping("recurso-de-multa")
@Log4j2
public class RecursoDeMultaController {

    @PostMapping
    public ResponseEntity<RecursoDeMultaPost> createRecursoDeMulta(@RequestBody @Valid RecursoDeMultaPost recursoDeMultaPost) {
        log.info(recursoDeMultaPost);

        return ResponseEntity.ok(recursoDeMultaPost);
    }
}
