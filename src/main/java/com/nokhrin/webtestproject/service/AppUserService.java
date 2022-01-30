package com.nokhrin.webtestproject.service;

import com.nokhrin.webtestproject.model.AppUser;

import java.util.List;

public interface AppUserService {
    void addMyUser(AppUser appUser);

    void editMyUser(AppUser appUser);

    List<AppUser> listMyUsers();

    void removeMyUser(long id);

    AppUser getMyUser(long id);

    AppUser getByEmail(String email);
}
