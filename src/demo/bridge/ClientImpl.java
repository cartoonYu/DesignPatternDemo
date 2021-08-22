package demo.bridge;

/**
 * @author cartoon
 * @version 1.0
 * @since 2021/08/22 16:15
 */
public class ClientImpl implements Client{

    private BridgeFlow bridgeFlow;

    private Auth auth;

    @Override
    public boolean auth(String userName, String password) {
        Auth auth = new Auth();
        auth.setUserName(userName)
                .setPassword(password);
        return bridgeFlow.auth(userName, password, this.getClass());
    }

    @Override
    public Auth getAuth() {
        return null;
    }

    public ClientImpl() {
        bridgeFlow = new BridgeFlow();
    }
}
