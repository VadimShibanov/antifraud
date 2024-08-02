package com.bank.antifraud.controller;

import com.bank.antifraud.service.AntiFraudService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import io.swagger.v3.oas.annotations.Operation;

@RestController
@RequestMapping("/anti-fraud")

public class AntiFraudController {

    private AntiFraudService antiFraudService;

    @Operation(summary = "block account transfer")
    @PostMapping("/block-accounttransfer")
    public ResponseEntity<String> blockAccountTransfer(@RequestParam Long AccountTransferId, @RequestParam String reason) {
        antiFraudService.blockAccountTransfer(AccountTransferId, reason);
        return ResponseEntity.ok("Transfer with ID" + AccountTransferId + "has been blocked due to" + reason);
    }

    @Operation(summary = "block card transfer")
    @PostMapping("/block-cardtransfer")
    public ResponseEntity<String> blockCardTransfer(@RequestParam Long CardTransferId, @RequestParam String reason) {
        antiFraudService.blockCardTransfer(CardTransferId, reason);
        return ResponseEntity.ok("Transfer with ID" + CardTransferId + "has been blocked due to" + reason);
    }

    @Operation(summary = "block phone transfer")
    @PostMapping("/block-phonetransfer")
    public ResponseEntity<String> blockPhoneTransfer(@RequestParam Long PhoneTransferId, @RequestParam String reason) {
        antiFraudService.blockPhoneTransfer(PhoneTransferId, reason);
        return ResponseEntity.ok("Transfer with ID" + PhoneTransferId + "has been blocked due to" + reason);
    }

    @Operation(summary = "mark account transfer")
    @PostMapping("/mark-suspiciousaccount")
    public ResponseEntity<String> markSuspiciousAccount(@RequestParam Long AccountTransferId, @RequestParam String reason) {
        antiFraudService.markSuspiciousAccount(AccountTransferId, reason);
        return ResponseEntity.ok("Transfer with ID" + AccountTransferId + "has been marked as suspicious due to" + reason);
    }

    @Operation(summary = "mark card transfer")
    @PostMapping("/mark-suspiciouscard")
    public ResponseEntity<String> markSuspiciousCard(@RequestParam Long CardTransferId, @RequestParam String reason) {
        antiFraudService.markSuspiciousCard(CardTransferId, reason);
        return ResponseEntity.ok("Transfer with ID" + CardTransferId + "has been marked as suspicious due to" + reason);
    }

    @Operation(summary = "mark phone transfer")
    @PostMapping("/mark-suspiciousphone")
    public ResponseEntity<String> markSuspiciousPhone(@RequestParam Long PhoneTransferId, @RequestParam String reason) {
        antiFraudService.markSuspiciousPhone(PhoneTransferId, reason);
        return ResponseEntity.ok("Transfer with ID" + PhoneTransferId + "has been marked as suspicious due to" + reason);
    }

    @Operation(summary = "unmark account transfer")
    @PostMapping("/unmark-suspiciousaccount")
    public ResponseEntity<String> unmarkSuspiciousAccount(@RequestParam Long AccountTransferId) {
        antiFraudService.unmarkSuspiciousAccount(AccountTransferId);
        return ResponseEntity.ok("Transfer with ID" + AccountTransferId + "has been unmarked as suspicious");
    }

    @Operation(summary = "unmark card transfer")
    @PostMapping("/unmark-suspiciouscard")
    public ResponseEntity<String> unmarkSuspiciousCard(@RequestParam Long CardTransferId) {
        antiFraudService.unmarkSuspiciousCard(CardTransferId);
        return ResponseEntity.ok("Transfer with ID" + CardTransferId + "has been unmarked as suspicious");
    }

    @Operation(summary = "unmark phone transfer")
    @PostMapping("/unmark-suspiciousphone")
    public ResponseEntity<String> unmarkSuspiciousPhone(@RequestParam Long PhoneTransferId) {
        antiFraudService.unmarkSuspiciousPhone(PhoneTransferId);
        return ResponseEntity.ok("Transfer with ID" + PhoneTransferId + "has been unmarked as suspicious");
    }
}
