package com.bellinfo.spring.shoppingcart.dao;

import com.bellinfo.spring.shoppingcart.entity.Product;
import com.bellinfo.spring.shoppingcart.model.PaginationResult;
import com.bellinfo.spring.shoppingcart.model.ProductInfo;

public interface ProductDAO {

public Product findProduct(String code);
    
    public ProductInfo findProductInfo(String code) ;
  
    
    public PaginationResult<ProductInfo> queryProducts(int page,
                       int maxResult, int maxNavigationPage  );
    
    public PaginationResult<ProductInfo> queryProducts(int page, int maxResult,
                       int maxNavigationPage, String likeName);
 
    public void save(ProductInfo productInfo);
    
}
