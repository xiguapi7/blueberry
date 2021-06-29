package cloud.xiguapi.blueberry.server.util;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import org.springframework.util.CollectionUtils;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

/**
 * 复制实体工具类
 *
 * <p>
 *
 * @author 大大大西西瓜皮🍉
 * date: 2021/6/29 17:55
 * desc:
 */
@Slf4j
public class CopyUtil {

    private CopyUtil() {
    }

    /**
     * 单个对象复制
     *
     * @param source 源对象
     * @param cls    目标对象类型
     * @param <T>    目标对象泛型
     * @return 目标对象
     */
    public static <T> T copy(Object source, Class<T> cls) {
        // 校验源对象是否为空
        if (source == null) {
            return null;
        }

        T target = null;
        try {
            // 利用反射实例化对象
            target = cls.getConstructor().newInstance();
        } catch (NoSuchMethodException | InstantiationException | IllegalAccessException | InvocationTargetException e) {
            log.error("实体复制发生错误, 错误信息: {}", e.getMessage());
            return null;
        }

        // 复制源对象的属性
        BeanUtils.copyProperties(source, target);
        return target;
    }

    /**
     * 列表复制
     *
     * @param source 源列表
     * @param cls    目标对象类型
     * @param <T>    目标对象类型
     * @param <E>    源对象类型
     * @return 目标列表
     */
    public static <T, E> List<T> copyList(List<E> source, Class<T> cls) {
        // 声明目标列表
        List<T> target = new ArrayList<>();

        // 校验源列表是否为空, 非空执行复制操作
        if (!CollectionUtils.isEmpty(source)) {
            source.forEach(e -> {
                // 复制对象
                T ele = copy(e, cls);
                if (ele != null) {
                    // 如果复制对象不为空, 则添加到目标列表
                    target.add(ele);
                }
            });
        }
        // 返回目标列表
        return target;
    }
}
