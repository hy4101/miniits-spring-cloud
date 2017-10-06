package com.miniits.core.service.user;

import com.miniits.core.dao.user.IUserRepository;
import com.miniits.core.model.user.User;
import com.miniits.mysql.query.BaseService;
import com.miniits.mysql.query.BaseServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

/**
 * @author: wq
 * @Date: 2017/10/4
 * @Time: 20:28
 * <p>
 * Description:
 * ***
 * www.miniits.com
 */
@Service
@Transactional
public class UserService extends BaseServiceImpl<User, String> implements BaseService<User, String> {

    @Autowired
    public void setBaseDao(IUserRepository iUserRepository) {
        super.setBaseDao(iUserRepository);
    }

    @Autowired
    private IUserRepository iUserRepository;
}
