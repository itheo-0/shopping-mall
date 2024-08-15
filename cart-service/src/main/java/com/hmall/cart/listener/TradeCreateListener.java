package com.hmall.cart.listener;

import com.hmall.cart.service.ICartService;
import lombok.RequiredArgsConstructor;
import org.springframework.amqp.core.ExchangeTypes;
import org.springframework.amqp.rabbit.annotation.Exchange;
import org.springframework.amqp.rabbit.annotation.Queue;
import org.springframework.amqp.rabbit.annotation.QueueBinding;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: gero
 * @Date: 2024/08/15/17:43
 * @Description:
 */
@Component
@RequiredArgsConstructor
public class TradeCreateListener {
    private final ICartService cartService;

    @RabbitListener(bindings = @QueueBinding(
            value = @Queue(name = "cart.clear.queue", durable = "true"),
            exchange = @Exchange(name = "trade.topic",type = ExchangeTypes.TOPIC),
            key = "order.create"
    ))
    public void listenTradeCreate(List<Long> ids){
        //清除购物车
        cartService.removeByItemIds(ids);
    }
}
