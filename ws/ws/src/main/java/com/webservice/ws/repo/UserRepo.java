package com.webservice.ws.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import com.webservice.ws.models.User;

public interface UserRepo extends JpaRepository<User, Long>{

}
