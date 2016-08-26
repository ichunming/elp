/**
 * 应用启动/关闭监听器
 * 2015/10/20 chunming
 */
package com.elp.listener;

import java.util.Map;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.context.WebApplicationContext;

import com.elp.util.BlockManager;
import com.elp.util.MessageManager;
import com.elp.util.PropUtil;

/**
 * Application Lifecycle Listener implementation class startupListener
 *
 */
public class startupListener implements ServletContextListener {

	 WebApplicationContext  webApplicationContext = null;
	 Logger logger = LoggerFactory.getLogger(this.getClass());
    /**
     * Default constructor. 
     */
    public startupListener() {}

	/**
     * @see ServletContextListener#contextInitialized(ServletContextEvent)
     */
    @Override
    public void contextInitialized(ServletContextEvent servletcontextevent) {
    	logger.info("应用程序启动...");

    	// load block
    	BlockManager blockManager = new BlockManager();
    	blockManager.init();
    	// 保存block
    	servletcontextevent.getServletContext().setAttribute("blockManager", blockManager);
    	
    	// load message
    	MessageManager.loadMessage(this.getClass().getClassLoader().getResource("message.properties").getPath());
    	
		// success
		logger.info("应用程序启动成功!");
    }
   
	/**
     * @see ServletContextListener#contextDestroyed(ServletContextEvent)
     */
    @Override
    public void contextDestroyed(ServletContextEvent servletcontextevent) {
    	logger.info("应用程序关闭!");
    }
	
}
