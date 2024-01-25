package org.drugstore.DAO;

import org.drugstore.DbConnection.Database;
import org.drugstore.Model.User;
import org.drugstore.Repository.UserInterface;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


public class UserDAO implements UserInterface {
    @Override
    public User MakeRegistration(User user){
        Database dbConnection = new Database();
        Connection connection = dbConnection.CreateConnection();
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        try
            {
            String query = "INSERT INTO \"user\" (name, first_name, emailadress, password)" +
                    "VALUES(?, ?, ?, ? )";
            preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, user.getName());
            preparedStatement.setString(2, user.getFirstname());
            preparedStatement.setString(3, user.getEmail());
            preparedStatement.setString(4, user.getPassword());
            preparedStatement.executeUpdate();
            resultSet = preparedStatement.getResultSet();
            connection.close();
            } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            try {
                if (preparedStatement != null) {
                    preparedStatement.close();
                }
                if (resultSet != null) {
                    resultSet.close();
                }
                connection.close();
            } catch (Exception e) {
                System.out.println("Error while closing :\n"
                        + e.getMessage()
                );
            }
        }
        return user;
    }

    @Override
    public Boolean findByEmail(String email) {
        String emailAdress = null;
        Database dbConnection = new Database();
        Connection connection = dbConnection.CreateConnection();
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        try {
            String sql = "SELECT(emailadress) FROM \"user\" WHERE emailadress = ?";
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, email);
            preparedStatement.executeQuery();
            resultSet = preparedStatement.getResultSet();
            if(resultSet.next()){
                emailAdress = resultSet.getString("emailadress");
            }
            if(emailAdress != null) {
                return true;
            }

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
       return false;
    }

}
