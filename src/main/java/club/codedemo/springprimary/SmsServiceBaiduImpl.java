package club.codedemo.springprimary;

import org.springframework.stereotype.Component;

/**
 * 百度短消息实现类
 */
@Component
public class SmsServiceBaiduImpl implements SmsService {
    @Override
    public void sendMessage(String phone, String message) {
    }
}
