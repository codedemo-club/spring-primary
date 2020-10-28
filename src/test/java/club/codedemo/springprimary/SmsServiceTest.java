package club.codedemo.springprimary;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class SmsServiceTest {
    @Autowired
    SmsService smsService;

    @Test
    void test() {
        assertEquals(SmsServiceAliImpl.class, smsService.getClass());
    }
}