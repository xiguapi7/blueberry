package cloud.xiguapi.blueberry.server.model.common;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * 数据库实体公共类
 *
 * <p>
 *
 * @author 大大大西西瓜皮🍉
 * date: 2021/6/28 16:56
 * desc:
 */
public class CommonModel implements Serializable {

    /**
     * 创建时间
     */
    private LocalDateTime created;

    /**
     * 更改时间
     */
    private LocalDateTime updated;
}
