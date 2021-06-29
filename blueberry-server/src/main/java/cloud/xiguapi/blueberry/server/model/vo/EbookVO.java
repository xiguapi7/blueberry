package cloud.xiguapi.blueberry.server.model.vo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * 电子书视图对象
 * <p>
 *
 * @author 大大大西西瓜皮🍉
 * date: 2021/6/28 16:56
 * desc:
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class EbookVO implements Serializable {

    /**
     * 名称
     */
    private String name;

    /**
     * 分类1
     */
    private Long category1Id;

    /**
     * 分类2
     */
    private Long category2Id;

    /**
     * 描述
     */
    private String description;

    /**
     * 封面
     */
    private String cover;

    /**
     * 文档数
     */
    private Integer docCount;

    /**
     * 阅读数
     */
    private Integer viewCount;

    /**
     * 点赞数
     */
    private Integer voteCount;
}