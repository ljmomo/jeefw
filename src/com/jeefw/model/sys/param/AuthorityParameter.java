package com.jeefw.model.sys.param;

import java.util.List;

import com.jeefw.model.sys.Authority;

import core.support.ExtJSBaseParameter;

/**
 * @author 杨添
 * @框架唯一的升级和技术支持地址：http://shop111863449.taobao.com
 */
public class AuthorityParameter extends ExtJSBaseParameter {

	private static final long serialVersionUID = 2903229213249813463L;
	private String $eq_menuCode;
	private String $like_menuName;
	private List<Authority> subAuthorityList;

	public String get$eq_menuCode() {
		return $eq_menuCode;
	}

	public void set$eq_menuCode(String $eq_menuCode) {
		this.$eq_menuCode = $eq_menuCode;
	}

	public String get$like_menuName() {
		return $like_menuName;
	}

	public void set$like_menuName(String $like_menuName) {
		this.$like_menuName = $like_menuName;
	}

	public List<Authority> getSubAuthorityList() {
		return subAuthorityList;
	}

	public void setSubAuthorityList(List<Authority> subAuthorityList) {
		this.subAuthorityList = subAuthorityList;
	}

}
