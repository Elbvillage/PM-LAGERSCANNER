package de.mp.storeman.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import de.mp.storeman.entity.bauteile;

public interface BauteileRepository extends JpaRepository<bauteile, Long> {

  
}