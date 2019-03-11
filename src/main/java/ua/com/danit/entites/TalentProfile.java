package ua.com.danit.entites;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import javax.persistence.CascadeType;
import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
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

  @OneToOne(cascade = CascadeType.MERGE)
  @JoinColumn(name = "position-types_id", referencedColumnName = "id")
  @Column(name = "position_type")
  private String positionType;

  @ElementCollection
  @CollectionTable(name = "employment-types", joinColumns = @JoinColumn(name = "id"))
  @Column(name = "employment_type")
  private Set<String> employmentType;

  @ElementCollection
  @CollectionTable(name = "fit-company-types", joinColumns = @JoinColumn(name = "id"))
  @Column(name = "fit_company_types")
  private List<String> fitCompanyTypes;

  @OneToMany(mappedBy = "owner")
  private Set<Skill> skillSet;

  @OneToMany(mappedBy = "owner")
  private Location location;

  @OneToMany(mappedBy = "owner")
  private Integer salary;

  @OneToMany(mappedBy = "owner")
  private List<Link> links;

  @OneToMany(mappedBy = "owner")
  private List<Experience> prevExp;

  @OneToMany(mappedBy = "owner")
  private List<Education> educations;

  @OneToMany(mappedBy = "owner")
  private Set<Language> languages;
}