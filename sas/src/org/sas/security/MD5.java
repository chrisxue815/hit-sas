package org.sas.security;

import org.springframework.security.authentication.encoding.Md5PasswordEncoder;


public class MD5
{
  public static String get(String str)
  {
    return new Md5PasswordEncoder().encodePassword(str, null); 
  }
}
