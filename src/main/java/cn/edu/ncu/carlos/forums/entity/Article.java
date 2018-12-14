package cn.edu.ncu.carlos.forums.entity;

import org.springframework.data.annotation.Id;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import java.sql.Timestamp;

/**
 * Description: 文章实体类
 * @author Carlos Leo
 * @author 1119637652@qq.com
 * Time : 2018/12/14 15:46
 * @version : 1.0
 */
@Entity
public class Article {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 40, nullable = false)
    private String title;

    @Column(nullable = false)
    private String content;

    @Column(nullable = false)
    private Timestamp createdTime;

    @Column(nullable = false)
    private Long userId;

    @Column(nullable = false)
    private Long likedNumber;

    @Column(nullable = false)
    private Long dislikedNumber;

    @Column(nullable = false)
    private Long commentNumber;

    @Column(length = 20, nullable = false)
    private String tag;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Timestamp getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(Timestamp createdTime) {
        this.createdTime = createdTime;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Long getLikedNumber() {
        return likedNumber;
    }

    public void setLikedNumber(Long likedNumber) {
        this.likedNumber = likedNumber;
    }

    public Long getDislikedNumber() {
        return dislikedNumber;
    }

    public void setDislikedNumber(Long dislikedNumber) {
        this.dislikedNumber = dislikedNumber;
    }

    public Long getCommentNumber() {
        return commentNumber;
    }

    public void setCommentNumber(Long commentNumber) {
        this.commentNumber = commentNumber;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }
}
