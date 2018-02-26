package practice.springBootPractice;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("reportRepository")
public interface ReportRepository  extends JpaRepository<Report, Integer>{

}
