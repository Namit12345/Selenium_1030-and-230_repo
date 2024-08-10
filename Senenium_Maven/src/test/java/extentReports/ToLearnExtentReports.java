package extentReports;

import java.time.LocalDateTime;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ToLearnExtentReports {

	@Test
	public void createReport() {
		String time = LocalDateTime.now().toString().replace(":", "-");
		// step1 : Create Object for ExtentSparkReporter
		ExtentSparkReporter spark=new ExtentSparkReporter("./HTML_reports/extentReports"+time+".html");
		
		// step 2: Create object for ExtentReports
		ExtentReports extReport=new ExtentReports();
		
		// step 3: Attach ExtentSparkReporter to ExtentReports
		extReport.attachReporter(spark);
		
		// step 4: Create ExtentTest object
		ExtentTest test = extReport.createTest("createReport");
		
		// step 5: call log() and provide Status and message
		test.log(Status.PASS, "Successfully created extent report");
		
		// step 6: call flush()
		extReport.flush();
	}
}
