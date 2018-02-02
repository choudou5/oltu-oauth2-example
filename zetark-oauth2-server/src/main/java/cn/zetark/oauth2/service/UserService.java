package cn.zetark.oauth2.service;

import cn.zetark.oauth2.entity.User;

public interface UserService {

    /**
     * 根据用户名查找用户
     * @param username
     * @return
     */
    public User findByUsername(String username);

    /**
     * 验证登录
     * @param username 用户名
     * @param password 密码
     * @param salt 盐
     * @param encryptpwd 加密后的密码
     * @return
     */
    boolean checkUser(String username, String password, String salt, String encryptpwd);
}
