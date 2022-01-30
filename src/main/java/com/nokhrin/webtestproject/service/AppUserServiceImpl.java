package com.nokhrin.webtestproject.service;

import com.nokhrin.webtestproject.model.AppUser;
import com.nokhrin.webtestproject.repository.AppUserRepository;
import com.nokhrin.webtestproject.repository.AppUserRoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AppUserServiceImpl implements AppUserService {

    @Autowired
    private AppUserRepository appUserRepository;
    @Autowired
    private AppUserRoleRepository appUserRoleRepository;

    @Override
    public void addMyUser(AppUser appUser) {
        //  appUser.get.add(appUserRoleRepository.findByRole("ROLE_USER"));
        appUser.setPassword(hashPassword(appUser.getPassword()));
        appUserRepository.save(appUser);

    }

    @Override
    public void editMyUser(AppUser appUser) {
        appUserRepository.save(appUser);
    }

    @Override
    public List<AppUser> listMyUsers() {
        return appUserRepository.findAll();
    }

    @Override
    public void removeMyUser(long id) {
        appUserRepository.deleteById(id);
    }

    @Override
    public AppUser getMyUser(long id) {
        return appUserRepository.findById(id);
    }

    @Override
    public AppUser getByEmail(String email) {
        return appUserRepository.findByEmail(email);
    }

    private String hashPassword(String password) {
        BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
        return passwordEncoder.encode(password);
    }
}
