package coms.EmpJpaApp.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import coms.EmpJpaApp.beans.Employee;

@Repository
public interface EmpRepository extends JpaRepository<Employee, Integer> {
	
	@Query("SELECT e FROM Employee e WHERE e.email = :email and e.pswd = :pwd")
	public Employee EmpCheck(@Param("email") String email, @Param("pwd") String pwd);
	
}
