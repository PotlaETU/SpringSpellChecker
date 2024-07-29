package com.projects.springspellchecker.controller;

import com.projects.springspellchecker.dto.SpellCheckerRequestDto;
import com.projects.springspellchecker.dto.SpellCheckerResponseDto;
import com.projects.springspellchecker.service.SpellCheckerService;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@AllArgsConstructor
@RequestMapping("/v1/spell-check")
@RestController
public class SpringSpellCheckerController {

    private final SpellCheckerService spellCheckerService;

    @PostMapping
    public SpellCheckerResponseDto spellCheck(@Valid @RequestBody SpellCheckerRequestDto request) {
        return this.spellCheckerService.spellCheck(request);
    }
}
