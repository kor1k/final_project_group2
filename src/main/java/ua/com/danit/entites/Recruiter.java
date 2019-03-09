package ua.com.danit.entites;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "recruiters")
public class Recruiter {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
  private String password;
  private String fullName;
  private String companyEmail;
  private Integer phoneNumber;
  private String companyName;
  private Location location;
}
