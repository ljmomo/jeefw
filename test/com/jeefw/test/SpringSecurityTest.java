package com.jeefw.test;

import java.util.List;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.jeefw.model.sys.Authority;
import com.jeefw.service.sys.AuthorityService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:applicationContext.xml", "classpath:applicationContext-security.xml" })
public class SpringSecurityTest {

	@Resource
	private AuthorityService roleAuthorityService;

	@Test
	public void testAuthority() {
		List<Authority> authorityList = roleAuthorityService.doQueryAll();
		List<Authority> resultList = roleAuthorityService.queryAllMenuList("ROLE_ADMIN", authorityList);
		System.out.println(resultList);
	}

}
