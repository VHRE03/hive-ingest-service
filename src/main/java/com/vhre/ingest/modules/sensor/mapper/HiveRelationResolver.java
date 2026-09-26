package com.vhre.ingest.modules.sensor.mapper;

import com.vhre.ingest.modules.hive.entity.Hive;
import com.vhre.ingest.modules.hive.repository.HiveRepository;
import jakarta.persistence.EntityNotFoundException;
import org.mapstruct.Named;
import org.springframework.stereotype.Component;

import java.util.UUID;

/**
 * Resuelve la relación SensorReading → Hive a partir del `hiveId` del DTO.
 * <p>
 * MapStruct no puede inferir por si solo la conversión UUID → entidad JPA,
 * por lo que este componente expone un método `@Named("hiveById")` que el
 * {@link SensorReadingMapper} referencia al mapear lecturas de sensores.
 * Si la colmena no existe se lanza EntityNotFoundException (HTTP 404).
 */
@Component
public class HiveRelationResolver {

    private final HiveRepository hiveRepository;

    public HiveRelationResolver(HiveRepository hiveRepository) {
        this.hiveRepository = hiveRepository;
    }

    @Named("hiveById")
    public Hive hiveById(UUID hiveId) {
        return hiveRepository.findById(hiveId)
                .orElseThrow(() -> new EntityNotFoundException(
                        "Hive " + hiveId + " does not exist; register it before sending readings."));
    }
}
