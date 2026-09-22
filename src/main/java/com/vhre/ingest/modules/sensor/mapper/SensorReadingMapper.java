package com.vhre.ingest.modules.sensor.mapper;

import com.vhre.base.core.base.mapper.BaseMapper;
import com.vhre.ingest.modules.sensor.dto.SensorReadingDTO;
import com.vhre.ingest.modules.sensor.entity.SensorReading;
import org.mapstruct.Builder;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring", builder = @Builder(disableBuilder = true))
public interface SensorReadingMapper extends BaseMapper<SensorReading, SensorReadingDTO> {
}