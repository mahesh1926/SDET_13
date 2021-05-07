package com.crm.vtiger.Genericutils;

import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;


/**
 * 
 * @author Mahesh
 *
 */
public class FileUtility {
	/**
	 * This method used to read data from properties and return the value based on key specified
	 * @param key
	 * @return
	 * @throws Throwable
	 */
	
	
	 public String getPropertyKeyValue(String key) throws Throwable {
		  FileInputStream file=new FileInputStream(IPathConstant.PROPERTY_FILEPATH);
		  Properties prop=new Properties();
		  prop.load(file);
		  return prop.getProperty(key);
	}
	 
	 /**
	  * 
	  * @param jsonkey
	  * @return
	 * @throws Throwable 
	 * @throws IOException 
	  */

	 public String getdataFromJson(String jsonkey) throws Throwable {
		FileReader reader=new FileReader(IPathConstant.JSONFILEPATH);
		 JSONParser parser=new JSONParser();
		Object object = parser.parse(reader);
		JSONObject jsonobject=(JSONObject)object;
		String value = jsonobject.get(jsonkey).toString();
		return value; 
	
	 }
}
