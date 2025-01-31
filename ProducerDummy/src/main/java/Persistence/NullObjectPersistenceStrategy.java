package Persistence;

import Messages.AbstractMessage;
import Messages.JsonMessage;

/***
 * This Implementation should be used for Debug purpose because you don´t want to write every message into your Hdd.
 */

public class NullObjectPersistenceStrategy implements PersistenceStrategy {


    public NullObjectPersistenceStrategy(String filepath,String fileName){
        return;
    }
    @Override
    public void StoreMessage(int sequenceNumber, String message) {
        return;
    }

    @Override
    public void CreatePersistenceMechanism() {
        return;
    }

    @Override
    public AbstractMessage ReadLastMessage() {
        return new JsonMessage(0, "DEBUG");
    }
}
