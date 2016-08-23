/**
 * 分页共通组件
 * 2016/08/23 ming
 */
package com.elp.util;

import java.util.Date;

import com.elp.consts.AppConst;
import com.elp.entity.Page;

public class PageUtil {

	/**
	 * Page对象取得
	 * @param curPage
	 * @param totalNumber
	 * @return
	 */
	public static Page getPage(int curPage, int totalNumber) {
		return getPage(curPage, totalNumber, AppConst.DEFAULT_PAGE_COUNT, new Date());
	}
	
	/**
	 * Page对象取得
	 * @param curPage
	 * @param totalNumber
	 * @param pageNumber
	 * @return
	 */
	public static Page getPage(int curPage, int totalNumber, int pageNumber) {
		return getPage(curPage, totalNumber, pageNumber, new Date());
	}
	
	/**
	 * Page对象取得
	 * @param curPage
	 * @param totalNumber
	 * @param date
	 * @return
	 */
	public static Page getPage(int curPage, int totalNumber, Date date) {
		return getPage(curPage, totalNumber, AppConst.DEFAULT_PAGE_COUNT, date);
	}
	
	/**
	 * Page对象取得
	 * @param curPage
	 * @param totalNumber
	 * @param pageNumber
	 * @param date
	 * @return
	 */
	public static Page getPage(int curPage, int totalNumber, int pageNumber, Date date) {
		Page page = new Page(curPage, totalNumber, pageNumber, new Date());
		page.count();
		return page;
	}
}
