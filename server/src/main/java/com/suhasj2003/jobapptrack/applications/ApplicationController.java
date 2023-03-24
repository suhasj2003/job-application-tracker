package com.suhasj2003.jobapptrack.applications;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "api/v1/application")
public class ApplicationController {
    
    private final ApplicationService applicationService;

    @Autowired
    public ApplicationController(ApplicationService applicationService) {
        this.applicationService = applicationService;
    }

    @GetMapping
    public List<Application> getApplications() {
        return applicationService.getApplications();
    }
    
    @PostMapping
    public void postApplication(@RequestBody Map<String, Object> payload) {
        applicationService.saveNewApplication(payload);
    }
}
