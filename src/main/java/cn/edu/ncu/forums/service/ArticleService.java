package cn.edu.ncu.forums.service;

import cn.edu.ncu.forums.dao.ArticleDao;
import cn.edu.ncu.forums.entity.Article;
import cn.edu.ncu.forums.utils.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Description: Article的服务层
 * @author Carlos Leo
 * @author 1119637652@qq.com
 * Time : 2018/12/21 12:50
 * @version : 1.0
 */
@Service
public class ArticleService {

    @Autowired
    private ArticleDao articleDao;

    /**
     * 用户发表文章/需求
     * @param article 文章对象
     * @return 消息，1为状态码
     */
    public Message addArticle(Article article) {
        articleDao.save(article);
        return new Message(201, "success", article);
    }

    /**
     * 文章的分页查询
     * @param page 第几页
     * @param size 每一页多大
     * @return Message
     */
    public Message findBookPage(Integer page, Integer size) {
        Pageable pageable = new PageRequest(page, size, Sort.Direction.ASC, "createdTime");
        List<Article> articles = new ArrayList<>();
        Page<Article> articlePage = articleDao.findAll(pageable);
        for (Article article: articlePage) {
            articles.add(article);
        }
        return new Message(200, "success", articles);
    }

    /**
     * 文章加精
     * @param picked 精选？
     * @param articleId 文章id
     * @return message
     */
    public Message updatePicked(Boolean picked, Long articleId) {
        articleDao.updatePickedById(picked, articleId);
        return new Message(201, "set picked success", null);
    }

    /**
     * 修改内容
     * @param content 文章内容
     * @param articleId 用户id
     * @return message
     */
    public Message updateContent(String content, Long articleId) {
        articleDao.updateContentById(content, articleId);
        return new Message(201, "modified content success", null);
    }

    /**
     * 用户或管理员删除文章
     * @param articleId 文章id
     * @return message
     */
    public Message delete(Long articleId) {
        articleDao.deleteById(articleId);
        return new Message(204, "delete success", null);
    }

    /**
     * 通过id查找文章
     * @param id 文章
     * @return message
     */
    public Message findById(Long id) {
        return new Message(200, "the article existed", articleDao.findArticleById(id));
    }
}
