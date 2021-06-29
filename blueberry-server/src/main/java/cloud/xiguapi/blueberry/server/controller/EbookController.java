package cloud.xiguapi.blueberry.server.controller;

import cloud.xiguapi.blueberry.server.common.ApiResult;
import cloud.xiguapi.blueberry.server.model.vo.EbookVO;
import cloud.xiguapi.blueberry.server.service.EbookService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * <p>
 *
 * @author 大大大西西瓜皮🍉
 * date: 2021/6/29 17:42
 * desc:
 */
@RestController
@RequestMapping("/ebook")
@Slf4j
public class EbookController {

    @Resource
    private EbookService service;

    @GetMapping("/search/{name}")
    public ApiResult<List<EbookVO>> search(@PathVariable String name) {
        return service.search(name);
    }
}
