package com.bank.antifraud.dto;

import lombok.Data;
import org.springframework.stereotype.Component;
import javax.validation.constraints.*;

@Component
@Data
public class SuspiciousAccountTransferDTO {

    @NotNull(message = "Should be not NULL")
    @Min(5)
    @Max(1_000_000_000)
    private Long accountTransferId;

    @NotNull(message = "Should be not NULL")
    private Boolean IsBlocked;

    @NotNull(message = "Should be not NULL")
    private Boolean IsSuspicious;

    @NotBlank(message = "Should be not BLANK")
    private String BlockedReason;

    @NotBlank(message = "Should be not BLANK")
    private String SuspiciousReason;
}
