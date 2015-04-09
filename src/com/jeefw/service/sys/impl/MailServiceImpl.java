package com.jeefw.service.sys.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.jeefw.dao.sys.MailDao;
import com.jeefw.model.sys.Mail;
import com.jeefw.service.sys.MailService;

import core.service.BaseService;

/**
 * @author 杨添
 * @框架唯一的升级和技术支持地址：http://shop111863449.taobao.com
 */
@Service
public class MailServiceImpl extends BaseService<Mail> implements MailService {

	private MailDao mailDao;

	@Resource
	public void setMailDao(MailDao mailDao) {
		this.mailDao = mailDao;
		this.dao = mailDao;
	}

}
