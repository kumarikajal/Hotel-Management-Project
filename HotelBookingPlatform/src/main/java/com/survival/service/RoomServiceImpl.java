package com.survival.service;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;

import com.survival.entities.Roomtype;

public class RoomServiceImpl implements RoomService {
	
	@Autowired
	private RoomDaoImpl rDao;

	@Override
	public boolean enterRoom(Roomtype room) throws SQLException {
		return rDao.insertRoom(room);
	}

	@Override
	public boolean removeRoom(Integer rTypeID) throws SQLException {
		return rDao.deleteRoom(rTypeID);
	}

	@Override
	public Roomtype findRoom(Integer rTypeID) throws SQLException {
		return rDao.searchRoom(rTypeID);
	}

	@Override
	public ResultSet viewAllRooms() throws SQLException {
		return rDao.getAllRooms();
	}

}
