package cloud.xiguapi.blueberry.server.service;

import cloud.xiguapi.blueberry.server.common.ApiResult;
import cloud.xiguapi.blueberry.server.mapper.EbookMapper;
import cloud.xiguapi.blueberry.server.model.vo.EbookVO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.StringUtils;

import javax.annotation.Resource;
import java.util.List;

/**
 * 电子书服务实现
 * <p>
 *
 * @author 大大大西西瓜皮🍉
 * date: 2021/6/29 17:25
 * desc:
 */
@Service
@Slf4j
@Transactional(readOnly = true)
public class EbookService {

    @Resource
    private EbookMapper mapper;

    /**
     * 关键字模糊搜索
     *
     * @param name 关键字
     * @return 搜索结果
     */
    public ApiResult<List<EbookVO>> search(String name) {
        if (StringUtils.isEmpty(name)) {
            log.info("EbookService - 搜索参数name为空");
            return ApiResult.error("搜索参数不能为空");
        }
        log.info("关键字模糊搜索, 参数 name = {}", name);

        // 关键字模糊搜索
        List<EbookVO> ebooks = mapper.search("%" + name + "%");
        return ApiResult.success("模糊搜索 `" + name + "` 成功", ebooks);
    }
}
