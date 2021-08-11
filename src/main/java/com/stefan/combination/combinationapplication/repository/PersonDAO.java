package com.stefan.combination.combinationapplication.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.List;

@Repository
public class PersonDAO {
    @Autowired
    JdbcTemplate jdbcTemplate;

    class PersonRowMapper implements RowMapper<Person> {
        @Override
        public Person mapRow(ResultSet resultSet, int i) throws SQLException {
            Person person=new Person();

            person.setId(resultSet.getInt("id"));
            person.setHeight(resultSet.getInt("height"));
            person.setWeight(resultSet.getInt("weight"));
            person.setName(resultSet.getString("name"));
            person.setBirthDate(resultSet.getDate("birth_date"));

            return person;
        }
    }

    public List<Person> findAll() {
        return jdbcTemplate.query("select * from person",new PersonRowMapper());
    }

    public Person findById(int id) {
        return jdbcTemplate.queryForObject("select * from person where id=?",new Object[]{id},new PersonRowMapper());
    }

    public List<Person> findByWeightAndHeight(int weight,int height) {
        return jdbcTemplate.query("select * from person where weight=? and height=?",new Object[]{weight,height},
                new PersonRowMapper());
    }

    public List<Person> findByName(String name) {
        return jdbcTemplate.query("select * from person where name=?",new Object[]{name}
                ,new PersonRowMapper());
    }

    public int deleteById(Person person) {
        return jdbcTemplate.update("delete from person where id=?",new Object[]{person.getId()});
    }

    public int updateHeightAndWeight(Person person) {
        return jdbcTemplate.update("update person set height=? ,weight=? where id=?",
                new Object[]{person.getHeight(),person.getWeight(),person.getId()});
    }


    public int insert(Person person) {
        return jdbcTemplate.update("insert into person(id,name,weight,height,birth_date) values(?,?,?,?,?)",
                new Object[]{person.getId(),person.getName(),person.getWeight(),person.getHeight(), new Timestamp(person.getBirthDate().getTime())});
    }

}
