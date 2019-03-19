package ua.com.danit.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Data;
import ua.com.danit.entity.Location;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Data
@Builder
@Entity(name = "Employer")
@Table(name = "employers")
public class Employer {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  private String fullName;

  private String workEmail;

  private String password;

  private String phoneNumber;

  @ManyToOne(fetch = FetchType.LAZY)
  private Company company;

  @ManyToOne(fetch = FetchType.LAZY)
  private Location location;

}
