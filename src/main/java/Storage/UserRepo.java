

package Storage;
import Interface.Credentials;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;


import org.apache.logging.log4j.*;
import org.apache.logging.log4j.LogManager;

// User repo is starting point of our persistence layer.

//CRUD Operations are those that allows the modification or persistence of data in some
//                              DML (Data Manipulation Language)
//C- Create                     insert
//R- Read                       select
//U- Update.                    update
//D- Delete.                    delete

public class UserRepo {

    Scanner scan = new Scanner(System.in);
    private static final Logger logger = LogManager.getLogger(UserRepo.class);

    public void createUser (Credentials register) {
        // here we write our SQL
        try {
            Connection connection = UserConnection.getConnection();
            String sql = "insert into register(username, password) values (?, ?)";
            PreparedStatement stmt = connection.prepareStatement(sql);

            stmt.setString(1, register.getuser());
            stmt.setString(2, register.getpass());

            stmt.executeQuery();


        } catch (SQLException e) {
            logger.warn(e.getMessage(), e);
        }
    }

    public Credentials getUserByID(int id) {
        // select * from user where id = ?
        // public List<Registration> getAllUsers
        return null;
    }

    public List<Credentials> getAllUsers(){
        return null;
    }


    public void updateUser(Credentials user){

    }

    // delete from users where id = ?
    public void deleteUserById(int id){

    }





}
