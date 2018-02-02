package cn.zetark.oauth2;

import cn.zetark.oauth2.entity.Client;
import cn.zetark.oauth2.entity.User;

public class Config {

    public static final String RESOURCE_SERVER_NAME = "oauth-server";
    public static final String INVALID_CLIENT_ID = "客户端验证失败，如错误的client_id/client_secret。";
    public static final String INVALID_ACCESS_TOKEN = "accessToken无效或已过期。";
    public static final String INVALID_REDIRECT_URI = "缺少授权成功后的回调地址。";
    public static final String INVALID_AUTH_CODE = "错误的授权码。";
    // 验证accessToken
    public static final String CHECK_ACCESS_CODE_URL = "http://localhost:8080/checkAccessToken?accessToken=";


    public static final Client CLIENT = new Client(1L, "chapter17-client", "c1ebe466-1cdc-4bd3-ab69-77c3561b9dee", "d8346ea2-6017-43ed-ad68-19c0f971738b");
    public static final User USER = new User(1L, "admin", "24a8b080516f0354c6a5a3997bc0642e", "8d78869f470951332959580424d4bf4f");

}
