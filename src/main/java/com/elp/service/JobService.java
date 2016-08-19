/**
 * 定时任务服务接口
 * 2016/08/19 ming
 */
package com.elp.service;

import com.elp.model.SysJobLog;

public interface JobService {

	/**
	 * 保存job日志
	 * @param sysJobLog
	 */
	public void saveSysJobLog(SysJobLog sysJobLog);
	
	/**
	 * Error日志
	 * @param category
	 * @param task
	 * @return
	 */
	public SysJobLog getErrLogEntity(String category, String task);
	
	/**
	 * Success日志
	 * @param category
	 * @param task
	 * @return
	 */
	public SysJobLog getSucLogEntity(String category, String task);
}
