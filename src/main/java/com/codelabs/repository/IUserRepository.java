package com.codelabs.repository;

import java.sql.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.codelabs.entity.User;

@Repository
public interface IUserRepository extends JpaRepository<User,Integer>{
	
	//this method will fetch all distinct user with provided first & last name
	//sql query => select distinct * from user where firstname=:firstName and lastName=:lastName;
	List<User> findDistinctByFirstNameAndLastName(String firstName, String lastName);
	
	
	//sql query => select * from user where first_name=:firstName and last_name=:lastName;
	List<User> findByFirstNameOrLastName(String firstName, String lastName);

	//sql query => select * from user where dob between ?1 and ?2;
	List<User> findByDobBetween(Date dob);
	
	//sql query => select * from user where age < ?1;
	List<User> findByAgeLessThan(int age);
	
	//sql query => select * from user where age <= ?1;
	List<User> findByAgeLessThanEqual(int age);
	
	//sql query => select * from user where age > ?1;
	List<User> findByAgeGreaterThan(int age);
	
	//sql query => select * from user where age >= ?1;
	List<User> findByAgeGreaterThanEqual(int age);
	
	//sql query => select * from user where dob > ?1;
	List<User> findByDobAfter(Date dob);
	
	//sql query => select * from user where dob < ?1;
	List<User> findByDobBefore(Date dob);
	
	//sql query => select * from user where first_name like ?1;
	List<User> findByFirstNameLike(String firstName);
	
	//sql query => select * from user where first_name not like ?1;
	List<User> findByFirstNameNotLike(String firstName);
	
	//sql query => select * from user where age = ?1 order by first_name desc;
	List<User> findByAgeOrderByFirstNameDesc(int age);
	
}
