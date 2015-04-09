package com.jeefw.service.sys.impl;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.jeefw.dao.sys.DictDao;
import com.jeefw.model.sys.Dict;
import com.jeefw.service.sys.DictService;

import core.service.BaseService;

/**
 * @author 杨添
 * @框架唯一的升级和技术支持地址：http://shop111863449.taobao.com
 */
@Service
public class DictServiceImpl extends BaseService<Dict> implements DictService {

	private DictDao dictDao;

	@Resource
	public void setDictDao(DictDao dictDao) {
		this.dictDao = dictDao;
		this.dao = dictDao;
	}

	@Override
	public List<Dict> queryDictWithSubList(List<Dict> resultList) {
		List<Dict> dictList = new ArrayList<Dict>();
		for (Dict entity : resultList) {
			Dict dict = new Dict();
			dict.setId(entity.getId());
			dict.setDictKey(entity.getDictKey());
			dict.setDictValue(entity.getDictValue());
			dict.setSequence(entity.getSequence());
			dict.setParentDictkey(entity.getParentDictkey());
			dictList.add(dict);
		}
		return dictList;
	}

}
