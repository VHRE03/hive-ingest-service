package com.vhre.ingest.modules.sensor.dto;

import com.vhre.base.core.base.dto.BaseDTO;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.math.BigDecimal;
import java.util.UUID;

@Data
@EqualsAndHashCode(callSuper = true)
@Schema(description = "Data Transfer Object representing a Sensor Reading")
public class SensorReadingDTO extends BaseDTO {
    @Schema(description = "Temperature in Celsius", example = "25.00")
    @NotNull(message = "The temperature is mandatory")
    @Positive(message = "The temperature must be positive")
    private BigDecimal temperature;

    @Schema(description = "Noise level in decibels", example = "20.50")
    @NotNull(message = "The noise level is mandatory")
    @Positive(message = "The noise level must be positive")
    private BigDecimal noiseLevelDb;

    @Schema(description = "ID of the hive", example = "3fa85f64-5717-4562-b3fc-2c963f66afa6")
    @NotNull(message = "The hive ID is mandatory")
    private UUID hiveId;
}
