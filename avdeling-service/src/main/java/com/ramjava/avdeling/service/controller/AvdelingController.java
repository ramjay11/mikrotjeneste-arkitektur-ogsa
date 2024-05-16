package com.ramjava.avdeling.service.controller;

import com.ramjava.avdeling.service.entity.Avdeling;
import com.ramjava.avdeling.service.service.AvdelingService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/avdelinger")
@Slf4j
public class AvdelingController {
    private AvdelingService avdelingService;

    public AvdelingController(AvdelingService avdelingService) {
        this.avdelingService = avdelingService;
    }
    @PostMapping("/")
    public Avdeling saveAvdelingService(@RequestBody Avdeling avdeling) {
        log.info("Inside saveAvdeling method of AvdelingController: {}", avdeling);
        return avdelingService.saveAvdeling(avdeling);
    }
    public Avdeling findAvdelingById(Long id) {
        log.info("Inside findAvdelingById method of AvdelingController: {}", id);
        return avdelingService.findAvdelingById(id);
    }
}
