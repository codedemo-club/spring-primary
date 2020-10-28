package club.codedemo.springprimary;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

/**
 * 阿里短消息实现类
 */
@Component
@Primary
public class SmsServiceAliImpl implements SmsService {
    @Override
    public void sendMessage(String phone, String message) {
    }
}
