package com.jeefw.model.sys;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import com.google.common.base.Objects;
import com.jeefw.model.sys.param.AuthorityParameter;

/**
 * @author 杨添
 * @框架唯一的升级和技术支持地址：http://shop111863449.taobao.com
 */
@Entity
@Table(name = "authority")
@Cache(region = "all", usage = CacheConcurrencyStrategy.NONSTRICT_READ_WRITE)
public class Authority extends AuthorityParameter {

	private static final long serialVersionUID = -5233663741711528284L;
	@Id
	@GeneratedValue
	@Column(name = "id")
	private Long id;
	@Column(name = "menu_code", length = 50, nullable = false, unique = true)
	private String menuCode;
	@Column(name = "menu_name", length = 50, nullable = false)
	private String menuName;
	@Column(name = "menu_class", length = 50, nullable = false)
	private String menuClass;
	@Column(name = "data_url", length = 100, nullable = false)
	private String dataUrl;
	@Column(name = "sequence")
	private Long sequence;
	@Column(name = "parent_menucode", length = 50)
	private String parentMenuCode;

	public Authority() {

	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getMenuCode() {
		return menuCode;
	}

	public void setMenuCode(String menuCode) {
		this.menuCode = menuCode;
	}

	public String getMenuName() {
		return menuName;
	}

	public void setMenuName(String menuName) {
		this.menuName = menuName;
	}

	public String getMenuClass() {
		return menuClass;
	}

	public void setMenuClass(String menuClass) {
		this.menuClass = menuClass;
	}

	public String getDataUrl() {
		return dataUrl;
	}

	public void setDataUrl(String dataUrl) {
		this.dataUrl = dataUrl;
	}

	public Long getSequence() {
		return sequence;
	}

	public void setSequence(Long sequence) {
		this.sequence = sequence;
	}

	public String getParentMenuCode() {
		return parentMenuCode;
	}

	public void setParentMenuCode(String parentMenuCode) {
		this.parentMenuCode = parentMenuCode;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		final Authority other = (Authority) obj;
		return Objects.equal(this.id, other.id) && Objects.equal(this.sequence, other.sequence) && Objects.equal(this.menuCode, other.menuCode) && Objects.equal(this.menuName, other.menuName)
				&& Objects.equal(this.menuClass, other.menuClass) && Objects.equal(this.dataUrl, other.dataUrl) && Objects.equal(this.parentMenuCode, other.parentMenuCode);
	}

	@Override
	public int hashCode() {
		return Objects.hashCode(this.id, this.sequence, this.menuCode, this.menuName, this.menuClass, this.dataUrl, this.parentMenuCode);
	}

}
