package com.jeefw.model.sys;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import com.google.common.base.Objects;
import com.jeefw.model.sys.param.RoleAuthorityParameter;

/**
 * @author 杨添
 * @框架唯一的升级和技术支持地址：http://shop111863449.taobao.com
 */
@Entity
@Table(name = "role_authority")
@Cache(region = "all", usage = CacheConcurrencyStrategy.NONSTRICT_READ_WRITE)
public class RoleAuthority extends RoleAuthorityParameter {

	private static final long serialVersionUID = -6407426487164414994L;
	@Id
	@GeneratedValue
	@Column(name = "id")
	private Long id;
	@Column(name = "role_key", length = 40, nullable = false)
	private String roleKey;
	@Column(name = "menu_code", length = 50, nullable = false)
	private String menuCode;

	public RoleAuthority() {

	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getRoleKey() {
		return roleKey;
	}

	public void setRoleKey(String roleKey) {
		this.roleKey = roleKey;
	}

	public String getMenuCode() {
		return menuCode;
	}

	public void setMenuCode(String menuCode) {
		this.menuCode = menuCode;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		final RoleAuthority other = (RoleAuthority) obj;
		return Objects.equal(this.id, other.id) && Objects.equal(this.roleKey, other.roleKey) && Objects.equal(this.menuCode, other.menuCode);
	}

	@Override
	public int hashCode() {
		return Objects.hashCode(this.id, this.roleKey, this.menuCode);
	}

}
