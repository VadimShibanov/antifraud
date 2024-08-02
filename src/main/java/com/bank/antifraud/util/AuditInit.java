package com.bank.antifraud.util;

import com.bank.antifraud.dto.AuditDTO;
import com.bank.antifraud.entity.Audit;
import com.bank.antifraud.service.AuditService;

import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.time.ZonedDateTime;

@Component
@AllArgsConstructor
public class AuditInit {

    private final AuditService auditService;
    private final ModelMapper modelMapper;

    @PostConstruct
    private void dbInit() {
        AuditDTO auditDTO = new AuditDTO();

        auditDTO.setEntityType("AntiFraud");
        auditDTO.setOperationType("Transfer");
        auditDTO.setCreatedBy("Mr Smith");
        auditDTO.setModifiedBy("Neo");
        auditDTO.setCreatedAt(ZonedDateTime.now());
        auditDTO.setModifiedAt(ZonedDateTime.now());
        auditDTO.setEntityJson("Empty JSON");
        auditDTO.setNewEntityJson("New JSON");

        auditService.add(modelMapper.map(auditDTO, Audit.class));
    }
}
