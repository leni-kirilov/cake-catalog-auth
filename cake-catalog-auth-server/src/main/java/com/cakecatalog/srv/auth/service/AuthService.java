package com.cakecatalog.srv.auth.service;

import com.cakecatalog.srv.auth.domain.PortalUser;
import com.cakecatalog.srv.auth.domain.PortalUserRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AuthService {

  private static final Logger log = LoggerFactory.getLogger(AuthService.class);

  @Autowired
  PortalUserRepository repository;

  public boolean login(String email, String password) {
    PortalUser existingUser = repository.findOneByEmail(email);
    log.info("Found user: " + (existingUser != null ? existingUser.email : null));
    if (existingUser != null) {
      log.info("Checking passwords:...");
      return existingUser.password.equals(password);
    }

    return false;
  }
}


//curl -k -X POST -H "Content-Type: application/json" 'http://localhost:8080/login' -d '{"email":"sample@email.com","password":"samplePassword"}'
//curl -k -X GET -H "Content-Type: application/json" 'http://localhost:8080/hello'