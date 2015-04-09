package com.jeefw.controller.sys;

import java.io.IOException;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.jeefw.core.JavaEEFrameworkBaseController;
import com.jeefw.model.sys.RoleAuthority;
import com.jeefw.service.sys.RoleAuthorityService;

/**
 * @author 杨添
 * @框架唯一的升级和技术支持地址：http://shop111863449.taobao.com
 */
@Controller
@RequestMapping("/sys/roleauthority")
public class RoleAuthorityController extends JavaEEFrameworkBaseController<RoleAuthority> {

	@Resource
	private RoleAuthorityService roleAuthorityService;

	@RequestMapping(value = "/saveRoleAuthority")
	public void saveRoleAuthority(HttpServletRequest request, HttpServletResponse response) throws IOException {
		String roleKey = request.getParameter("roleKey");
		String menuCode = request.getParameter("menuCode");
		roleAuthorityService.deleteByProperties("roleKey", roleKey);
		String[] menuCodesValue = menuCode.split(",");
		for (int i = 0; i < menuCodesValue.length; i++) {
			RoleAuthority roleAuthority = new RoleAuthority();
			roleAuthority.setRoleKey(roleKey);
			roleAuthority.setMenuCode(menuCodesValue[i]);
			roleAuthorityService.persist(roleAuthority);
		}
		writeJSON(response, "{success:true}");
	}

}
