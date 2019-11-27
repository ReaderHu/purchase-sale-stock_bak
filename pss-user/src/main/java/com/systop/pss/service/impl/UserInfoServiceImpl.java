package com.systop.pss.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.systop.pss.entity.UserInfo;
import com.systop.pss.mapper.UserInfoMapper;
import com.systop.pss.service.UserInfoService;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author Wang
 * @since 2019-11-26
 */
@Service
public class UserInfoServiceImpl implements UserInfoService {

	@Autowired
	private UserInfoMapper userInfoMapper;
	
	@Override
	public int deleteByPrimaryKey(String uuId) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int insert(UserInfo record) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int insertSelective(UserInfo record) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public UserInfo selectByPrimaryKey(String uuId) {
		
		return userInfoMapper.selectByPrimaryKey(uuId);
	}

	@Override
	public int updateByPrimaryKeySelective(UserInfo record) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateByPrimaryKey(UserInfo record) {
		// TODO Auto-generated method stub
		return 0;
	}

	/**
	 * 根据手机号查询用户
	 * @param telPhone
	 * @return 
	 */
	public UserInfo selectUserBytelPhone(String telPhone) {
		// TODO Auto-generated method stub
		
		return userInfoMapper.selectUserBytelPhone(telPhone);
	}

}
