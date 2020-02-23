package com.lisi.springemail.test;

import com.lisi.springemail.SpringEmailApplication;
import com.lisi.springemail.service.MailService;
import org.junit.Test;

import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = {SpringEmailApplication.class})
class SpringEmailApplicationTests {

    @Autowired
    private MailService mailService;
    /**
     * 验证发送短信
     */
    @Test
    public void test02() {
        mailService.sendSimpleMail("2632492263@qq.com","springboot-email测试","测试邮箱是否发送成功");
    }

    /**
     * 测试发送html
     */
    @Test
    public void sendHtmlMailTest()  {
        String content="<html>\n"+
                "<body>\n"+
                "<h3>hello 明天要加油哦！</h3>\n"+
                "</body>\n"+
                "</html>";
        mailService.sendHtmlMail("2632492263@qq.com","这是一封html邮件",content);
    }


}
