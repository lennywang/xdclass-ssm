package com.xdclass.ssm;
/**
 * @Description: ${todo}
 * @author wll
 * @date 2020/8/8 22:50
 */

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 *
 **/
@SpringBootApplication
@MapperScan("com.xdclass.ssm.mapper")
@EnableTransactionManagement
public class SsmApplication {
    public static void main(String[] args){
        SpringApplication.run(SsmApplication.class,args);
    }
}
