package com.venky.vip.day5.template.jdbc.dao;

import com.venky.vip.day5.template.entity.Member;
import com.venky.vip.day5.template.jdbc.JdbcTemplate;
import com.venky.vip.day5.template.jdbc.RowMapper;

import javax.sql.DataSource;
import java.sql.ResultSet;
import java.util.List;

/**
 * 成员的dao层
 *
 * @author Venkin
 * @date 2019/4/2
 **/
public class MemberDao extends JdbcTemplate {

    public MemberDao(DataSource dataSource) {
        super(dataSource);
    }

    public List<?> selectAll() {
        String sql = "select * from t_member";

        return super.executeQuery(sql, new RowMapper<Member>() {

            @Override
            public Member mapRow(ResultSet rs, int rowNum) throws Exception {
                Member member = new Member();
                member.setUsername(rs.getString("username"));
                member.setNickName(rs.getString("nickName"));
                member.setPassword(rs.getString("password"));
                member.setAddr(rs.getString("addr"));
                member.setAge(rs.getInt("age"));
                return member;
            }
        },null);
    }
}
