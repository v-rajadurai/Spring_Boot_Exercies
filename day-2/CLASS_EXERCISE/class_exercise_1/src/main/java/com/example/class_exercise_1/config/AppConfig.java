package com.example.class_exercise_1.config;

import org.springframework.beans.factory.annotation.Value;

public class AppConfig {
     @Value("Raj")
    private String appName;
    @Value("2025")
    private String appVersion;
    public AppConfig() 
    {
        
    }
    public AppConfig(String appName, String appVersion) {
        this.appName = appName;
        this.appVersion = appVersion;
    }
    public String getAppName() {
        return appName;
    }
    public void setAppName(String appName) {
        this.appName = appName;
    }
    public String getAppVersion() {
        return appVersion;
    }
    public void setAppVersion(String appVersion) {
        this.appVersion = appVersion;
    }


}
