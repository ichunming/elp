/**
 * 分页实体类
 * 2015/11/07 chunming
 */
package com.elp.entity;

import java.util.Date;

import com.elp.consts.AppConst;

public class Page {
	// 总条数
	private int totalNumber;
	
	// 总页数
	private int totalPage;
	
	// 当前页
	private int currentPage;
	
	// 每页显示条数
	private int pageNumber;
	
	// 数据库中limit参数，从第几条开始取
	private int dbIndex;
	
	// 数据库中limit参数，一共多少条
	private int dbNumber;
	
	// 时间参数，解决检索重复数据问题
	private Date date;
	
	/**
	 * default construct
	 */
	public Page() {
	}

	/**
	 * construct with currentPage,totalNumber
	 * @param curPage
	 * @param totalNumber
	 */
	public Page(int curPage, int totalNumber, int pageNumber, Date date) {
		this.currentPage = curPage;
		this.totalNumber = totalNumber;
		this.pageNumber = pageNumber;
		this.date = date;
	}
	
	/**
	 * 根据参数计算相关属性
	 */
	public void count() {
		count(AppConst.DEFAULT_PAGE_COUNT);
	}

	/**
	 * 根据参数计算相关属性
	 */
	public void count(int pageNumber) {
		// 总页数
		this.pageNumber = pageNumber;
		// 页面增量
		int plus = (this.totalNumber % this.pageNumber) == 0?0:1;
		this.totalPage = this.totalNumber / this.pageNumber + plus;
		if(this.totalPage <= 0) {
			this.totalPage = 1;
		}
		
		// 当前页数
		if(this.currentPage < 1) {
			this.currentPage = 1;
		} else if(this.currentPage > this.totalPage) {
			this.currentPage = this.totalPage;
		}

		// 设置limit参数
		this.dbIndex = (this.currentPage - 1) * this.pageNumber;
		this.dbNumber = this.pageNumber;
	}
	
	public int getTotalNumber() {
		return totalNumber;
	}

	public void setTotalNumber(int totalNumber) {
		this.totalNumber = totalNumber;
	}

	public int getTotalPage() {
		return totalPage;
	}

	public void setTotalPage(int totalPage) {
		this.totalPage = totalPage;
	}

	public int getCurrentPage() {
		return currentPage;
	}

	public void setCurrentPage(int currentPage) {
		this.currentPage = currentPage;
	}

	public int getPageNumber() {
		return pageNumber;
	}

	public void setPageNumber(int pageNumber) {
		this.pageNumber = pageNumber;
	}

	public int getDbIndex() {
		return dbIndex;
	}

	public void setDbIndex(int dbIndex) {
		this.dbIndex = dbIndex;
	}

	public int getDbNumber() {
		return dbNumber;
	}

	public void setDbNumber(int dbNumber) {
		this.dbNumber = dbNumber;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}
}
