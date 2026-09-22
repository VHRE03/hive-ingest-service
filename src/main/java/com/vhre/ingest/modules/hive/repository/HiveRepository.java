package com.vhre.ingest.modules.hive.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.vhre.ingest.modules.hive.entity.Hive;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface HiveRepository extends JpaRepository<Hive, UUID> {
}