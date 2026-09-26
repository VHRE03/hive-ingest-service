package com.vhre.ingest.modules.sensor.mapper;

import com.vhre.base.core.base.mapper.BaseMapper;
import com.vhre.ingest.modules.sensor.dto.SensorReadingDTO;
import com.vhre.ingest.modules.sensor.entity.SensorReading;
import org.mapstruct.Builder;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;

import java.util.List;

/**
 * Mapper SensorReading ↔ SensorReadingDTO.
 * <p>
 * El DTO viaja con `hiveId` (UUID) mientras la entidad usa la relación
 * `hive`; la conversión la resuelve {@link HiveRelationResolver}.
 */
@Mapper(componentModel = "spring", builder = @Builder(disableBuilder = true), uses = HiveRelationResolver.class)
public interface SensorReadingMapper extends BaseMapper<SensorReading, SensorReadingDTO> {

    @Override
    @Mapping(target = "hive", source = "hiveId", qualifiedByName = "hiveById")
    SensorReading toEntity(SensorReadingDTO dto);

    @Override
    @Mapping(target = "hiveId", source = "hive.id")
    SensorReadingDTO toDto(SensorReading entity);

    @Override
    @Mapping(target = "hiveId", source = "hive.id")
    List<SensorReadingDTO> toDtos(List<SensorReading> entities);

    @Override
    @Mapping(target = "hive", source = "hiveId", qualifiedByName = "hiveById")
    void updateEntityFromDto(SensorReadingDTO dto, @MappingTarget SensorReading entity);
}
