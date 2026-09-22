package com.vhre.ingest.modules.hive.controller;

import com.vhre.base.core.base.controller.BaseController;
import com.vhre.ingest.modules.hive.dto.HiveDTO;
import com.vhre.ingest.modules.hive.entity.Hive;
import com.vhre.ingest.modules.hive.service.HiveService;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
@RequestMapping("/api/v1/hives")
@Tag(name = "Hive Management", description = "Endpoints for managing Hive")
public class HiveController extends BaseController<Hive, HiveDTO, UUID> {
    public HiveController(HiveService service) {
        super(service);
    }
}