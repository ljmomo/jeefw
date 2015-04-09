package com.jeefw.service.sys.impl;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.jeefw.dao.sys.InformationDao;
import com.jeefw.model.sys.Information;
import com.jeefw.service.sys.InformationService;

import core.service.BaseService;
import core.util.HtmlUtils;

/**
 * @author 杨添
 * @框架唯一的升级和技术支持地址：http://shop111863449.taobao.com
 */
@Service
public class InformationServiceImpl extends BaseService<Information> implements InformationService {

	private InformationDao informationDao;

	@Resource
	public void setInformationDao(InformationDao informationDao) {
		this.informationDao = informationDao;
		this.dao = informationDao;
	}

	@Override
	public List<Information> queryInformationHTMLList(List<Information> resultList) {
		List<Information> informationList = new ArrayList<Information>();
		for (Information entity : resultList) {
			Information information = new Information();
			information.setId(entity.getId());
			information.setTitle(entity.getTitle());
			information.setAuthor(entity.getAuthor());
			information.setRefreshTime(entity.getRefreshTime());
			information.setContent(entity.getContent());
			information.setContentNoHTML(HtmlUtils.htmltoText(entity.getContent()));
			informationList.add(information);
		}
		return informationList;
	}

	@Override
	public void indexingInformation() {
		informationDao.indexingInformation();
	}

	@Override
	public List<Information> queryByInformationName(String name) {
		return informationDao.queryByInformationName(name);
	}

}
