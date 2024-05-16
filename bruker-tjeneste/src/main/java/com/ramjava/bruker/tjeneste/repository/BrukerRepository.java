package com.ramjava.bruker.tjeneste.repository;

import com.ramjava.bruker.tjeneste.entity.Bruker;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BrukerRepository extends JpaRepository<Bruker, Long> {
    Bruker findByUserId(Long userId);
}
