package hr.kingict.mup.nabis.openapi.playground.controller;

import demo.model.Barbarian;
import demo.model.CharacterClass;
import demo.model.Wizard;
import hr.kingict.mup.nabis.openapi.playground.service.TestOpenApiService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
@RequiredArgsConstructor
public class TestOpenApiController {

    private final TestOpenApiService service;

    @PostMapping("/wizard")
    public Wizard echo(@RequestBody Wizard wizard) {
        return wizard;
    }

    @PostMapping("/barbarian")
    public Barbarian echo(@RequestBody Barbarian barbarian) {
        return barbarian;
    }

    @PostMapping("/test-save")
    public CharacterClass testSave(@RequestBody CharacterClass characterClass) {
        return service.save(characterClass);
    }
}
