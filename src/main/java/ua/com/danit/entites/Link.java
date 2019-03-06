package ua.com.danit.entites;

import lombok.Data;

@Data
public class Link {
  private Long id;
  private String name;
  private String url;
  private TalentProfile talent;
}
