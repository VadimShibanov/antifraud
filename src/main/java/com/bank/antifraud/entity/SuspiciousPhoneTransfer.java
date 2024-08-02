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

public class SuspiciousPhoneTransfer {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column
    private Long SuspiciousPhoneTransfersId;

    @Column(unique = true)
    private Long phoneTransferId;

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
