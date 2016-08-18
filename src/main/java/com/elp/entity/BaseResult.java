package com.elp.entity;

public class BaseResult {
	private Long err_code;  //错误码
	private Object data;   //数据域

	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}

	public Long getErr_code() {
		return err_code;
	}

	public void setErr_code(Long err_code) {
		this.err_code = err_code;
	}

	public BaseResult(Long err_code) {
		super();
		this.err_code = err_code;
		this.data = null;
	}

	public BaseResult() {
		super();
		this.err_code = 0L;
		this.data = null;
	}		
}
