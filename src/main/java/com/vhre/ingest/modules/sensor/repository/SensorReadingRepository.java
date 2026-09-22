package com.vhre.ingest.modules.sensor.repository;

import com.vhre.ingest.modules.sensor.entity.SensorReading;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface SensorReadingRepository extends JpaRepository<SensorReading, UUID> {
}