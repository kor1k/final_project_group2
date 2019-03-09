package ua.com.danit.entites;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "languages")
public class Language {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  private String name;
  private TalentProfile talent;
  private String level;
}
