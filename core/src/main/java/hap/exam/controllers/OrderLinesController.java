package hap.exam.controllers;


import com.hand.hap.core.IRequest;
import com.hand.hap.system.controllers.BaseController;
import com.hand.hap.system.dto.ResponseData;

import hap.exam.dto.Customers;
import hap.exam.dto.OrderLines;
import hap.exam.service.ICustomersService;
import hap.exam.service.IOrderLinesService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * Created by xiangyu.qi on 16/8/26.
 */
@Controller
public class OrderLinesController  extends BaseController{

    @Autowired
    private IOrderLinesService orderLinesService;


    @RequestMapping(value = "/orderLines/submit", method = RequestMethod.POST)
    @ResponseBody
    public ResponseData submit(HttpServletRequest request, @RequestBody List<OrderLines> orderLines) {
        IRequest iRequest = createRequestContext(request);
        List<OrderLines> datas = orderLinesService.batchUpdate(iRequest, orderLines);
        return new ResponseData(datas);
    }

}
