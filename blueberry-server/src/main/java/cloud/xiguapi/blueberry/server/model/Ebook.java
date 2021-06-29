package cloud.xiguapi.blueberry.server.model;

import cloud.xiguapi.blueberry.server.model.common.CommonModel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 电子书实体
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
public class Ebook extends CommonModel {

    /**
     * id
     */
    private Long id;

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