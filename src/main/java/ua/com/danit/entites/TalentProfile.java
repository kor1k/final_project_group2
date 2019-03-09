package ua.com.danit.entites;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
@Table(name = "talent-profiles")
public class TalentProfile {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
  private String password;
  private String positionType;
  private Byte employmentType;
  private Location location;
  private Integer salary;
  private List<String> fitTypes;
  private List<Link> links;
  private List<Experience> prevExp;
  private List<Education> educations;
  private List<Language> languages;
}