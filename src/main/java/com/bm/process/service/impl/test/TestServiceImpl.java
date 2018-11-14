package com.bm.process.service.impl.test;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bm.process.dao.source1.A1Mapper;
import com.bm.process.dao.source2.Aj2013AkmemoMapper;
import com.bm.process.pojo.A1;
import com.bm.process.pojo.A1Example;
import com.bm.process.pojo.A1Example.Criteria;
import com.bm.process.pojo.Aj2013Akmemo;
import com.bm.process.pojo.Aj2013AkmemoExample;
import com.bm.process.service.test.TestService;
import com.github.pagehelper.PageHelper;

@Service
public class TestServiceImpl implements TestService {

	@Autowired
	A1Mapper a1Mapper;

	@Autowired
	Aj2013AkmemoMapper ajMapper;

	@Override
	public List<A1> getDb1A1() {
		A1Example example = new A1Example();
		Criteria criteria = example.createCriteria();//添加过滤条件
		ArrayList<String> list = new ArrayList<String>();
		list.add("8EF46F5C-603F-4925-B5EE-67668E5B1878");
		list.add("8EF4B0C0-E86E-47AA-885D-6715FAE995F5");
		list.add("8EFA919E-DF27-4286-9FD6-F5B682048E1D");
		criteria.andAIn(list);
		PageHelper.startPage(1, 2);//分页
		List<A1> selectByExample = a1Mapper.selectByExample(example);
		return selectByExample;
	}

	@Override
	public int getDb2A1() {
		Aj2013AkmemoExample aj2013AkmemoExample = new Aj2013AkmemoExample();
		int countByExample = ajMapper.countByExample(aj2013AkmemoExample);
		return countByExample;
	}
}
