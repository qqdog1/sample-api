package com.cyphertek.sample.controller;

import com.cyphertek.sample.entity.PlatformUserEntity;
import com.cyphertek.sample.service.PlatformUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/user")
public class PlatformUserController {
    @Autowired
    private PlatformUserService platformUserService;

    @GetMapping("")
    public ResponseEntity<List<PlatformUserEntity>> getAllUsers() {
        return ResponseEntity.ok(platformUserService.getAllUsers());
    }

    @PostMapping("")
    public ResponseEntity<PlatformUserEntity> insertNewUser(@RequestBody PlatformUserEntity platformUserEntity) {
        PlatformUserEntity insertedObj = platformUserService.insertNewUser(platformUserEntity);
        if (insertedObj != null) {
            return ResponseEntity.ok(insertedObj);
        }
        return ResponseEntity.badRequest().build();
    }

    @PutMapping("")
    public ResponseEntity<PlatformUserEntity> updateUser() {
        return ResponseEntity.ok().build();
    }
}
