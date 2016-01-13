package com.redhat.coolstore;

import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;
import java.util.Map;

public class TestEnumeration {
    public Map<String, List<String>> loadData() {
        Map data = new HashMap();

        List categories = new ArrayList();
        List subCategoriesShort = new ArrayList();
        List subCategoriesLong = new ArrayList();

        categories.add("Short");
        categories.add("Long");
        data.put("ShoppingCart.category", categories);

        subCategoriesShort.add("1");
        subCategoriesShort.add("2");
        data.put("ShoppingCart.subCategory[category=Short]", subCategoriesShort);

        subCategoriesLong.add("3");
        subCategoriesLong.add("4");
        data.put("ShoppingCart.subCategory[category=Long]", subCategoriesLong);

        return data;
    }
}
