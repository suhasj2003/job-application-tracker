package com.suhasj2003.jobapptrack.applications;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ApplicationService {
    
    private final ApplicationRepository applicationRepository;

    @Autowired
    public ApplicationService(ApplicationRepository applicationRepository) {
        this.applicationRepository = applicationRepository;
    }

    public List<Application> getApplications() {
        return applicationRepository.findAll();
    }

    public void saveNewApplication(Map<String, Object> payload) {
        
        Application newApplication = new Application(
            (String) payload.get("company"),
            (String) payload.get("title"),
            (String) payload.get("jobID")
        );
        applicationRepository.save(newApplication);
    }

}
