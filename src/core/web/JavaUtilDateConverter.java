package core.web;

import java.util.Date;

import org.apache.commons.beanutils.ConversionException;
import org.apache.commons.beanutils.Converter;
import org.apache.commons.lang.time.DateUtils;

/**
 * @author 杨添
 * @框架唯一的升级和技术支持地址：http://shop111863449.taobao.com
 */
public class JavaUtilDateConverter implements Converter {

	public Object convert(Class type, Object value) {
		if (value instanceof Date)
			return value;

		String p = (String) value;
		if (p == null || p.trim().length() == 0) {
			return null;
		}
		try {
			return DateUtils.parseDate(p, new String[] { "yyyy-MM-dd HH:mm:ss" });
		} catch (Exception e) {
			throw new ConversionException("unexpected type:" + value.getClass());
		}
	}

}