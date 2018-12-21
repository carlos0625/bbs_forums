package cn.edu.ncu.forums.dao;

import cn.edu.ncu.forums.entity.Reversion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Description: reversion的dao层，封装数据库操作
 * @author Carlos Leo
 * @author 1119637652@qq.com
 * Time : 2018/12/14 21:51
 * @version : 1.0
 */
@Repository
public interface ReversionDao extends JpaRepository<Reversion, Long> {

    /**
     * 通过commentId查询回复
     * @param commentId 评论的id
     * @return 回复列表
     */
    List<Reversion> findReversionsByCommentId(Long commentId);

    /**
     * 通过reversionId删除评论
     * @param reversionId 回复的id
     */
    @Transactional
    void deleteById(Long reversionId);

    /**
     * 通过commentId删除所有回复
     * @param commentId 评论id
     */
    @Transactional
    void deleteReversionsByCommentId(Long commentId);

}
