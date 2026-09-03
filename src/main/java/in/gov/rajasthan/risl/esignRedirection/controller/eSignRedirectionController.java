package in.gov.rajasthan.risl.esignRedirection.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("api/esign")
public class eSignRedirectionController {

    @GetMapping("ping")
    public Map<String, String> ping() {
        return Map.of("message", "ok");
    }
}
