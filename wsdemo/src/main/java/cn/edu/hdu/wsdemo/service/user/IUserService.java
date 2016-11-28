/*
 * File Name: IUserDao.java
 * Copyright: Copyright 2016-2016 hdu All Rights Reserved.

 * Description:
 * Author: Pi Chen
 * Create Date: 2016年5月24日

 * Modifier: Pi Chen
 * Modify Date: 2016年5月24日
 * Bugzilla Id:
 * Modify Content:
 */
package cn.edu.hdu.wsdemo.service.user;

import java.util.List;
import java.util.Map;

import cn.edu.hdu.wsdemo.model.User;

/**
 *
 * @author Pi Chen
 * @version wsdemo V1.0.0, 2016年5月24日
 * @see
 * @since wsdemo V1.0.0
 */

public interface IUserService
{

    public List<User> query(Map<String, Object> param) ;

    public void saveUser(Map<String, Object> param);

    public void deleteUser(Map<String, Object> param);
}
