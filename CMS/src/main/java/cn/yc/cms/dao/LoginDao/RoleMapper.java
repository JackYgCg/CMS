package cn.yc.cms.dao.LoginDao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import cn.yc.cms.pojo.Role;

public interface RoleMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table role_table
     *
     * @mbg.generated Sat Dec 22 23:05:30 CST 2018
     */
    int deleteByPrimaryKey(Integer rId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table role_table
     *
     * @mbg.generated Sat Dec 22 23:05:30 CST 2018
     */
    int insert(Role record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table role_table
     *
     * @mbg.generated Sat Dec 22 23:05:30 CST 2018
     */
    int insertSelective(Role record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table role_table
     *
     * @mbg.generated Sat Dec 22 23:05:30 CST 2018
     */
    Role selectByPrimaryKey(Integer rId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table role_table
     *
     * @mbg.generated Sat Dec 22 23:05:30 CST 2018
     */
    int updateByPrimaryKeySelective(Role record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table role_table
     *
     * @mbg.generated Sat Dec 22 23:05:30 CST 2018
     */
    int updateByPrimaryKey(Role record);
    
    /**
     * 查询所有角色
     * */
    List<Map<String, Object>> selectAllRole(@Param("level")Integer level);
}