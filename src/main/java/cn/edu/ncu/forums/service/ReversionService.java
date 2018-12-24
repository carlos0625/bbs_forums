package cn.edu.ncu.forums.service;

import cn.edu.ncu.forums.dao.ReversionDao;
import cn.edu.ncu.forums.entity.Reversion;
import cn.edu.ncu.forums.utils.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Description: reversion的服务层
 * @author Carlos Leo
 * @author 1119637652@qq.com
 * Time : 2018/12/21 22:28
 * @version : 1.0
 */
@Service
public class ReversionService {

    @Autowired
    private ReversionDao reversionDao;

    /**
     * 添加评论
     * @param reversion 评论对象
     * @return 返回消息
     */
    public Message addReversion(Reversion reversion) {
        reversionDao.save(reversion);
        return new Message(1, "add success", reversion);
    }

    /**
     * 通过评论id查询对应的所有回复
     * @param commentId 评论的id
     * @return 返回消息
     */
    public Message findByCommentId(Long commentId) {
        return new Message(1, "success", reversionDao.findReversionsByCommentId(commentId));
    }

    /**
     * 通过回复的id删除回复
     * @param reversionId 回复的id
     * @return message
     */
    public Message delete(Long reversionId) {
        reversionDao.deleteById(reversionId);
        return new Message(1, "modify success", null);
    }
}
