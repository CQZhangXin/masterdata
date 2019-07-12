package com.yuanian.masterdata;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;

@RunWith(SpringJUnit4ClassRunner.class) //使用junit4进行测试
@SpringBootTest(classes = MasterdataApplication.class) // 指定我们SpringBoot工程的
@WebAppConfiguration
public class BaseTest {



}
