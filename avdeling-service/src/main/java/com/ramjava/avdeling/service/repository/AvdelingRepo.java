package com.ramjava.avdeling.service.repository;

import com.ramjava.avdeling.service.entity.Avdeling;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AvdelingRepo extends JpaRepository<Avdeling, Long> {
    Avdeling findByAvdelingId(Long departmentId);
}
