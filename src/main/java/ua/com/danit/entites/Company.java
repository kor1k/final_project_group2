package ua.com.danit.entites;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.List;

@Data
@Entity
@Table(name = "companies")
public class Company {
  private Long id;
  private String companyName;
  private List<Recruiter> emploees;
//  private Location location;
}
