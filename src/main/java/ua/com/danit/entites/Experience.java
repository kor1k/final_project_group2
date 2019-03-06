package ua.com.danit.entites;

import lombok.Data;

import java.util.Date;

@Data
public class Experience {
  private String company;
  private String position;
  private Date dateStarted;
  private Date dateFinished;
  private String description;
}
