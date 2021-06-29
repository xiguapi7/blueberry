package cloud.xiguapi.blueberry.server.mapper;

import cloud.xiguapi.blueberry.server.model.vo.EbookVO;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * 电子书 Mapper
 *
 * <p>
 *
 * @author 大大大西西瓜皮🍉
 * date: 2021/6/28 16:56
 * desc:
 */
public interface EbookMapper {

    /**
     * 关键字搜索
     *
     * @param name 关键字, 格式%{name}%
     * @return 电子书VO列表
     */
    @Select("select id, name, category1_id, category2_id, description, cover, doc_count, view_count, vote_count " +
            "from ebook e " +
            "where name LIKE #{name}")
    List<EbookVO> search(String name);
}