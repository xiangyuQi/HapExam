package hap.exam.mapper;

import com.hand.hap.mybatis.common.Mapper;

import hap.exam.dto.OrderHeaders;
import hap.exam.dto.OrderHeadersDisplay;

import java.util.List;

/**
 * @author taotao.xu@hand-china.com
 */
public interface OrderHeadersMapper extends Mapper<OrderHeaders> {

    List<OrderHeadersDisplay> selectByHeaders(OrderHeadersDisplay headers);
    

}
