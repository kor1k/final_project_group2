package ua.com.danit.entites;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "languages")
public class Language {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  private String name;

  @ManyToOne
  @JoinColumns({
      @JoinColumn(name = "talent-profiles_id", referencedColumnName = "id", nullable = false),
      @JoinColumn(name = "employers_id", referencedColumnName = "id", nullable = false),
      @JoinColumn(name = "companies_id", referencedColumnName = "id", nullable = false),
  })
  private TalentProfile owner;

  private String level;
}
