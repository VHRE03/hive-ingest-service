package com.vhre.ingest.modules.sensor.service;

import com.vhre.base.core.base.service.BaseServiceImpl;
import com.vhre.ingest.modules.sensor.dto.SensorReadingDTO;
import com.vhre.ingest.modules.sensor.entity.SensorReading;
import com.vhre.ingest.modules.sensor.mapper.SensorReadingMapper;
import com.vhre.ingest.modules.sensor.repository.SensorReadingRepository;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class SensorReadingServiceImpl extends BaseServiceImpl<SensorReading, SensorReadingDTO, UUID> implements SensorReadingService {
    public SensorReadingServiceImpl(SensorReadingRepository repository, SensorReadingMapper mapper) {
        super(repository, mapper);
    }
}