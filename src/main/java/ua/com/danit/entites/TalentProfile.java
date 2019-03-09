package ua.com.danit.entites;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.List;
import java.util.Set;

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
  private Set<Skill> skillSet;
  private Location location;
  private Integer salary;
  private List<String> fitCompanyTypes;
  private List<Link> links;
  private List<Experience> prevExp;
  private List<Education> educations;
  private Set<Language> languages;
}