package cn.zetark.oauth2.service;

import cn.hutool.core.util.HexUtil;
import cn.hutool.core.util.RandomUtil;
import cn.hutool.crypto.SecureUtil;
import cn.zetark.oauth2.entity.User;
import org.springframework.stereotype.Service;

@Service
public class PasswordHelper {

    public void encryptPassword(User user) {
        user.setSalt(RandomUtil.randomString(10));
        String pwdStr = HexUtil.encodeHexStr(user.getPassword()+user.getCredentialsSalt());
        String newPassword = SecureUtil.md5(pwdStr);
        user.setPassword(newPassword);
    }

    /**
     * 加密
     * @param username
     * @param password
     * @param salt 盐值
     */
    public String encryptPassword(String username, String password, String salt) {
        String pwdStr = HexUtil.encodeHexStr(password + salt + username);
        String pwd = SecureUtil.md5(pwdStr);
        return pwd;
    }

    public static void main(String[] args) {
        System.out.println(new PasswordHelper().encryptPassword("admin", "123456", "8d78869f470951332959580424d4bf4f"));
    }


}
