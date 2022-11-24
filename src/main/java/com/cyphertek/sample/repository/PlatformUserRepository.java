package com.cyphertek.sample.repository;

import com.cyphertek.sample.entity.PlatformUserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PlatformUserRepository extends JpaRepository<PlatformUserEntity, Integer> {
}
