package com.educandoweb.workshop.entities.enums;

public enum OrderStatus {

    PAID(1),
    WAITING_PAYMENT(2),
    DELIVERED(3),
    SHIPPED(4),
    CANCELED(5);

    private int code;

    private OrderStatus(int code) {
        this.code = code;
    }

    public int getCode() {
        return code;
    }

    public static OrderStatus valueOf(int code) {
        for (OrderStatus value : OrderStatus.values()) {
            if (value.getCode() == code) {
                return value;
            }
        }
        throw new IllegalArgumentException("Invalid OrderStatus code");
    }

}
