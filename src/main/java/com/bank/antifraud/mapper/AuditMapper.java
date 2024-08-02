package com.bank.antifraud.mapper;

import com.bank.antifraud.dto.AuditDTO;
import com.bank.antifraud.entity.Audit;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface AuditMapper {

    Audit toAudit(AuditDTO auditDTO);
    List<AuditDTO> toAuditDTO(List<Audit> audits);
}
