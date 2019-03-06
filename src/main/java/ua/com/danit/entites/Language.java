package ua.com.danit.entites;

import lombok.Data;

@Data
public class Language {
  private Long id;
  private String name;
  private TalentProfile talent;
  private String level;
}
