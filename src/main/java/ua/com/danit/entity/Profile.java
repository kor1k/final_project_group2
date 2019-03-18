package ua.com.danit.entity;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.MapsId;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@Entity(name = "Profile")
@AllArgsConstructor
@Table(name = "profiles")
public class Profile {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @OneToOne(fetch = FetchType.LAZY)
  @MapsId
  private Talent talent;

  private Double preferredSalary;

  @ManyToMany(cascade = {
        CascadeType.PERSIST,
        CascadeType.MERGE })
  @JoinTable(name = "talent_skills",
        joinColumns = @JoinColumn(name = "talent_id"),
        inverseJoinColumns = @JoinColumn(name = "skill_id"))
  private Set<Skill> skills = new HashSet<>();

  @OneToMany(mappedBy = "profile")
  private Set<Language> languages = new HashSet<>();

  @OneToMany(mappedBy = "profile")
  private Set<Education> educations;

  @OneToMany(mappedBy = "profile")
  private Set<Education> experience;

}