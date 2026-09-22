package com.vhre.ingest.modules.sensor.controller;

import com.vhre.base.core.base.controller.BaseController;
import com.vhre.ingest.modules.sensor.dto.SensorReadingDTO;
import com.vhre.ingest.modules.sensor.entity.SensorReading;
import com.vhre.ingest.modules.sensor.service.SensorReadingService;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
@RequestMapping("/api/v1/sensor-readings")
@Tag(name = "Sensor Reading Management", description = "Endpoints for managing Sensor Readings")
public class SensorReadingController extends BaseController<SensorReading, SensorReadingDTO, UUID> {
    public SensorReadingController(SensorReadingService service) {
        super(service);
    }
}