package com.vhre.ingest.modules.hive.dto;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.vhre.base.core.base.dto.BaseDTO;
import com.vhre.ingest.modules.hive.enums.HiveStatus;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
@Schema(description = "Data Transfer Object representing a Hive")
@JsonPropertyOrder({
        "id",
        "locationCode",
        "generalStatus",
        "createdAt",
        "updatedAt",
        "deleted"
})
public class HiveDTO extends BaseDTO {
    @Schema(description = "Code for the location where the Hive is situated", example = "LOC123")
    @NotNull(message = "The location code is mandatory")
    @Pattern(regexp = "^[A-Za-z0-9]{1,50}$", message = "The location code must be a maximum of 50 characters, alphanumeric only")
    private String locationCode;

    @Schema(description = "General status of the Hive (active, inactive, under maintenance)", example = "ACTIVE")
    @NotNull(message = "The general status is mandatory")
    private HiveStatus generalStatus;
}
