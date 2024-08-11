package com.example.demo.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.mapper.BankMapper;
import com.example.demo.service.BankService;

@Service
public class BankServiceImpl implements BankService {

	@Autowired
	private BankMapper bm;

	@Transactional
	@Override
	public void transfer(Integer fromId, Integer toId, Integer money) {
		bm.decreaseMoney(fromId, money);
		int x = 10 / 0;
		bm.addMoney(toId, money);
	}

}
