/**
 * Job Service Implement
 * ming 2016/08/19
 */
package com.elp.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.elp.consts.AppConst;
import com.elp.dao.SysJobLogDao;
import com.elp.model.SysJobLog;
import com.elp.service.JobService;

@Service
public class JobServiceImpl implements JobService {

	@Autowired
	private SysJobLogDao sysJobLogDao;

	/**
	 * 保存job日志
	 * @param sysJobLog
	 */
	@Override
	public void saveSysJobLog(SysJobLog sysJobLog) {
		sysJobLogDao.insert(sysJobLog);
	}

	/**
	 * Error日志
	 * @param category
	 * @param task
	 * @return
	 */
	@Override
	public SysJobLog getErrLogEntity(String category, String task) {
		SysJobLog sysJobLog = new SysJobLog();
		sysJobLog.setStatus(AppConst.JOB_STATUS_FAIL);
		sysJobLog.setCategory(category);
		sysJobLog.setTask(task);
		sysJobLog.setNotes(task + "失败");
		
		return sysJobLog;
	}
	
	/**
	 * Success日志
	 * @param category
	 * @param task
	 * @return
	 */
	 @Override
	public SysJobLog getSucLogEntity(String category, String task) {
		SysJobLog sysJobLog = new SysJobLog();
		sysJobLog.setStatus(AppConst.JOB_STATUS_SUCCESS);
		sysJobLog.setCategory(category);
		sysJobLog.setTask(task);
		sysJobLog.setNotes("");
		
		return sysJobLog;
	 }
}
