package org.example.calculator;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class ConsoleLoggerListener implements ITestListener {

    @Override
    public void onTestSuccess(ITestResult result) {
        System.out.println("Test passed. " + result.getMethod().getMethodName());
    }

    @Override
    public void onTestFailure(ITestResult result) {
        System.out.println("Test failed. " + result.getMethod().getMethodName());
    }

    @Override
    public void onTestSkipped(ITestResult result) {
        System.out.println("Test skipped. " + result.getMethod().getMethodName());
    }
}
