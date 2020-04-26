package git.yampery.cryptic.dao;

import git.yampery.cryptic.pojo.TUser;

import java.util.List;
import java.util.Map;

public interface UserDao {

    int insert(TUser record);

    int insertSelective(TUser record);

    List<TUser> queryList(Map<String, Object> map);
}
