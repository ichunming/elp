/**
 * properties util类
 * 2016/08/23 ming
 */
package com.elp.util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class PropUtil {
	private static final Logger logger = LoggerFactory.getLogger(PropUtil.class);
	
	/**
	 * 加载properties文件，转换成map类型返回
	 * @param filePath
	 * @return
	 */
	public static Map<String, String> getPropMap(String filePath) {
		Map<String, String> map = new HashMap<String, String>();
		
		Properties prop = new Properties();
		InputStream is = null;
		InputStreamReader isr = null;
		String loadSuccess = "load properties file success:" + filePath;
		String loadError = "run into an error when load properties file:" + filePath;
		
		try {
			is = new FileInputStream(filePath);
			isr = new InputStreamReader(is, "UTF-8");
			prop.load(isr);
			// key set
			Set<Object> keySet = prop.keySet();
			Iterator<Object> it = keySet.iterator();
			String key = "";
			map.clear();
			// add properties to map
			while(it.hasNext()) {
				key = (String)it.next(); 
				map.put(key, prop.getProperty(key));
			}
			// print status
			logger.debug(loadSuccess);
		} catch (FileNotFoundException e) {
			// print status
			logger.debug(loadError);
			e.printStackTrace();
		} catch (IOException e) {
			// print status
			logger.debug(loadError);
			e.printStackTrace();
		} finally {
			if(null != is) {
				try {
					is.close();
				} catch (IOException e) {
					// print status
					logger.error(loadError);
					e.printStackTrace();
				}
			}
			if(null != isr) {
				try {
					isr.close();
				} catch (IOException e) {
					// print status
					logger.error(loadError);
					e.printStackTrace();
				}
			}
		}
		
		return map;
	}
}
