package cloud.xiguapi.blueberry.server.common;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * API通用响应对象
 * <p>
 *
 * @author 大大大西西瓜皮🍉
 * date: 2021/6/28 17:08
 * desc:
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ApiResult<T> {

    /**
     * API操作结果
     */
    private boolean success = true;

    /**
     * 响应码
     * 成功 0
     * 失败 -1
     */
    private int code = 0;

    /**
     * 响应信息
     */
    private String message = "接口操作成功";

    /**
     * 响应数据
     */
    private T data;

    /**
     * 构造ApiResult
     *
     * @param success 操作结果
     * @param code    响应码
     * @param message 响应信息
     * @param data    响应数据
     * @param <T>     响应数据泛型
     * @return 通用响应对象
     */
    public static <T> ApiResult<T> instance(boolean success, int code, String message, T data) {
        return new ApiResult<>(success, code, message, data);
    }

    /**
     * 成功
     *
     * @param code    响应码
     * @param message 响应信息
     * @param data    响应数据
     * @param <T>     响应数据泛型
     * @return 通用响应对象
     */
    public static <T> ApiResult<T> success(int code, String message, T data) {
        return instance(true, code, message, data);
    }

    /**
     * 成功
     *
     * @param message 响应信息
     * @param data    响应数据
     * @param <T>     响应数据泛型
     * @return 通用响应对象
     */
    public static <T> ApiResult<T> success(String message, T data) {
        return instance(true, 0, message, data);
    }

    /**
     * 成功
     *
     * @param message 响应信息
     * @param <T>     响应数据泛型
     * @return 通用响应对象
     */
    public static <T> ApiResult<T> success(String message) {
        return instance(true, 0, message, null);
    }

    /**
     * 成功
     *
     * @param data 响应数据
     * @param <T>  响应数据泛型
     * @return 通用响应对象
     */
    public static <T> ApiResult<T> success(T data) {
        return instance(true, 0, "接口操作成功", data);
    }

    /**
     * 错误
     *
     * @param message 响应信息
     * @param data    响应数据
     * @param <T>     响应数据泛型
     * @return 通用响应对象
     */
    public static <T> ApiResult<T> error(int code, String message, T data) {
        return instance(false, code, message, data);
    }

    /**
     * 错误
     *
     * @param message 响应信息
     * @param <T>     响应数据泛型
     * @return 通用响应对象
     */
    public static <T> ApiResult<T> error(int code, String message) {
        return instance(false, code, message, null);
    }

    /**
     * 错误
     *
     * @param message 响应信息
     * @param data    响应数据
     * @param <T>     响应数据泛型
     * @return 通用响应对象
     */
    public static <T> ApiResult<T> error(String message, T data) {
        return instance(false, -1, message, data);
    }

    /**
     * 错误
     *
     * @param data 响应数据
     * @param <T>  响应数据泛型
     * @return 通用响应对象
     */
    public static <T> ApiResult<T> error(T data) {
        return instance(false, -1, "接口操作失败", data);
    }

    /**
     * 错误
     *
     * @param message 响应信息
     * @param <T>     响应数据泛型
     * @return 通用响应对象
     */
    public static <T> ApiResult<T> error(String message) {
        return instance(false, -1, message, null);
    }
}
