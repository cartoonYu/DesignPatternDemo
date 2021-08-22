package demo.bridge;

/**
 * @author cartoon
 * @version 1.0
 * @since 2021/08/22 16:17
 */
public class ServerImpl implements Server{

    @Override
    public boolean auth(String userName, String password) {
        // 具体验证 api 调用
        return true;
    }
}

