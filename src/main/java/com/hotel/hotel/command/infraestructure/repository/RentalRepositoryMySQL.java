package com.hotel.hotel.command.infraestructure.repository;

import java.util.Calendar;
import java.util.HashMap;
import java.util.Map;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.simple.SimpleJdbcInsert;
import org.springframework.stereotype.Repository;

import com.hotel.hotel.command.domain.model.Guest;
import com.hotel.hotel.command.domain.model.Rental;
import com.hotel.hotel.command.domain.model.Room;
import com.hotel.hotel.command.domain.repository.RentalRepository;
import com.hotel.hotel.command.infraestructure.configuration.BeanConnectMySQL;

@Repository
public class RentalRepositoryMySQL implements RentalRepository {

	private DataSource dataSource = new BeanConnectMySQL().mysqlDataSource();

	@Autowired
	private NamedParameterJdbcTemplate namedParameterJdbcTemplate = new NamedParameterJdbcTemplate(dataSource);

	private MapSqlParameterSource paramSource;

	private SimpleJdbcInsert simpleJdbcInsert;

	private static final String UPDATE_RENTAL_QUERY = "UPDATE Rental SET checkOut = :checkOut2 WHERE idRental = :idRental2";

	@Override
	public Long createRental(Rental rental) {
		long idGuest = this.createGuest(rental.getGuest());
		long idRoom = this.createRoom(rental.getRoom());

		paramSource = new MapSqlParameterSource();
		paramSource.addValue("idRoom", idRoom).addValue("idGuest", idGuest).addValue("checkIn", rental.getCheckIn())
				.addValue("checkOut", null);

		simpleJdbcInsert = new SimpleJdbcInsert(new BeanConnectMySQL().mysqlDataSource()).withTableName("RENTAL")
				.usingGeneratedKeyColumns("idRental");

		return simpleJdbcInsert.executeAndReturnKey(paramSource).longValue();
	}

	@Override
	public boolean updateRental(long idRental) {

		Calendar checkOut = Calendar.getInstance();

		Map<String, Object> parameters = new HashMap<>();
		parameters.put("checkOut2", checkOut);
		parameters.put("idRental2", idRental);

		return namedParameterJdbcTemplate.update(UPDATE_RENTAL_QUERY, parameters) > 0;

	}

	@Override
	public boolean deleteRental(Long id) {
		return false;
	}

	@Override
	public Rental listRental() {
		return null;
	}

	@Override
	public Long createRoom(Room room) {

		paramSource = new MapSqlParameterSource();

		paramSource.addValue("roomName", room.getRoomName()).addValue("type", room.getType())
				.addValue("capacity", room.getCapacity()).addValue("numBeds", room.getNumBeds());

		simpleJdbcInsert = new SimpleJdbcInsert(dataSource).withTableName("ROOM").usingGeneratedKeyColumns("idRoom");

		return simpleJdbcInsert.executeAndReturnKey(paramSource).longValue();
	}

	@Override
	public Long createGuest(Guest guest) {

		paramSource = new MapSqlParameterSource();

		paramSource.addValue("numberID", guest.getNumberID()).addValue("name", guest.getName());

		simpleJdbcInsert = new SimpleJdbcInsert(dataSource).withTableName("GUEST").usingGeneratedKeyColumns("idGuest");

		return simpleJdbcInsert.executeAndReturnKey(paramSource).longValue();
	}
}
