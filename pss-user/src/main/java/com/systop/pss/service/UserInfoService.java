package com.systop.pss.service;

import com.systop.pss.entity.UserInfo;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author Wang
 * @since 2019-11-26
 */
public interface UserInfoService {

    int deleteByPrimaryKey(String uuId);

    int insert(UserInfo record);

    int insertSelective(UserInfo record);

    UserInfo selectByPrimaryKey(String uuId);

    int updateByPrimaryKeySelective(UserInfo record);

    int updateByPrimaryKey(UserInfo record);
	
    /**
	 * 根据手机号查询用户
	 * 
	 * @param telPhone
	 * @return
	 */
	UserInfo selectUserBytelPhone(String telPhone);
}
