package com.example.demo.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Update;

@Mapper
public interface BankMapper {

	@Update("update bank set balance=balance-#{money} where id=#{id}")
	void decreaseMoney(Integer id, Integer money);

	@Update("update bank set balance=balance+#{money} where id=#{id}")
	void addMoney(Integer id, Integer money);

}
