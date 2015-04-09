package com.jeefw.model.sys.param;

import core.support.ExtJSBaseParameter;

/**
 * @author 杨添
 * @框架唯一的升级和技术支持地址：http://shop111863449.taobao.com
 */
public class DepartmentParameter extends ExtJSBaseParameter {

	private String $eq_departmentKey;
	private String $like_departmentValue;
	private String parentDepartmentValue;

	public String get$eq_departmentKey() {
		return $eq_departmentKey;
	}

	public void set$eq_departmentKey(String $eq_departmentKey) {
		this.$eq_departmentKey = $eq_departmentKey;
	}

	public String get$like_departmentValue() {
		return $like_departmentValue;
	}

	public void set$like_departmentValue(String $like_departmentValue) {
		this.$like_departmentValue = $like_departmentValue;
	}

	public String getParentDepartmentValue() {
		return parentDepartmentValue;
	}

	public void setParentDepartmentValue(String parentDepartmentValue) {
		this.parentDepartmentValue = parentDepartmentValue;
	}

}
