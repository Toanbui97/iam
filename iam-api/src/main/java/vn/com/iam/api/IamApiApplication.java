package vn.com.iam.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@ComponentScan("vn.com.iam")
@EnableMongoRepositories("vn.com.iam.core.repository")
public class IamApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(IamApiApplication.class, args);
    }

}
