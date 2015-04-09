package com.jeefw.service.sys;

import java.util.List;

import com.jeefw.model.sys.SysUser;

import core.service.Service;

/**
 * @author 杨添
 * @框架唯一的升级和技术支持地址：http://shop111863449.taobao.com
 */
public interface SysUserService extends Service<SysUser> {

	List<SysUser> querySysUserCnList(List<SysUser> resultList);

	SysUser getSysUserWithAvatar(SysUser sysuser);

}
