package com.jdbc;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCallback;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;

public class EmployeeDao {

	private JdbcTemplate jdbcTemplate;
	private NamedParameterJdbcTemplate namedParameterJdbcTemplate;

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	public void setNamedParameterJdbcTemplate(NamedParameterJdbcTemplate namedParameterJdbcTemplate) {
		this.namedParameterJdbcTemplate = namedParameterJdbcTemplate;
	}

	public int saveEmployeeNamedParameter(Employee e) {
		String sql = "insert into dbo.employee values(:id,:name,:salary)";
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("id", e.getId());
		map.put("name", e.getName());
		map.put("salary", e.getSalary());

		PreparedStatementCallback<Integer> action = new PreparedStatementCallback<Integer>() {
			public Integer doInPreparedStatement(PreparedStatement ps) throws SQLException, DataAccessException {
				return ps.executeUpdate();
			}
		};
		return namedParameterJdbcTemplate.execute(sql, map, action);
	}

	public List<Employee> getAllEmployeesRowMapper() {
		String sql = "select * from dbo.employee";
		RowMapper<Employee> rowMapper = new RowMapper<Employee>() {
			public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {
				Employee e = new Employee();
				e.setId(rs.getInt(1));
				e.setName(rs.getString(2));
				e.setSalary(rs.getInt(3));
				return e;
			}
		};
		return jdbcTemplate.query(sql, rowMapper);
	}

	public List<Employee> getAllEmployees() {
		String sql = "select * from dbo.employee";
		ResultSetExtractor<List<Employee>> rse = new ResultSetExtractor<List<Employee>>() {

			public List<Employee> extractData(ResultSet rs) throws SQLException, DataAccessException {
				List<Employee> list = new ArrayList<Employee>();
				while (rs.next()) {
					Employee e = new Employee();
					e.setId(rs.getInt(1));
					e.setName(rs.getString(2));
					e.setSalary(rs.getInt(3));
					list.add(e);
				}
				return list;
			}

		};
		return jdbcTemplate.query(sql, rse);
	}

	public Boolean saveEmployeeByPreparedStatement(final Employee e) {
		String query = "insert into employee values(?,?,?)";
		PreparedStatementCallback<Boolean> action = new PreparedStatementCallback<Boolean>() {

			public Boolean doInPreparedStatement(PreparedStatement ps) throws SQLException, DataAccessException {
				ps.setInt(1, e.getId());
				ps.setString(2, e.getName());
				ps.setInt(3, e.getSalary());
				return ps.execute();
			}
		};
		return jdbcTemplate.execute(query, action);
	}

	public int saveEmployee(Employee e) {
		String query = "insert into dbo.employee values(" + e.getId() + ",'" + e.getName() + "'," + e.getSalary() + ")";
		return jdbcTemplate.update(query);
	}

	public int updateEmployee(Employee e) {
		String query = "update dbo.employee set name = '" + e.getName() + "',salary =" + e.getSalary() + " where id= "
				+ e.getId();
		return jdbcTemplate.update(query);
	}
	
	public int updateEmployeeVarArgs(Employee e) {
		String query = "update dbo.employee set name = ? where id= ?";
		return jdbcTemplate.update(query,e.getName(),e.getId());
	}

	public int deleteEmployee(Employee e) {
		String query = "delete from dbo.employee where id=" + e.getId();
		return jdbcTemplate.update(query);
	}

}
