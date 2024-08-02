package com.bank.antifraud.mapper;

import com.bank.antifraud.entity.SuspiciousAccountTransfer;
import com.bank.antifraud.dto.SuspiciousAccountTransferDTO;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface SuspiciousAccountTransferMapper {

    SuspiciousAccountTransfer ToSuspiciousAccountTransfer (SuspiciousAccountTransferDTO suspiciousAccountTransferDTO);
    List<SuspiciousAccountTransferDTO> SuspiciousAccountTransferListToDTO (List<SuspiciousAccountTransfer> suspiciousAccountTransferList);
}
