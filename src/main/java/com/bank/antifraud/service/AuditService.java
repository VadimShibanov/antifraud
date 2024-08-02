package com.bank.antifraud.service;

import com.bank.antifraud.entity.Audit;
import com.bank.antifraud.repository.AuditRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class AuditService {
    private final AuditRepository auditRepository;

    public void add(Audit audit){

        auditRepository.save(audit);
    }

    public List<Audit> getAuditByEntityType(String entityType) {

        return auditRepository.findByEntityType(entityType);
    }
}
