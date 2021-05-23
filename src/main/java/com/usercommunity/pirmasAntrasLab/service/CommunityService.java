package com.usercommunity.pirmasAntrasLab.service;

import com.usercommunity.pirmasAntrasLab.model.Community;
import com.usercommunity.pirmasAntrasLab.repository.CommunityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommunityService {
    @Autowired
    private CommunityRepository repository;

    public Community saveCommunity(Community community)
    {
        return repository.save(community);
    }

    public List<Community> saveCommunities(List<Community> communities)
    {
        return repository.saveAll(communities);
    }

    public Community getCommunityById(int id)
    {
        return repository.findById(id).orElse(null);
    }

    public List<Community> getCommunities()
    {
        return repository.findAll();
    }

    public String deleteCommunity(int id)
    {
        repository.deleteById(id);
        return "Community removed ! " + id;
    }

    public Community updateCommunity(Community community)
    {
        Community existingCommunity=repository.findById(community.getId()).orElse(null);
        existingCommunity.setName(community.getName());
        existingCommunity.setURL(community.getURL());
        return repository.save(existingCommunity);
    }
}
