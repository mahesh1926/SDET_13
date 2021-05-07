package com.crm.vtiger.Genericutils;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.maven.surefire.shared.utils.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListImgClass implements ITestListener {

	public void onTestFailure(ITestResult result) {
		
		String currentdate = new Date().toString().replace(":", "_").replace(" ", "_");
		String FailedTestname = result.getMethod().getMethodName();
		
		EventFiringWebDriver ed= new EventFiringWebDriver(BaseClass.sdriver);
		File srcimg = ed.getScreenshotAs(OutputType.FILE);
		File destimg=new File("./screenshot/"+FailedTestname+"_"+currentdate+".png");
		try {
			FileUtils.copyFile(srcimg, destimg);
		} catch (IOException e) {
			
		}
	
	}}
