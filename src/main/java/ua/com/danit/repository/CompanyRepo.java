package ua.com.danit.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ua.com.danit.entites.Company;

@Repository
public interface CompanyRepo extends JpaRepository<Company, Long> {

}
