package com.systop.pss.service.impl;

import org.springframework.stereotype.Service;

import com.systop.pss.entity.UserPassword;
import com.systop.pss.service.UserPasswordService;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author Wang
 * @since 2019-11-26
 */
@Service
public class UserPasswordServiceImpl implements UserPasswordService {

	@Override
	public int deleteByPrimaryKey(Integer pwdId) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int insert(UserPassword record) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int insertSelective(UserPassword record) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public UserPassword selectByPrimaryKey(Integer pwdId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int updateByPrimaryKeySelective(UserPassword record) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateByPrimaryKey(UserPassword record) {
		// TODO Auto-generated method stub
		return 0;
	}

}
