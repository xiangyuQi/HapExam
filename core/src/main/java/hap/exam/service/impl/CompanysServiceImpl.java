package hap.exam.service.impl;


import com.hand.hap.system.service.impl.BaseServiceImpl;

import hap.exam.dto.Companys;
import hap.exam.service.ICompanysService;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class CompanysServiceImpl extends BaseServiceImpl<Companys> implements ICompanysService {

}
