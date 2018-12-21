package cn.edu.ncu.forums.dao;

import cn.edu.ncu.forums.entity.Comment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Description:
 *
 * @author Carlos Leo
 * @author 1119637652@qq.com
 * Time : 2018/12/14 21:51
 * @version : 1.0
 */
@Repository
public interface CommentDao extends JpaRepository<Comment, Long> {

    /**
     * 通过文章id查询所有评论
     * @param articleId 文章id
     * @return 评论列表
     */
    List<Comment> findAllByArticleId(Long articleId);

    /**
     * 通过评论的id删除评论
     * @param id 评论id
     */
    void deleteById(Long id);

    /**
     * 通过文章id删除对应的所有评论
     * @param articleId 文章id
     */
    void deleteAllByArticleId(Long articleId);
}
