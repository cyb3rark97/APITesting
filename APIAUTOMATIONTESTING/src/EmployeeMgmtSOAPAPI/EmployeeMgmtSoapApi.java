package EmployeeMgmtSOAPAPI;
import java.io.IOException;

import org.apache.xmlbeans.XmlException;
import org.testng.annotations.Test;

import com.eviware.soapui.impl.wsdl.WsdlProject;
import com.eviware.soapui.impl.wsdl.WsdlTestSuite;
import com.eviware.soapui.impl.wsdl.testcase.WsdlTestCase;
import com.eviware.soapui.impl.wsdl.testcase.WsdlTestCaseRunner;
import com.eviware.soapui.model.support.PropertiesMap;
import com.eviware.soapui.model.testsuite.TestRunner.Status;
import com.eviware.soapui.support.SoapUIException;

import junit.framework.Assert;

public class EmployeeMgmtSoapApi {
	@Test
	public void soapApi() throws XmlException, IOException, SoapUIException {
		WsdlProject wsd = new WsdlProject("C:\\Users\\cyb3r_ark97.cyb3r_ark97\\Downloads\\EmployeeSOAPService.xml");
		WsdlTestSuite testsuite = wsd.getTestSuiteByName("EmployeeMgmtTestSuite");
		for(int i = 0; i < testsuite.getTestCaseCount(); i++)
		{
			WsdlTestCase testCasein = testsuite.getTestCaseAt(i);//FINDS TEST CASE
			WsdlTestCaseRunner runnerin = testCasein.run(new PropertiesMap(), false); //SINCE ONLY ONE TESTSTEP IS PRESENT SO WE CAN RUN TESTCASE ITSELF
			Assert.assertEquals(Status.FINISHED, runnerin.getStatus());
			
		}	
		//WsdlTestCase testCase = testsuite.getTestCaseByName("addEmployee TestCase");
		//WsdlTestCaseRunner runner = testCase.run(new PropertiesMap(), false);
		//Assert.assertEquals(Status.FINISHED, runner.getStatus());

	}
	

}
