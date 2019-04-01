package com.venky.vip.day5.template.jdbc;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * 数据库模板类
 *
 * @author Venkin
 * @date 2019/4/1
 **/
public abstract class JdbcTemplate {

    private DataSource dataSource;

    public JdbcTemplate(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    public List<?> executeQuery(String sql,RowMapper<?> rowMapper,Object[] values) {

        try {
            // 1、获取连接
            Connection conn = this.getConnection();

            // 2、创建语句集
            PreparedStatement pstm = this.createPrepareStatement(conn, sql);

            // 3、执行结果集
            ResultSet rs = this.executeQuery(pstm, values);

            // 4、处理结果集
            List<?> result = this.prepareResultSet(rs, rowMapper);

            // 5、关闭结果集
            this.closeResultSet(rs);

            // 6、关闭语句集
            this.closeStatement(pstm);

            // 7、关闭连接
            this.closeConnection(conn);
            return result;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
        
    }

    /**
     * 关闭连接
     * 如果使用的是数据库连接池，不需要关闭
     *
     * @param conn
     * @throws SQLException
     */
    protected void closeConnection(Connection conn) throws SQLException {
        conn.close();
    }

    protected void closeStatement(PreparedStatement pstm) throws SQLException {
        pstm.close();
    }

    protected void closeResultSet(ResultSet rs) throws SQLException {
        rs.close();
    }

    protected List<?> prepareResultSet(ResultSet rs, RowMapper<?> rowMapper) throws Exception {
        List<Object> result = new ArrayList<>();
        int rowNum = 1;
        while (rs.next()) {
            result.add(rowMapper.mapRow(rs,rowNum++));
        }
        return result;
    }

    protected ResultSet executeQuery(PreparedStatement pstm, Object[] values) throws SQLException {
        for (int i = 0; i < values.length; i++) {
            pstm.setObject(i,values[i]);
        }
        return pstm.executeQuery();
    }

    protected PreparedStatement createPrepareStatement(Connection conn, String sql) throws SQLException {
        return conn.prepareStatement(sql);
    }


    public Connection getConnection() throws Exception {
        return this.dataSource.getConnection();
    }
}
