package com.projects.springspellchecker.service;

import com.projects.springspellchecker.dto.SpellCheckerRequestDto;
import com.projects.springspellchecker.dto.SpellCheckerResponseDto;
import lombok.AllArgsConstructor;
import org.springframework.ai.chat.prompt.Prompt;
import org.springframework.ai.chat.prompt.PromptTemplate;
import org.springframework.ai.ollama.OllamaChatModel;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
@AllArgsConstructor
public class SpellCheckerService {

    private final OllamaChatModel ollamaChatModel;

    public SpellCheckerResponseDto spellCheck(SpellCheckerRequestDto request) {
        PromptTemplate promptTemplate = new PromptTemplate("Given the following text, identify and correct any spelling errors : {message} ");
        Prompt prompt = promptTemplate.create(Map.of("message", request.text()));
        var modelResponse = ollamaChatModel.call(prompt);
        System.out.println(prompt.getContents() + "  " + prompt.getInstructions());
        return SpellCheckerResponseDto.builder()
                .response(modelResponse.getResult().getOutput().getContent())
                .build();
    }
}
