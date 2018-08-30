package com.ntq.demo.hazelcast.demohazelcast;

import com.ntq.demo.hazelcast.demohazelcast.domain.User;
import com.ntq.demo.hazelcast.demohazelcast.domain.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

import javax.annotation.PostConstruct;
import java.util.List;

@SpringBootApplication
@EnableCaching
public class DemoHazelcastApplication {

    UserService userService;

    public DemoHazelcastApplication(UserService userService) {
        this.userService = userService;
    }

    @PostConstruct
    public void initApplication() {
    }

    public static void main(String[] args) {
        SpringApplication.run(DemoHazelcastApplication.class, args);
    }


}
