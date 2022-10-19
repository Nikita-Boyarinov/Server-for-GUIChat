package server;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.UUID;

public class User {
    private Socket socket;
    private String name;
    private DataOutputStream out;
    private DataInputStream in;
    private UUID uuid;
    private int id;
    public User(Socket socket) throws IOException {
        this.socket = socket;
        this.out = new DataOutputStream(this.socket.getOutputStream());
        this.in = new DataInputStream(this.socket.getInputStream());
        this.uuid = UUID.randomUUID();
    }
    public String getName() {return name;}
    public void setName(String name) {this.name = name;}
    public DataOutputStream getOut() {return out;}
    public DataInputStream getIn() {return in;}
    public UUID getUuid() {return uuid;}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
