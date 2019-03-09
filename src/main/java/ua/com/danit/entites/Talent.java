package ua.com.danit.entites;

import lombok.Data;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "talents")
public class Talent {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @Column(name="full_name")
  private String fullName;

  private String email;
  @OneToOne(cascade = CascadeType.MERGE)
  @JoinColumn(name = "location_id", referencedColumnName = "id")
  private Location location;
}
