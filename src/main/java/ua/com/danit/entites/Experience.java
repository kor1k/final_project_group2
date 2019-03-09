package ua.com.danit.entites;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
@Table(name = "experiences")
public class Experience {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  private String company;
  private String position;
  private Date dateStarted;
  private Date dateFinished;
  private String description;
}
