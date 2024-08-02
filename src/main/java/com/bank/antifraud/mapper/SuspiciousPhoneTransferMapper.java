package com.bank.antifraud.mapper;

import com.bank.antifraud.entity.SuspiciousPhoneTransfer;
import com.bank.antifraud.dto.SuspiciousPhoneTransferDTO;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface SuspiciousPhoneTransferMapper {

    SuspiciousPhoneTransfer ToSuspiciousPhoneTransfer (SuspiciousPhoneTransferDTO suspiciousPhoneTransferDTO);
    List<SuspiciousPhoneTransferDTO> SuspiciousPhoneTransferListToDTO (List<SuspiciousPhoneTransfer> suspiciousPhoneTransferList);
}
