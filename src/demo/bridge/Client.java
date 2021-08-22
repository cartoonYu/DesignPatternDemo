package demo.bridge;

public interface Client {

    boolean auth(String userName, String password);

    Auth getAuth();
}
