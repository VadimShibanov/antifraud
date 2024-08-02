package com.bank.antifraud.mapper;

import com.bank.antifraud.dto.SuspiciousCardTransferDTO;
import com.bank.antifraud.entity.SuspiciousCardTransfer;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface SuspiciousCardTransferMapper {

    SuspiciousCardTransfer ToSuspiciousCardTransfer (SuspiciousCardTransferDTO suspiciousCardTransferDTO);
    List<SuspiciousCardTransferDTO> SuspiciousCardTransferListToDTO (List<SuspiciousCardTransfer> suspiciousCardTransferList);
}
