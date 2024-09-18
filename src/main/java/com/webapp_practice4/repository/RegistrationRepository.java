package com.webapp_practice4.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.webapp_practice4.entity.RegistrationEntity;

public interface RegistrationRepository extends JpaRepository<RegistrationEntity, Long>{


}