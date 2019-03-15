package ua.com.danit.entity;

import lombok.Data;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import java.time.LocalDate;

@Data
@Entity(name = "Experience")
@Table(name = "experiences")
public class Experience {

  @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  private String company;

  private String position;

  private LocalDate dateStarted;

  private LocalDate dateFinished;

  private String description;

  @ManyToOne(cascade = CascadeType.MERGE, fetch = FetchType.LAZY)
  @JoinColumn(name = "profile_id", nullable = false)
  private Profile profile;


}
