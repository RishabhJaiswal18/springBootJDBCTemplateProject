package com.telusko.SpringJDBCEx.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.telusko.SpringJDBCEx.model.Student;

@Repository
public class StudentRepo {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	public void save(Student std1) {
//		String query = "insert into student(rollno,name,marks) values(?,?,?)";
//		int update = jdbcTemplate.update(query, std1.getRollNo(), std1.getName(), std1.getMarks());
//		if (update == 1) {
//			System.out.println(update + " row effected");
//		} else {
//			System.out.println(update + " row effected. Data not inserted successfully");
//		}
	}

	public List<Student> findAll() {
		String query = "select * from student";
//		RowMapper<Student> mapper = new RowMapper<Student>() {
//
//			@Override
//			public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
//				Student std = new Student();
//				std.setRollNo(rs.getInt("rollno"));
//				std.setName(rs.getString("name"));
//				std.setMarks(rs.getInt("marks"));
//				return std;
//			}
//		};

//		RowMapper<Student> mapper = (ResultSet rs, int rowNum) -> {
//			Student std = new Student();
//			std.setRollNo(rs.getInt("rollno"));
//			std.setName(rs.getString("name"));
//			std.setMarks(rs.getInt("marks"));
//			return std;
//		};

//		return jdbcTemplate.query(query, mapper);

		return jdbcTemplate.query(query, (ResultSet rs, int rowNum) -> {
			Student std = new Student();
			std.setFirstName(rs.getString("first_name"));
			std.setLastName(rs.getString("last_name"));
			std.setEmail(rs.getString("email"));
			return std;
		});
	}

}
