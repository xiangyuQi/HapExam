package hap.exam.controllers;


import com.hand.hap.core.IRequest;
import com.hand.hap.system.controllers.BaseController;
import com.hand.hap.system.dto.ResponseData;

import hap.exam.dto.Customers;
import hap.exam.service.ICustomersService;

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
public class CustomersController  extends BaseController{

    @Autowired
    private ICustomersService customersService;

    @RequestMapping("/customers/query")
    @ResponseBody
    public ResponseData selectList(HttpServletRequest request, Customers condition,
                                   @RequestParam(defaultValue = DEFAULT_PAGE) int page,
                                   @RequestParam(defaultValue = DEFAULT_PAGE_SIZE) int pagesize) {
        IRequest iRequest = createRequestContext(request);
        List<Customers> datas = customersService.select(iRequest, condition, page, pagesize);
        return new ResponseData(datas);
    }

    @RequestMapping(value = "/customers/submit", method = RequestMethod.POST)
    @ResponseBody
    public ResponseData submit(HttpServletRequest request, @RequestBody List<Customers> customers) {
        IRequest iRequest = createRequestContext(request);
        List<Customers> datas = customersService.batchUpdate(iRequest, customers);
        return new ResponseData(datas);
    }

    @RequestMapping(value = "/customers/delete", method = RequestMethod.POST)
    @ResponseBody
    public ResponseData delete(HttpServletRequest request, @RequestBody List<Customers> customers) {
        IRequest iRequest = createRequestContext(request);
        customersService.batchDelete(customers);
        return new ResponseData();
    }
}
