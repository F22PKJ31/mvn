package com.sac.service;

import org.springframework.stereotype.Service;

import com.sac.pojo.SacMessage;
import com.sac.utils.MyDate;
@Service
public class MessageService extends BaseService{

	public SacMessage getMessage(Integer mesid) {
		SacMessage message = sacMessageMapper.selectByPrimaryKey(mesid);
		message.setMessagedate(new MyDate(message.getMessagedate()));
		return message;
		// TODO Auto-generated method stub	
	}

}
