package ua.com.danit.entites;

import lombok.Data;

@Data
public class Recruiter {
  private Long id;
  private String fullName;
  private String companyEmail;
  private Integer phoneNumber;
  private String companyName;
  private Location location;

}
