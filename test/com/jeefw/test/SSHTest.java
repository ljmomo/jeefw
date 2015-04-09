package com.jeefw.test;

import javax.annotation.Resource;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.annotation.Repeat;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.*;

import com.jeefw.dao.sys.SysUserDao;
import com.jeefw.model.sys.SysUser;
import com.jeefw.service.sys.SysUserService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({ "classpath:applicationContext.xml" })
public class SSHTest {

	@Resource
	private SysUserDao sysUserDao;

	@Resource
	private SysUserService sysUserService;

	@Before
	public void setUp() throws Exception {

	}

	@Test
	public final void testSave() {
		// System.out.println("sysUserService:::" + sysUserService);
		SysUser sysUser = sysUserService.getByProerties("userName", "admin");
	}

}
