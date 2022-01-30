package com.nokhrin.webtestproject.repository;

import com.nokhrin.webtestproject.model.AppUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AppUserRepository extends JpaRepository<AppUser,Long> {
    AppUser findById(long id);
    AppUser findByEmail(String lastName);
}
