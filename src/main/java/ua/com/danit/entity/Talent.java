package ua.com.danit.entity;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@Entity(name = "Talent")
@AllArgsConstructor
@Table(name = "talents")
public class Talent {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  private String fullName;

  private String email;

  private String password;

  @ManyToOne(fetch = FetchType.LAZY)
  private Location location;

  @OneToOne(fetch = FetchType.LAZY)
  private Profile profile;

}
