package com.buiminhduc;

import com.buiminhduc.model.response.CheckOutResponse;
import com.buiminhduc.service.impl.CheckOutServiceImpl;
import com.buiminhduc.util.ObjectUtil;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class test {
    public static void main(String[] args) throws SQLException {
        CheckOutResponse checkOutResponse = new CheckOutServiceImpl().findById(5);

        String a= checkOutResponse.getListProduct();
        ObjectUtil.convertStringToList(a).stream().forEach(System.out::println);
    }
}
