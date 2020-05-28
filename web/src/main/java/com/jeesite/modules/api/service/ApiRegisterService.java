/**
 * Copyright (c) 2013-Now http://jeesite.com All rights reserved.
 */
package com.jeesite.modules.api.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jeesite.common.entity.Page;
import com.jeesite.common.service.CrudService;
import com.jeesite.modules.api.entity.ApiRegister;
import com.jeesite.modules.api.dao.ApiRegisterDao;

/**
 * api注册记录Service
 * @author myj
 * @version 2020-05-28
 */
@Service
@Transactional(readOnly=true)
public class ApiRegisterService extends CrudService<ApiRegisterDao, ApiRegister> {
	
	/**
	 * 获取单条数据
	 * @param apiRegister
	 * @return
	 */
	@Override
	public ApiRegister get(ApiRegister apiRegister) {
		return super.get(apiRegister);
	}
	
	/**
	 * 查询分页数据
	 * @param apiRegister 查询条件
	 * @param apiRegister.page 分页对象
	 * @return
	 */
	@Override
	public Page<ApiRegister> findPage(ApiRegister apiRegister) {
		return super.findPage(apiRegister);
	}
	
	/**
	 * 保存数据（插入或更新）
	 * @param apiRegister
	 */
	@Override
	@Transactional(readOnly=false)
	public void save(ApiRegister apiRegister) {
		super.save(apiRegister);
	}
	
	/**
	 * 更新状态
	 * @param apiRegister
	 */
	@Override
	@Transactional(readOnly=false)
	public void updateStatus(ApiRegister apiRegister) {
		super.updateStatus(apiRegister);
	}
	
	/**
	 * 删除数据
	 * @param apiRegister
	 */
	@Override
	@Transactional(readOnly=false)
	public void delete(ApiRegister apiRegister) {
		super.delete(apiRegister);
	}
	
}