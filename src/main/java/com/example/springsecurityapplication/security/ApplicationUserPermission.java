package com.example.springsecurityapplication.security;

public enum ApplicationUserPermission {
  STUDENT_READ("student:read"),
    STUDENT_WRITE("studnet:write"),
    COURSE_READ("course:read"),
    COURSE_WRITE("course:write");

  private final String permission;

  ApplicationUserPermission(String permission)
  {
      this.permission = permission;
  }

  public String getPermission(){
      return this.permission;
  }

}

