package hr.kingict.mup.nabis.openapi.playground.service;

import demo.api.DefaultApi;
import demo.model.CharacterClass;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Slf4j
public class TestOpenApiService {

    private final DefaultApi defaultApi;

    public CharacterClass save(CharacterClass characterClass) {
        log.info("save called with {}", characterClass);

        try {
            return defaultApi.classPost(characterClass).getBody();
        } catch (Exception e) {
            return characterClass;
        }

    }
}
