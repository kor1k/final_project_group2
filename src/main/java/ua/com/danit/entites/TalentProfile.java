package ua.com.danit.entites;

import lombok.Data;

import java.util.List;

@Data
public class TalentProfile {
  private Long id;
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