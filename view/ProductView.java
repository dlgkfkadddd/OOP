package view;

import serviceImpl.UtilServiceImpl;
import sevice.UtilService;

public class ProductView {
    public ProductView() {
    }

    public static void main(String[] args) {
        UtilService util = UtilServiceImpl.getInstance();
    }
}