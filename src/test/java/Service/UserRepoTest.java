package Service;
import Storage.UserRepo;
import Interface.Credentials;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class UserRepoTest {

    private UserRepo userRepo;

    @BeforeEach
    public void setUp(){

        userRepo = new UserRepo();
    }

    @Test
    public void whenCreateUserIsCalledDoesNotThrowExceptionAndUserIsCreated(){
        Credentials register = new Credentials();

        Assertions.assertDoesNotThrow(() -> userRepo.createUser(register));
    }
}
