package com.jeefw.service.sys;

import java.util.List;

import com.jeefw.model.sys.Information;

import core.service.Service;

/**
 * @author 杨添
 * @框架唯一的升级和技术支持地址：http://shop111863449.taobao.com
 */
public interface InformationService extends Service<Information> {

	List<Information> queryInformationHTMLList(List<Information> resultList);

	void indexingInformation();

	List<Information> queryByInformationName(String name);

}
