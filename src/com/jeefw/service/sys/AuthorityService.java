package com.jeefw.service.sys;

import java.util.List;

import org.springframework.security.access.prepost.PreAuthorize;

import com.jeefw.model.sys.Authority;

import core.service.Service;

/**
 * @author 杨添
 * @框架唯一的升级和技术支持地址：http://shop111863449.taobao.com
 */
public interface AuthorityService extends Service<Authority> {

	@PreAuthorize("hasRole('ROLE_ADMIN') or hasRole('ROLE_RESTRICTED_ADMIN') or hasRole('ROLE_USER')")
	List<Authority> queryAllMenuList(String globalRoleKey, List<Authority> mainMenuList);

}
