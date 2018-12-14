package cn.edu.ncu.carlos.forums.entity;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Description:评论的回复实体类
 * @author Carlos Leo
 * @author 1119637652@qq.com
 * Time : 2018/12/14 15:56
 * @version : 1.0
 */
@Entity
public class Reversion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private Long commentId;

    @Column(nullable = false)
    private Timestamp reversionTime;

    @Column(nullable = false)
    private Long userId;

    @Column(nullable = false)
    private String content;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getCommentId() {
        return commentId;
    }

    public void setCommentId(Long commentId) {
        this.commentId = commentId;
    }

    public Timestamp getReversionTime() {
        return reversionTime;
    }

    public void setReversionTime(Timestamp reversionTime) {
        this.reversionTime = reversionTime;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
