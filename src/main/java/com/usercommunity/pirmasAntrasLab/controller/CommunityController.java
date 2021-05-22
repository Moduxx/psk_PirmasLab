package com.usercommunity.pirmasAntrasLab.controller;

import com.usercommunity.pirmasAntrasLab.service.CommunityService;
import org.hibernate.service.spi.InjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CommunityController {

    @Autowired
    private CommunityService communityService;
    // display list of communities
    @GetMapping("/")
    public String viewHomePage(Model model) {
        model.addAttribute("listCommunities", communityService.getAllCommunities());
        return "index";
    }
}
