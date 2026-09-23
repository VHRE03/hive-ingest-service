package com.vhre.ingest.modules.sensor.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.vhre.base.core.base.entity.BaseEntity;
import com.vhre.ingest.modules.hive.entity.Hive;
import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;

@Entity
@Table(name = "sensor_readings")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class SensorReading extends BaseEntity {
    @Column(nullable = false, precision = 10, scale = 2)
    private BigDecimal temperature;

    @Column(nullable = false, precision = 5, scale = 2)
    private BigDecimal noiseLevelDb;

    @JsonBackReference
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "hive_id", nullable = false, foreignKey = @ForeignKey(name = "fk_sensor_reading_hive"))
    private Hive hive;
}
