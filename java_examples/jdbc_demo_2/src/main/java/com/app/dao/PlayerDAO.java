package com.app.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.app.dbutil.MySqlConnection;
import com.app.model.Player;

public class PlayerDAO {

	public int createPlayer(Player player) {
		int c=0;
		try(Connection connection=MySqlConnection.getConnection()){
			String sql="insert into player(id,name,age,city,gender,teamName) values(?,?,?,?,?,?)";
			PreparedStatement preparedStatement=connection.prepareStatement(sql);
			
			preparedStatement.setInt(1, player.getId());
			preparedStatement.setString(2, player.getName());
			preparedStatement.setInt(3, player.getAge());
			preparedStatement.setString(4, player.getCity());
			preparedStatement.setString(5, player.getGender());
			preparedStatement.setString(6, player.getTeamName());
			
			c=preparedStatement.executeUpdate();
			
		} catch (ClassNotFoundException | SQLException e) {
			System.out.println(e);
		}
		
		return c;
	}
}
