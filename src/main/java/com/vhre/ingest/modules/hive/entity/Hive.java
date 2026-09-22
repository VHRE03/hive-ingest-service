package com.vhre.ingest.modules.hive.entity;

import com.vhre.base.core.base.entity.BaseEntity;
import com.vhre.ingest.modules.hive.enums.HiveStatus;
import jakarta.persistence.*;
import lombok.*;

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
}
