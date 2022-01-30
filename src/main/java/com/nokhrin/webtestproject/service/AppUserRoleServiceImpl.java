package com.nokhrin.webtestproject.service;

import com.nokhrin.webtestproject.model.AppUserRole;
import com.nokhrin.webtestproject.repository.AppUserRoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AppUserRoleServiceImpl implements AppUserRoleService {

    @Autowired
    AppUserRoleRepository appUserRoleRepository;

    @Override
    public void addAppUserRole(AppUserRole myUserRole) {
        appUserRoleRepository.save(myUserRole);
    }

    @Override
    public List<AppUserRole> listAppUserRole() {
        return appUserRoleRepository.findAll();
    }

    @Override
    public AppUserRole getAppUserRole(String role) {
        return appUserRoleRepository.findByRole(role);
    }
}
