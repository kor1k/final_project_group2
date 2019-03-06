package ua.com.danit.entites;

import lombok.Data;

import java.util.List;

@Data
public class TalentProfile {
  private String positionType;
  private byte employmentType;
  private Location location;
  private int salary;
  private List<String> fitTypes;
  private List<Link> links;
  private List<Experience> prevExp;
  private List<Education> educations;
  private List<String> languages;
}