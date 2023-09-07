package by.project.descriptionserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class DescriptionServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(DescriptionServerApplication.class, args);
    }
}
