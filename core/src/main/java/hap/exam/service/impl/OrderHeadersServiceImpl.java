package hap.exam.service.impl;

import com.github.pagehelper.PageHelper;
import com.hand.hap.core.IRequest;
import com.hand.hap.system.dto.DTOStatus;
import com.hand.hap.system.service.impl.BaseServiceImpl;

import hap.exam.dto.OrderHeaders;
import hap.exam.dto.OrderHeadersDisplay;
import hap.exam.mapper.OrderHeadersMapper;
import hap.exam.service.IOrderHeadersService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author taotao.xu@hand-china.com
 */
@Service
public class OrderHeadersServiceImpl extends BaseServiceImpl<OrderHeaders> implements IOrderHeadersService{

    @Autowired
    private OrderHeadersMapper mapper;

	@Override
	public List<OrderHeadersDisplay> selectByOrder(IRequest requestContext, OrderHeadersDisplay order, int page, int pagesize) {
		// TODO Auto-generated method stub
		PageHelper.startPage(page, pagesize);
		return mapper.selectByHeaders(order);
	}
	
	
}
