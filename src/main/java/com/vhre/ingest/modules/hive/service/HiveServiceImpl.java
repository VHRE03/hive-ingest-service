package com.vhre.ingest.modules.hive.service;

import com.vhre.base.core.base.service.BaseServiceImpl;
import com.vhre.ingest.modules.hive.dto.HiveDTO;
import com.vhre.ingest.modules.hive.entity.Hive;
import com.vhre.ingest.modules.hive.mapper.HiveMapper;
import com.vhre.ingest.modules.hive.repository.HiveRepository;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class HiveServiceImpl extends BaseServiceImpl<Hive, HiveDTO, UUID> implements HiveService {
    public HiveServiceImpl(HiveRepository repository, HiveMapper mapper) {
        super(repository, mapper);
    }
}
