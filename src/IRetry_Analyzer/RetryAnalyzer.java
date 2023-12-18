package IRetry_Analyzer;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryAnalyzer implements IRetryAnalyzer {
	//interfce in nature use to retry test cases multiple times in case of any failure

	int count=0;
	int retrycount=2;
	@Override
	public boolean retry(ITestResult result) {
		if(count<retrycount) {
			count++;
			return true;
		}
		
		return false;
	}

}
