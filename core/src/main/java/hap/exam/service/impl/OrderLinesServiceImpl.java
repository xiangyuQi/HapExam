package hap.exam.service.impl;

import com.hand.hap.system.service.impl.BaseServiceImpl;

import hap.exam.dto.OrderLines;
import hap.exam.mapper.OrderLinesMapper;
import hap.exam.service.IOrderLinesService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


/**
 * @author taotao.xu@hand-china.com
 */
@Service
public class OrderLinesServiceImpl extends BaseServiceImpl<OrderLines> implements IOrderLinesService{

    @Autowired
    private OrderLinesMapper mapper;
	
}
