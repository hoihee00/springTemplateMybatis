package com.company.app.emp.service.impl;

import java.util.List;

import com.company.app.emp.service.Dept;

public interface DeptMapper {
	// 여러 건 목록 조회
	public List<Dept> getDeptList(); // 메서드명(getDeptList)는 dept_mapper.xml의 id명과 동일해야함
	
	// 단건 조회
	public Dept getDept(String id); // returnType method명(parameterType)
}
