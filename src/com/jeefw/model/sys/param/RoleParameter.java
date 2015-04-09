package com.jeefw.model.sys.param;

import core.support.ExtJSBaseParameter;

/**
 * @author 杨添
 * @框架唯一的升级和技术支持地址：http://shop111863449.taobao.com
 */
public class RoleParameter extends ExtJSBaseParameter {

	private String $eq_roleKey;
	private String $like_roleValue;

	public String get$eq_roleKey() {
		return $eq_roleKey;
	}

	public void set$eq_roleKey(String $eq_roleKey) {
		this.$eq_roleKey = $eq_roleKey;
	}

	public String get$like_roleValue() {
		return $like_roleValue;
	}

	public void set$like_roleValue(String $like_roleValue) {
		this.$like_roleValue = $like_roleValue;
	}

}
