package cn.zetark.oauth2.service.impl;

import cn.zetark.oauth2.Config;
import cn.zetark.oauth2.entity.User;
import cn.zetark.oauth2.service.PasswordHelper;
import cn.zetark.oauth2.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private PasswordHelper passwordHelper;

    /**
     * 根据用户名查找用户
     * @param username
     * @return
     */
    public User findByUsername(String username) {
        if(Config.USER.getUsername().equals(username))
            return Config.USER;
        return null;
    }

    /**
     * 验证登录
     * @param username 用户名
     * @param password 密码
     * @param salt 盐
     * @param encryptpwd 加密后的密码
     * @return
     */
    public boolean checkUser(String username, String password, String salt, String encryptpwd) {
        String pwd = passwordHelper.encryptPassword(username,password,salt);
        return pwd.equals(encryptpwd);
    }


}
