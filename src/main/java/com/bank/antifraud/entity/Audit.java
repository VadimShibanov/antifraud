package com.bank.antifraud.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.time.ZonedDateTime;

@Entity
@Data
@NoArgsConstructor
@Table
public class Audit {
    @Id
    @GeneratedValue(strategy= GenerationType.SEQUENCE)
    @Column
    private Long id;

    @Column(length=40)
    @NotBlank(message = "Should not be BLANK")
    private String entityType;

    @Column
    @NotBlank(message = "Should not be BLANK")
    private String operationType;

    @Column
    @NotBlank(message = "Should not be BLANK")
    private String createdBy;

    @Column
    @NotBlank(message = "Should not be BLANK")
    private String modifiedBy;

    @Column
    @NotNull(message = "Should not be NULL")
    private ZonedDateTime createdAt;

    @Column
    @NotNull(message = "Should not be NULL")
    private ZonedDateTime modifiedAt;

    @Column
    @NotBlank(message = "Should not be BLANK")
    private String newEntityJson;

    @Column
    @NotBlank(message = "Should not be BLANK")
    private String entityJson;
}
