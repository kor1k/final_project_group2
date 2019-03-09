package ua.com.danit.entites;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
@Table(name = "educations")
public class Education {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  private String institution;
  private String degree;
  private String specialisation;
  private Date dateStarted;
  private Date dateEnded;
}
