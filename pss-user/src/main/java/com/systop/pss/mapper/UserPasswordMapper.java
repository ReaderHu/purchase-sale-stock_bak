package com.systop.pss.mapper;

import com.systop.pss.entity.UserPassword;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author Wang
 * @since 2019-11-26
 */
public interface UserPasswordMapper {
    int deleteByPrimaryKey(Integer pwdId);

    int insert(UserPassword record);

    int insertSelective(UserPassword record);

    UserPassword selectByPrimaryKey(Integer pwdId);

    int updateByPrimaryKeySelective(UserPassword record);

    int updateByPrimaryKey(UserPassword record);
}
