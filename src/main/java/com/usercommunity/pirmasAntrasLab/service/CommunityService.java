package com.usercommunity.pirmasAntrasLab.service;

import com.usercommunity.pirmasAntrasLab.model.Community;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface CommunityService {
    List<Community> getAllCommunities();
}
