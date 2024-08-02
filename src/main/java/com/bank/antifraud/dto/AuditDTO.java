package com.bank.antifraud.dto;

import lombok.Data;
import org.springframework.stereotype.Component;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.time.ZonedDateTime;

@Component
@Data
public class AuditDTO {

    @NotBlank(message = "Should not be BLANK")
    private String entityType;

    @NotBlank(message = "Should not be BLANK")
    private String operationType;

    @NotBlank(message = "Should not be BLANK")
    private String createdBy;

    @NotBlank(message = "Should not be BLANK")
    private String modifiedBy;

    @NotNull(message = "Should not be NULL")
    private ZonedDateTime createdAt;

    @NotNull(message = "Should not be NULL")
    private ZonedDateTime modifiedAt;

    @NotBlank(message = "Should not be BLANK")
    private String newEntityJson;

    @NotBlank(message = "Should not be BLANK")
    private String entityJson;
}
