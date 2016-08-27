package hap.exam.service.impl;


import com.hand.hap.system.service.impl.BaseServiceImpl;

import hap.exam.dto.Customers;
import hap.exam.service.ICustomersService;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class CustomersServiceImpl extends BaseServiceImpl<Customers> implements ICustomersService {

}
