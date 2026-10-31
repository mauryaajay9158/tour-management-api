package com.tourmanagement.Controllers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Wanderlust Tour & Travel Management System
 * System Information & Health Check Controller
 *
 * @author Ajay Kushwaha
 * @institution BE IT, Mumbai University
 * @project Final Year Major Project
 */
@RestController
@RequestMapping("/info")
public class SystemInfoController {

    @Value("${app.name:Wanderlust Tour Management System}")
    private String appName;

    @Value("${app.version:1.0.0}")
    private String appVersion;

    @Value("${app.developer:Ajay Kushwaha}")
    private String developer;

    @Value("${app.institution:BE IT, Mumbai University}")
    private String institution;

    @GetMapping
    public ResponseEntity<Map<String, Object>> getSystemInfo() {
        Map<String, Object> info = new LinkedHashMap<>();
        info.put("application", appName);
        info.put("version", appVersion);
        info.put("developer", developer);
        info.put("institution", institution);
        info.put("academicProject", "Bachelor of Engineering (Information Technology) - Final Year Project");
        info.put("javaVersion", System.getProperty("java.version"));
        info.put("framework", "Spring Boot 3.1.4 / Java 21");
        info.put("status", "ONLINE");
        info.put("timestamp", LocalDateTime.now().toString());
        return ResponseEntity.ok(info);
    }
}
