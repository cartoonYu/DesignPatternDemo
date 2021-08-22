package demo.bridge;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

/**
 * @author cartoon
 * @version 1.0
 * @since 2021/08/22 15:58
 */
public class BridgeFlow {

    private Map<String, String> clientToServerRelate;

    public boolean auth(String userName, String password, Class clientClass){
        return Optional.of(clientToServerRelate.get(clientClass.getSimpleName()))
                .map(serverName -> {
                    try {
                        Class serverClass = Class.forName(serverName);
                        Server server = (Server) serverClass.newInstance();
                        return server.auth(userName, password);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    return false;
                }).orElseThrow(IllegalArgumentException::new);
    }

    public BridgeFlow() {
        clientToServerRelate = new HashMap<>();
        clientToServerRelate.put("ClientImpl", "ServerImpl");
    }
}
