package com.projects.springspellchecker.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record SpellCheckerRequestDto(@NotNull(message = "Text can't be null")
                                     @NotBlank(message = "Text can't be blank")
                                     String text) {
}
