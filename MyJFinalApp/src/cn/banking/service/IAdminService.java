package cn.banking.service;

import net.sf.json.JSONObject;

public interface IAdminService {
	/**
	 * 管理员登录验证，返回值包括status(1-成功,0-失败)、reason(结果说明)
	 * @param account
	 * @param password
	 * @return
	 */
	public JSONObject login(String account,String password);
}
