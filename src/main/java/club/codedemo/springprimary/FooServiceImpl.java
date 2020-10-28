package club.codedemo.springprimary;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
@Primary
public class FooServiceImpl implements FooService {
}
