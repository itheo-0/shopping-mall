package com.hmall.common.config;

import org.springframework.amqp.support.converter.Jackson2JsonMessageConverter;
import org.springframework.amqp.support.converter.MessageConverter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: gero
 * @Date: 2024/08/15/16:17
 * @Description:
 */
@Configuration
public class MqConfig {
    @Bean
    public MessageConverter jacksonMessageConvertor(){
        return new Jackson2JsonMessageConverter();
    }
}
