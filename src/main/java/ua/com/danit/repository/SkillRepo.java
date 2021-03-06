package ua.com.danit.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ua.com.danit.entity.Skill;

@Repository
public interface SkillRepo extends JpaRepository<Skill, Long> {
}
