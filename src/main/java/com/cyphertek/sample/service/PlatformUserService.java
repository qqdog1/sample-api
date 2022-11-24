package com.cyphertek.sample.service;

import com.cyphertek.sample.entity.PlatformUserEntity;
import com.cyphertek.sample.repository.PlatformUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PlatformUserService {
    @Autowired
    private PlatformUserRepository platformUserRepository;

    public List<PlatformUserEntity> getAllUsers() {
        return platformUserRepository.findAll();
    }

    public PlatformUserEntity insertNewUser(PlatformUserEntity platformUserEntity) {
        return platformUserRepository.save(platformUserEntity);
    }
}
