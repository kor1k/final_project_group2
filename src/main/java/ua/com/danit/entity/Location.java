package ua.com.danit.entity;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.LongStream;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@Entity(name = "Location")
@Builder
@Table(name = "locations")
public class Location {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  private String city;

  private String country;

  @OneToMany(
        mappedBy = "location",
        cascade = CascadeType.ALL,
        orphanRemoval = true)
  private Set<Talent> talents = new HashSet<>();

  @OneToMany(
        mappedBy = "location",
        cascade = CascadeType.ALL,
        orphanRemoval = true)
  private Set<Employer> employers = new HashSet<>();
}
