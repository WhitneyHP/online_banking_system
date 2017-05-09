package cn.banking.model.base;

import com.jfinal.plugin.activerecord.IBean;
import com.jfinal.plugin.activerecord.Model;

@SuppressWarnings({"serial", "unchecked"})
public abstract class BaseAdminInfo<M extends BaseAdminInfo<M>> extends Model<M> implements IBean {
	public M setAdminAccount(java.lang.String adminAccount) {
		set("admin_account", adminAccount);
		return (M)this;
	}

	public java.lang.Integer getAdminAccount() {
		return get("admin_account");
	}

	public M setAdminName(java.lang.String adminName) {
		set("admin_name", adminName);
		return (M)this;
	}

	public java.lang.String getAdminName() {
		return get("admin_name");
	}

	public M setAdminPassword(java.lang.String adminPassword) {
		set("admin_password", adminPassword);
		return (M)this;
	}

	public java.lang.String getAdminPassword() {
		return get("admin_password");
	}
}
