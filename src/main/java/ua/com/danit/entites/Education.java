package ua.com.danit.entites;

import lombok.Data;

import java.util.Date;

@Data
public class Education {
  private Long id;
  private String institution;
  private EducationDegree degree;
  private String specialisation;
  private Date dateStarted;
  private Date dateEnded;
}
