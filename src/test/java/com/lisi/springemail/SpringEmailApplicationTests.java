package com.lisi.springemail;

import com.lisi.springemail.service.MailService;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest
@RunWith(SpringRunner.class)
class SpringEmailApplicationTests {
    @Autowired
    private MailService mailService;
    /**
     * 验证发送文本短信
     */
    @Test
    void contextLoads() {
        mailService.sendSimpleMail("2632492263@qq.com","springboot-email测试","测试邮箱是否发送成功");
    }
    /**
     * 验证发送html短信
     */
    @Test
    void contextLoads2() {
        String content="<html>\n"+
                "<body>\n"+
                "<h3>hello 明天要加油哦！<a href='http://www.baidu.com'>百度</a></h3>\n"+
                "</body>\n"+
                "</html>";
        mailService.sendHtmlMail("2632492263@qq.com","这是一封html邮件",content);
    }

}
