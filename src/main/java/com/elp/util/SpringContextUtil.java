/**
 * Spring 上下文Util
 * 2015/12/02 chunming
 */
package com.elp.util;

import javax.servlet.ServletContext;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;
import org.springframework.web.context.WebApplicationContext;

@Component
public class SpringContextUtil implements ApplicationContextAware {

	// Spring应用上下文环境
	private static WebApplicationContext webApplicationContext;

	@Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		SpringContextUtil.webApplicationContext = (WebApplicationContext) applicationContext;
    }

	/**
	 * 根据名称取得组件
	 * @param name
	 * @return
	 * @throws BeansException
	 */
    @SuppressWarnings("unchecked")
	public static <T> T getBean(String name) throws BeansException {
                return (T) webApplicationContext.getBean(name);
    }
    
    /**
     * 根据类型取得组件
     * @param clz
     * @return
     * @throws BeansException
     */
    @SuppressWarnings("unchecked")
	public static <T> T getBean(Class<?> clz) throws BeansException {
                return (T) webApplicationContext.getBean(clz);
    }
    
    /**
     * Attribute取得
     * @param name
     * @return
     */
    @SuppressWarnings("unchecked")
	public static <T> T getAttribute(String name) {
		ServletContext servletContext = webApplicationContext.getServletContext();
		return (T) servletContext.getAttribute(name);
    }

    /**
     * Attribute设定
     * @param name
     * @param object
     */
	public static void setAttribute(String name, Object object) {
		ServletContext servletContext = webApplicationContext.getServletContext();
		servletContext.setAttribute(name, object);
    }
}
