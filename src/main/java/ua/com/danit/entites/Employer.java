package ua.com.danit.entites;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Data
@Builder
@Entity
@Table(name = "employers")
public class Employer {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
  private String password;

  private String fullName;

  private String companyEmail;

  private String phoneNumber;

  @OneToMany(mappedBy = "employers")
  private Company company;

  @OneToMany(mappedBy = "owner")
  private Location location;
}