package com.nokhrin.webtestproject.service;

import com.nokhrin.webtestproject.model.AppUserRole;

import java.util.List;

public interface AppUserRoleService {

    void addAppUserRole(AppUserRole myUserRole);
    List<AppUserRole> listAppUserRole();
    AppUserRole getAppUserRole(String role);
}
