package hap.exam.service;


import com.hand.hap.system.service.IBaseService;

import hap.exam.dto.OrderHeaders;
import hap.exam.dto.OrderHeadersDisplay;

import com.hand.hap.core.ProxySelf;
import com.hand.hap.core.annotation.StdWho;

import java.util.List;

import com.hand.hap.core.IRequest;


/**
 * Created by xiangyu.qi on 16/8/26.
 */
public interface IOrderHeadersService extends IBaseService<OrderHeaders>, ProxySelf<IOrderHeadersService> {

    List<OrderHeadersDisplay> selectByOrder(IRequest requestContext, OrderHeadersDisplay order, int page, int pagesize);
    
}
