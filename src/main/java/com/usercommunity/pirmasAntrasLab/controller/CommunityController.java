package com.usercommunity.pirmasAntrasLab.controller;

import com.usercommunity.pirmasAntrasLab.model.Community;
import com.usercommunity.pirmasAntrasLab.service.CommunityService;
import org.hibernate.service.spi.InjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CommunityController {

    @Autowired
    private CommunityService service;

    @RequestMapping("/")
    public String index(Model model)
    {
        List<Community> com = service.getCommunities();
        model.addAttribute("comList", com);
        return "index";
    }

    /*
    @PostMapping("/addCommunity")
    public Community addCommunity(@RequestBody Community community)
    {
        return service.saveCommunity(community);
    }

    @PostMapping("/addCommunities")
    public List<Community> addCommunities(@RequestBody List<Community> communities)
    {
        return service.saveCommunities(communities);
    }

    @GetMapping("/communities")
    public List<Community> findAllCommunities()
    {
        return service.getCommunities();
    }

    @GetMapping("/communityById/{id}")
    public Community findCommunityById(@PathVariable int id)
    {
        return service.getCommunityById(id);
    }

    @PutMapping("/updateCommunity")
    public Community updateCommunity(@RequestBody Community community)
    {
        return service.updateCommunity(community);
    }

    @DeleteMapping("/deleteCommunity/{id}")
    public String deleteCommunity(@PathVariable int id)
    {
        return service.deleteCommunity(id);
    }
     */
}
