package com.vhre.ingest.modules.hive.mapper;

import com.vhre.base.core.base.mapper.BaseMapper;
import com.vhre.ingest.modules.hive.dto.HiveDTO;
import com.vhre.ingest.modules.hive.entity.Hive;
import org.mapstruct.Builder;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring", builder = @Builder(disableBuilder = true))
public interface HiveMapper extends BaseMapper<Hive, HiveDTO> {
}
