package cloud.xiguapi.blueberry.server.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * MyBatis配置类
 * <p>
 *
 * @author 大大大西西瓜皮🍉
 * date: 2021/6/28 16:35
 * desc:
 */
@Configuration
@MapperScan(basePackages = "cloud.xiguapi.blueberry.server.mapper")
public class MyBatisConfiguration {

}
