/*
 * #{copyright}#
 */

package hap.exam.controllers;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import com.hand.hap.system.controllers.BaseController;
import com.hand.hap.system.dto.ResponseData;

import hap.exam.dto.OrderHeadersDisplay;
import hap.exam.service.IOrderHeadersService;

import com.hand.hap.core.exception.BaseException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.hand.hap.core.IRequest;

/**
 * Created by xiangyu.qi on 16/8/26.
 */
@Controller
public class OrderHeadersController extends BaseController {

    @Autowired
    private IOrderHeadersService service;
    
    /**
     * 订单查询.
     * 
     * @param order
     *            分配对象
     * @param page
     *            起始页
     * @param pagesize
     *            分页大小
     * @param request
     *            HttpServletRequest
     * @return ResponseData
     */
    @RequestMapping(value = "/orderHeaders/query")
    @ResponseBody
    public ResponseData getTasks(OrderHeadersDisplay order, @RequestParam(defaultValue = DEFAULT_PAGE) int page,
            @RequestParam(defaultValue = DEFAULT_PAGE_SIZE) int pagesize, HttpServletRequest request) {
        IRequest requestContext = createRequestContext(request);
        return new ResponseData(service.selectByOrder(requestContext, order, page, pagesize));
    }
    

    
}
