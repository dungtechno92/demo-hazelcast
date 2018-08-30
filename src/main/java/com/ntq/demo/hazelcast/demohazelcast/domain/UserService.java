package com.ntq.demo.hazelcast.demohazelcast.domain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
@CacheConfig(cacheNames = "users")
public class UserService implements IUserService {
    @Autowired
    UserRepository userRepository;

    @Cacheable()
    public void create(User user) {
        userRepository.save(user);
    }

    @Cacheable()
    public void update(User user) {
        userRepository.save(user);
    }

    @Cacheable()
    public List<User> findAll() {
        return userRepository.findAll();
    }
}
