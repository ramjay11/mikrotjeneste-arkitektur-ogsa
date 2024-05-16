package com.ramjava.bruker.tjeneste.service;

import com.ramjava.bruker.tjeneste.entity.Bruker;
import com.ramjava.bruker.tjeneste.repository.BrukerRepository;
import com.ramjava.bruker.tjeneste.valueobject.Avdeling;
import com.ramjava.bruker.tjeneste.valueobject.ResponseTemplateVO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
@Slf4j
public class BrukerService {
    private BrukerRepository repository;
    private RestTemplate template;

    public BrukerService(BrukerRepository repository, RestTemplate template) {
        this.repository = repository;
        this.template = template;
    }
    public Bruker saveBruker(Bruker bruker) {
        log.info("Inside saveBruker of BrukerService");
        return repository.save(bruker);
    }

    public ResponseTemplateVO getBrukerWithAvdeling(Long userId) {
        log.info("Inside getBrukerWithAvdeling of BrukerService");
        var vo = new ResponseTemplateVO();
        var bruker = repository.findByUserId(userId);
        Avdeling avdeling = template.getForObject("http://localhost:9091/avdelinger/" +
                bruker.getDepartmentId(), Avdeling.class);
        vo.setBruker(bruker);
        vo.setAvdeling(avdeling);
        return vo;
    }
}
