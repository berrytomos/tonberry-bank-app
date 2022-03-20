package Service;

import Storage.UserConnection;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

public class ConnectionFactoryTest {

    @Test
    public void getConnectionCalledDoesNotThrowException(){
        Assertions.assertDoesNotThrow(UserConnection::getConnection);
    }
}
