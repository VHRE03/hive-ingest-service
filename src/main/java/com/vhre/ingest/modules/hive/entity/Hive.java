package com.vhre.ingest.modules.hive.entity;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.vhre.base.core.base.entity.BaseEntity;
import com.vhre.ingest.modules.hive.enums.HiveStatus;
import com.vhre.ingest.modules.sensor.entity.SensorReading;
import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "hives")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Hive extends BaseEntity {
    @Column(nullable = false, length = 100)
    private String locationCode;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private HiveStatus generalStatus;

    @JsonManagedReference
    @OneToMany(mappedBy = "hive", cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.LAZY)
    @Builder.Default
    private List<SensorReading> sensorReadings = new ArrayList<>();

    public void addSensorReading(SensorReading reading) {
        sensorReadings.add(reading);
        reading.setHive(this);
    }

    public void removeSensorReading(SensorReading reading) {
        sensorReadings.remove(reading);
        reading.setHive(null);
    }
}
