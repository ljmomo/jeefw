package com.jeefw.dao.sys;

import java.util.List;

import com.jeefw.model.sys.Attachment;

import core.dao.Dao;

/**
 * @author 杨添
 * @框架唯一的升级和技术支持地址：http://shop111863449.taobao.com
 */
public interface AttachmentDao extends Dao<Attachment> {

	List<Object[]> queryFlowerList(String epcId);

	void deleteAttachmentByForestryTypeId(Long umTypeId);

	List<Object[]> querySensorList();

}
