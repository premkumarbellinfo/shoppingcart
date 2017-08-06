package com.bellinfo.spring.shoppingcart.dao;

import java.util.List;

import com.bellinfo.spring.shoppingcart.model.CartInfo;
import com.bellinfo.spring.shoppingcart.model.OrderDetailInfo;
import com.bellinfo.spring.shoppingcart.model.OrderInfo;
import com.bellinfo.spring.shoppingcart.model.PaginationResult;

public interface OrderDAO {

	public void saveOrder(CartInfo cartInfo);
	 
    public PaginationResult<OrderInfo> listOrderInfo(int page,
            int maxResult, int maxNavigationPage);
    
    public OrderInfo getOrderInfo(String orderId);
    
    public List<OrderDetailInfo> listOrderDetailInfos(String orderId);
}
