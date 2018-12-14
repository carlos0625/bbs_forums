package cn.edu.ncu.carlos.forums.dao;

import cn.edu.ncu.carlos.forums.entity.Reversion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Description:
 *
 * @author Carlos Leo
 * @author 1119637652@qq.com
 * Time : 2018/12/14 16:01
 * @version : 1.0
 */
@Repository
public interface ReversionDao extends JpaRepository<Reversion, Long> {
}
