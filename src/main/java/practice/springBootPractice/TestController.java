package practice.springBootPractice;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class TestController {

	@Autowired
	ReportService reportService;

	@RequestMapping("/back")
	public String hello(HttpServletRequest req, HttpServletResponse res) {
		String first = req.getParameter("first");
		String second = req.getParameter("second");
		String third = req.getParameter("third");
		Report report = new Report();
		report.setFirst(first);
		report.setSecond(second);
		report.setThird(third);
		reportService.addReport(report);

		return "test";

	}

	// @RequestMapping("/back")
	// public String return1(Model model,String name) {
	// System.out.println("process return1");
	// Report report=new Report();
	// report.setFirst("test1");
	// report.setSecond("test2");
	// report.setThird("test3");
	// reportService.addReport(report);
	//
	//
	// return "test";
	//
	// }

	// @RequestMapping("/go")
	// public String return2() {
	// return "test";
	// }
	//

}
