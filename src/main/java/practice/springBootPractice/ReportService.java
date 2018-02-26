package practice.springBootPractice;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;





@Service(value="reportService")
public class ReportService implements ReportService_interface{
	
	
	@Resource
	ReportRepository reportRepository;

	@Override
	public void addReport(Report report) {
		// TODO Auto-generated method stub
		
		reportRepository.save(report);
		
	}
	
	

	
	
	
	
}
