package ua.com.danit.entites;

import lombok.Data;

@Data
public class Talent {
  private Long id;
  private String fullName;
  private String email;
  private Location location;
}
