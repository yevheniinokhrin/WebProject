package com.nokhrin.webtestproject.repository;

import com.nokhrin.webtestproject.model.AppUser;
import com.nokhrin.webtestproject.model.AppUserRole;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AppUserRoleRepository extends JpaRepository<AppUserRole,Long> {
    AppUserRole findById(long id);
    AppUserRole findByRole(String role);
}
