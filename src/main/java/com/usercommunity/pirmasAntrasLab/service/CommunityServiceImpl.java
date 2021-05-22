package com.usercommunity.pirmasAntrasLab.service;

import com.usercommunity.pirmasAntrasLab.model.Community;
import com.usercommunity.pirmasAntrasLab.repository.CommunityRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class CommunityServiceImpl implements CommunityService{

    @Autowired
    private CommunityRepository communityRepository;

    @Override
    public List<Community> getAllCommunities() {
        return communityRepository.findAll();
    }
}
