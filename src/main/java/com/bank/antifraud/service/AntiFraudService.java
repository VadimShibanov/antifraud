package com.bank.antifraud.service;

import com.bank.antifraud.entity.SuspiciousAccountTransfer;
import com.bank.antifraud.entity.SuspiciousCardTransfer;
import com.bank.antifraud.entity.SuspiciousPhoneTransfer;
import com.bank.antifraud.repository.SuspiciousAccountTransferRepository;
import com.bank.antifraud.repository.SuspiciousCardTransferRepository;
import com.bank.antifraud.repository.SuspiciousPhoneTransferRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;


@Service
public class AntiFraudService {

    private SuspiciousAccountTransferRepository suspiciousAccountTransferRepository;

    private SuspiciousCardTransferRepository suspiciousCardTransferRepository;

    private SuspiciousPhoneTransferRepository suspiciousPhoneTransferRepository;

    public void blockAccountTransfer(Long accountTransferId, String reason) {
        Optional<SuspiciousAccountTransfer> optionalAccountTransfer = suspiciousAccountTransferRepository.findByAccountTransferId(accountTransferId);

        if (optionalAccountTransfer.isPresent()) {
            SuspiciousAccountTransfer accountTransfer = optionalAccountTransfer.get();
            accountTransfer.setIsBlocked(true);
            accountTransfer.setBlockedReason(reason);
            suspiciousAccountTransferRepository.save(accountTransfer);
        }
    }

    public void blockCardTransfer(Long cardTransferId, String reason) {
        Optional<SuspiciousCardTransfer> optionalCardTransfer = suspiciousCardTransferRepository.findByCardTransferId(cardTransferId);

        if (optionalCardTransfer.isPresent()) {
            SuspiciousCardTransfer cardTransfer = optionalCardTransfer.get();
            cardTransfer.setIsBlocked(true);
            cardTransfer.setBlockedReason(reason);
            suspiciousCardTransferRepository.save(cardTransfer);
        }
    }

    public void blockPhoneTransfer(Long phoneTransferId, String reason) {
        Optional<SuspiciousPhoneTransfer> optionalPhoneTransfer = suspiciousPhoneTransferRepository.findByPhoneTransferId(phoneTransferId);

        if (optionalPhoneTransfer.isPresent()) {
            SuspiciousPhoneTransfer phoneTransfer = optionalPhoneTransfer.get();
            phoneTransfer.setIsBlocked(true);
            phoneTransfer.setBlockedReason(reason);
            suspiciousPhoneTransferRepository.save(phoneTransfer);
        }
    }

    public void markSuspiciousAccount(Long accountTransferId, String reason) {
        Optional<SuspiciousAccountTransfer> optionalAccountTransfer = suspiciousAccountTransferRepository.findByAccountTransferId(accountTransferId);

        if (optionalAccountTransfer.isPresent()) {
            SuspiciousAccountTransfer accountTransfer = optionalAccountTransfer.get();
            if (accountTransfer.getTransferAmount() > 10000) {
                accountTransfer.setIsSuspicious(true);
                accountTransfer.setSuspiciousReason(reason);
                suspiciousAccountTransferRepository.save(accountTransfer);
            }
        }
    }

    public void markSuspiciousCard(Long cardTransferId, String reason) {
        Optional<SuspiciousCardTransfer> optionalCardTransfer = suspiciousCardTransferRepository.findByCardTransferId(cardTransferId);

        if (optionalCardTransfer.isPresent()) {
            SuspiciousCardTransfer cardTransfer = optionalCardTransfer.get();
            if (cardTransfer.getTransferAmount() > 10000) {
                cardTransfer.setIsSuspicious(true);
                cardTransfer.setSuspiciousReason(reason);
                suspiciousCardTransferRepository.save(cardTransfer);
            }
        }
    }

    public void markSuspiciousPhone(Long phoneTransferId, String reason) {
        Optional<SuspiciousPhoneTransfer> optionalPhoneTransfer = suspiciousPhoneTransferRepository.findByPhoneTransferId(phoneTransferId);

        if (optionalPhoneTransfer.isPresent()) {
            SuspiciousPhoneTransfer phoneTransfer = optionalPhoneTransfer.get();
            if (phoneTransfer.getTransferAmount() > 10000) {
                phoneTransfer.setIsSuspicious(true);
                phoneTransfer.setSuspiciousReason(reason);
                suspiciousPhoneTransferRepository.save(phoneTransfer);
            }
        }
    }

    public void unmarkSuspiciousAccount(Long accountTransferId) {
        Optional<SuspiciousAccountTransfer> optionalAccountTransfer = suspiciousAccountTransferRepository.findByAccountTransferId(accountTransferId);

        if (optionalAccountTransfer.isPresent()) {
            SuspiciousAccountTransfer accountTransfer = optionalAccountTransfer.get();
            accountTransfer.setIsSuspicious(false);
            accountTransfer.setSuspiciousReason(null);
            suspiciousAccountTransferRepository.save(accountTransfer);
        }
    }

    public void unmarkSuspiciousCard(Long cardTransferId) {
        Optional<SuspiciousCardTransfer> optionalCardTransfer = suspiciousCardTransferRepository.findByCardTransferId(cardTransferId);

        if (optionalCardTransfer.isPresent()) {
            SuspiciousCardTransfer cardTransfer = optionalCardTransfer.get();
            cardTransfer.setIsSuspicious(false);
            cardTransfer.setSuspiciousReason(null);
            suspiciousCardTransferRepository.save(cardTransfer);
        }
    }

    public void unmarkSuspiciousPhone(Long phoneTransferId) {
        Optional<SuspiciousPhoneTransfer> optionalPhoneTransfer = suspiciousPhoneTransferRepository.findByPhoneTransferId(phoneTransferId);

        if (optionalPhoneTransfer.isPresent()) {
            SuspiciousPhoneTransfer phoneTransfer = optionalPhoneTransfer.get();
            phoneTransfer.setIsSuspicious(false);
            phoneTransfer.setSuspiciousReason(null);
            suspiciousPhoneTransferRepository.save(phoneTransfer);
        }
    }

}
