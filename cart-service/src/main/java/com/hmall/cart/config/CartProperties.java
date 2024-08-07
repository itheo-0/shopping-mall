package com.hmall.cart.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: gero
 * @Date: 2024/08/07/11:34
 * @Description:
 */
@Data
@Component
@ConfigurationProperties("hm.cart")
public class CartProperties {
    private Integer maxAmount;
}
