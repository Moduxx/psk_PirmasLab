package com.usercommunity.pirmasAntrasLab.repository;

import com.usercommunity.pirmasAntrasLab.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
}
