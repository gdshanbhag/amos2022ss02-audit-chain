//TODO Refactor Name to Client and Client to DummyClient

import DataGeneration.DataGenerator;
import Persistence.PersistenceStrategy;
import com.rabbitmq.client.ConnectionFactory;

import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Properties;

/**
 * Abstract class for Clients
 */
public class AbstractClient {


    protected String HOST;
    protected int PORT;
    protected String USER;
    protected String PASSWORD;
    protected String QUEUE_NAME;
    protected ConnectionFactory factory = new ConnectionFactory();

    /**
     * Constructor for AbstractClient. Initializes the filepath, the file reader and set information for the
     * connection factory. Call {@link #initFactory()} to initialize the connection factory.
     *
     * @throws IOException if the file cannot be read
     */
    public AbstractClient(String host, int port, String username, String password, String queue_name) {
        this.HOST = host;
        this.PORT = port;
        this.USER = username;
        this.PASSWORD = password;
        this.QUEUE_NAME = queue_name;
        this.initFactory();
    }

    /**
     * Initializes the connection factory. It can be used then to send messages to a server RabbitMQ
     */
    public void initFactory() {
        this.factory.setHost(this.HOST);
        this.factory.setUsername(this.USER);
        this.factory.setPassword(this.PASSWORD);
        this.factory.setPort(this.PORT);
    }


}
