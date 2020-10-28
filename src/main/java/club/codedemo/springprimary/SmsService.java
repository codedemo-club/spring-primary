package club.codedemo.springprimary;

/**
 * 短信服务
 */
public interface SmsService {
    /**
     * 发送短信
     * @param phone 手机号
     * @param message 短信内容
     */
    void sendMessage(String phone, String message);
}
