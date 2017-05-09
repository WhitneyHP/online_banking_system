package cn.banking.serviceimpl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import cn.banking.model.AdminInfo;
import cn.banking.model.base.BaseAdminInfo;
import cn.banking.service.IAdminService;
import cn.banking.utils.MD5Util;
import net.sf.json.JSONObject;

public class AdminServiceImpl implements IAdminService {
	public JSONObject login(String account, String password) {
		Map<String, Object> result = new HashMap<String, Object>();
		try {
			List<AdminInfo> adminInfo = AdminInfo.adminInfo
					.find("select * from admin_info where admin_account = " + account);
			if (adminInfo != null) {
				if (adminInfo.get(0).getAdminPassword().equals(MD5Util.doubleEncoderByMd5(password))) {
					result.put("status", 1);
					result.put("reason", "登录成功");
				} else {
					result.put("status", 0);
					result.put("reason", "登录失败，用户名或密码错误");
				}
			} else {
				result.put("status", 0);
				result.put("reason", "对不起，该账号不存在");
			}
		} catch (Exception e) {
			result.put("status", 0);
			result.put("reason", "对不起，服务器出错，请稍后重试");
			throw new RuntimeException();
		} finally {
			return JSONObject.fromObject(result);
		}
	}
}
