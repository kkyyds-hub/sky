package com.sky.service;

import com.sky.dto.*;
import com.sky.result.PageResult;
import com.sky.vo.OrderPaymentVO;
import com.sky.vo.OrderStatisticsVO;
import com.sky.vo.OrderSubmitVO;
import com.sky.vo.OrderVO;

public interface OrderService {
    OrderSubmitVO submit(OrdersSubmitDTO ordersSubmitDTO);
    OrderPaymentVO payment(OrdersPaymentDTO ordersPaymentDTO) throws Exception;
    void paySuccess(String outTradeNo);

    PageResult pageQuery4User(int page, int pageSize, Integer status);

    void userCancelById(Long id) throws Exception;

    void repetition(Long id);

    PageResult conditionSearch(OrdersPageQueryDTO ordersPageQueryDTO);

    OrderStatisticsVO statistics();

    OrderVO details(Long id);

    void confirm(OrdersConfirmDTO ordersConfirmDTO);

    void rejection(OrdersRejectionDTO rejectionDTO) throws Exception;

    void delivery(Long id);

    void complete(Long id);

    void reminder(Long id);
}
