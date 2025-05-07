package com.vanessa.template.platenumbers.dto;

import com.vanessa.template.commons.validation.ValidPlateNumber;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.time.LocalDate;

public record RegisterPlateRequest(
        @NotBlank(message = "Plate number is required")
        @ValidPlateNumber
        String plateNumber,

        @NotNull(message = "Issue date is required")
        LocalDate issueDate
) {
}
