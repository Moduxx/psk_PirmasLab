package com.usercommunity.pirmasAntrasLab.repository;

import com.usercommunity.pirmasAntrasLab.model.Community;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CommunityRepository extends JpaRepository<Community, Integer> {
}
