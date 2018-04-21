package com.ecommerce.sw2.Models.Services;

import com.ecommerce.sw2.Models.Domain.Product;
import com.ecommerce.sw2.forms.AddProductForm;
import com.ecommerce.sw2.forms.EditProductForm;
import com.ecommerce.sw2.forms.RegisterForm;
import com.ecommerce.sw2.forms.StoreForm;

import java.util.Collection;

import java.util.Optional;

public interface ProductService {


    Optional<Product> getProduct(Long id);

    Product addProduct(AddProductForm addProductForm);

    public Collection<Product> getProductsByStore(StoreForm form);

    Product edit(EditProductForm editProductForm);

    Collection<Product> viewProducts();
}