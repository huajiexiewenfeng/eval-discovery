package com.csdn.eval.discovery.spring.web;

import com.csdn.eval.discovery.jraft.DefaultServiceInstance;
import com.csdn.eval.discovery.jraft.JRaftServiceDiscovery;
import java.util.Map;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class MyApplication implements ApplicationListener<ApplicationReadyEvent> {

    @RequestMapping("/")
    String home() {
        return "Hello World!";
    }

    public static void main(String[] args) {
        SpringApplication.run(MyApplication.class, args);
    }

    @Override
    public void onApplicationEvent(ApplicationReadyEvent event) {
        ConfigurableApplicationContext applicationContext = event.getApplicationContext();
        ConfigurableEnvironment environment = applicationContext.getEnvironment();
        JRaftServiceDiscovery jRaftServiceDiscovery = new JRaftServiceDiscovery();
        environment.getSystemProperties().put("service.discovery.jraft.registry.address","127.0.0.1:9081,127.0.0.1:9082,127.0.0.1:9083");
        jRaftServiceDiscovery.initialize(environment.getSystemProperties());
        DefaultServiceInstance serviceInstance = new DefaultServiceInstance();
        serviceInstance.setHost("127.0.0.1");
        serviceInstance.setId("1");
        serviceInstance.setPort(8080);
        serviceInstance.setServiceName("test1");
        jRaftServiceDiscovery.register(serviceInstance);
    }
}