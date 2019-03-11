package ua.com.danit.entites;

import lombok.Builder;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.Set;

@Data
@Builder
@Entity
@Table(name = "companies")
public class Company {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  private String companyName;

  @ManyToOne
  @JoinColumns({
      @JoinColumn(name = "employers_id", referencedColumnName = "id", nullable = false),
  })
  private Set<Employer> employers;

  @ManyToOne
  @JoinColumns({
      @JoinColumn(name = "jobs_id", referencedColumnName = "id", nullable = false),
  })
  private Set<Employer> jobs;

  @OneToMany(mappedBy = "owner")
  private Location location;
}
