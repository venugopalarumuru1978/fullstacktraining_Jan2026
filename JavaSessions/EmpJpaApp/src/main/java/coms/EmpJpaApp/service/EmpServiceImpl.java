package coms.EmpJpaApp.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import coms.EmpJpaApp.beans.Employee;
import coms.EmpJpaApp.repo.EmpRepository;

@Service
public class EmpServiceImpl implements EmpService {

	@Autowired
	EmpRepository  er;
	
	@Override
	public void AddEmp(Employee emp) {
		er.save(emp);
	}

	@Override
	public List<Employee> ViewAll() {
		// TODO Auto-generated method stub
		return er.findAll();
	}

	@Override
	public Employee SearchEmp(int eno) {
		// TODO Auto-generated method stub
		Optional<Employee> em = er.findById(eno); // select * from emp where eid=eno;
		if(em.isPresent())
			return em.get(); // return emp  class obj
		return null;
	}

	@Override
	public void DeleteEmp(int eid) {
		// TODO Auto-generated method stub
		er.deleteById(eid);
	}

	@Override
	public void UpdateEmp(Employee emp) {
		// TODO Auto-generated method stub
		er.saveAndFlush(emp);  
	}
}
