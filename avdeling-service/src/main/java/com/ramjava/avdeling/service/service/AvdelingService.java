package com.ramjava.avdeling.service.service;

import com.ramjava.avdeling.service.entity.Avdeling;
import com.ramjava.avdeling.service.repository.AvdelingRepo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class AvdelingService {
    private AvdelingRepo avdelingRepo;

    public AvdelingService(AvdelingRepo avdelingRepo) {
        this.avdelingRepo = avdelingRepo;
    }

    public Avdeling saveAvdeling(Avdeling avdeling) {
        log.info("Inside saveAvdeling method of AvdelingService: {}", avdeling);
        return avdelingRepo.save(avdeling);
    }

    public Avdeling findAvdelingById(Long departmentId) {
        log.info("Inside saveAvdeling of AvdelingService");
        return avdelingRepo.findByAvdelingId(departmentId);
    }
}
