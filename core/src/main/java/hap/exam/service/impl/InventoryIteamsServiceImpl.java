package hap.exam.service.impl;


import com.hand.hap.system.service.impl.BaseServiceImpl;

import hap.exam.dto.InventoryItems;
import hap.exam.service.IInventoryItemsService;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
/**
 * Created by xiangyu.qi on 16/8/26.
 */
@Service
@Transactional
public class InventoryIteamsServiceImpl extends BaseServiceImpl<InventoryItems> implements IInventoryItemsService {

}
