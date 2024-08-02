package com.bank.antifraud.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity

public class SuspiciousCardTransfer {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column
    private Long SuspiciousCardTransferId;

    @Column(unique = true)
    private Long cardTransferId;

    @Column
    private Boolean IsBlocked;

    @Column
    private Boolean IsSuspicious;

    @Column
    private String BlockedReason;

    @Column
    private String SuspiciousReason;

    public int getTransferAmount() {
        return 0;
    }
}
