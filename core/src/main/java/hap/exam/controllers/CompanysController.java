package hap.exam.controllers;


import com.hand.hap.core.IRequest;
import com.hand.hap.system.controllers.BaseController;
import com.hand.hap.system.dto.ResponseData;

import hap.exam.dto.Companys;
import hap.exam.service.ICompanysService;

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
public class CompanysController  extends BaseController{

    @Autowired
    private ICompanysService companysService;

    @RequestMapping("/companys/query")
    @ResponseBody
    public ResponseData selectList(HttpServletRequest request, Companys condition,
                                   @RequestParam(defaultValue = DEFAULT_PAGE) int page,
                                   @RequestParam(defaultValue = DEFAULT_PAGE_SIZE) int pagesize) {
        IRequest iRequest = createRequestContext(request);
        List<Companys> datas = companysService.select(iRequest, condition, page, pagesize);
        return new ResponseData(datas);
    }

    @RequestMapping(value = "/companys/submit", method = RequestMethod.POST)
    @ResponseBody
    public ResponseData submit(HttpServletRequest request, @RequestBody List<Companys> companys) {
        IRequest iRequest = createRequestContext(request);
        List<Companys> datas = companysService.batchUpdate(iRequest, companys);
        return new ResponseData(datas);
    }

    @RequestMapping(value = "/companys/delete", method = RequestMethod.POST)
    @ResponseBody
    public ResponseData delete(HttpServletRequest request, @RequestBody List<Companys> companys) {
        IRequest iRequest = createRequestContext(request);
        companysService.batchDelete(companys);
        return new ResponseData();
    }
}
