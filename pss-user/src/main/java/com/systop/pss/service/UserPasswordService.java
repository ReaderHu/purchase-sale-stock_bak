package com.systop.pss.service;

import com.systop.pss.entity.UserPassword;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author Wang
 * @since 2019-11-26
 */
public interface UserPasswordService{

    int deleteByPrimaryKey(Integer pwdId);

    int insert(UserPassword record);

    int insertSelective(UserPassword record);

    UserPassword selectByPrimaryKey(Integer pwdId);

    int updateByPrimaryKeySelective(UserPassword record);

    int updateByPrimaryKey(UserPassword record);
}
