package com.cakecatalog.srv.auth.client.model;

public class CreatePortalUserResponse {

  private Long id;
  private String name;
  private String email;

  @Override
  public String toString() {
    return "CreatePortalUserResponse{" +
      "id=" + getId() +
      ", name='" + getName() + '\'' +
      ", email='" + getEmail() + '\'' +
      '}';
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }
}
