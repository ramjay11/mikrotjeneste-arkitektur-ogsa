package com.ramjava.bruker.tjeneste.controller;

import com.ramjava.bruker.tjeneste.entity.Bruker;
import com.ramjava.bruker.tjeneste.service.BrukerService;
import com.ramjava.bruker.tjeneste.valueobject.ResponseTemplateVO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/brukere")
@Slf4j
public class BrukerController {
    private BrukerService service;

    public BrukerController(BrukerService service) {
        this.service = service;
    }

    @PostMapping("/")
    public Bruker saveBruker(@RequestBody Bruker bruker) {
        log.info("Inside saveBruker of BrukerController: {}", bruker);
        return service.saveBruker(bruker);
    }
    @GetMapping("/{id}")
    public ResponseTemplateVO getBrukerWithAvdeling(@RequestBody Long userId) {
        log.info("Inside getBrukerWithAvdeling of BrukerController");
        return service.getBrukerWithAvdeling(userId);
    }
}
