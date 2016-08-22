/**
 * 系统预留用户信息更新
 * 2016/08/19 ming
 */
package com.elp.job;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import com.elp.model.ReserveUserInfo;
import com.elp.model.SysJobLog;
import com.elp.model.UserInfo;
import com.elp.service.JobService;
import com.elp.service.UserService;
import com.elp.util.AppConst;

@Component
public class ReserveUserInfoUpdateJob {
	private static Logger logger = LoggerFactory.getLogger(ReserveUserInfoUpdateJob.class);
	
	@Autowired
	private UserService userService;
	
	@Autowired
	private JobService jobService;
	
	@Scheduled(cron = "0 25 11 * * ?")
	public void run() {
		logger.debug("定时任务：系统预留用户信息更新...");
		logger.debug("时间：" + new java.util.Date());
		
		// 变量定义
		UserInfo userInfo = null; // 用户信息
		SysJobLog sysJobLog = null; // 定时任务执行结果
		
		// 系统预留用户信息取得
		logger.debug("系统预留用户信息取得");
		List<ReserveUserInfo> ruis = userService.findAllReserveUserInfo();
		
		for(ReserveUserInfo rui : ruis) {
			// check预留用户信息是否被使用
			logger.debug("check预留用户信息是否被使用：" + rui.getUsername());
			userInfo = userService.findUserInfoByUsername(rui.getUsername());
			if(null == userInfo) {
				// 预留用户信息未被使用
				logger.debug("预留用户信息未被使用");
				
				// 预留用户信息恢复
				logger.debug("预留用户信息恢复");
				rui.setStatus(AppConst.RESERVE_USER_INFO_STATUS_FREE);
			} else {
				// 预留用户信息已被使用
				logger.debug("预留用户信息已被使用");
				rui.setStatus(AppConst.RESERVE_USER_INFO_STATUS_USED);
			}
			// 预留用户信息更新
			logger.debug("预留用户信息更新");
			userService.updateReserveUserInfo(rui);
		}
		
		// 定时任务执行结果记录
		logger.debug("定时任务执行结果记录");
		sysJobLog = jobService.getSucLogEntity(AppConst.JOB_CATEGORY_RES_USER_INFO_UPD, "");
		jobService.saveSysJobLog(sysJobLog);
	}
}
