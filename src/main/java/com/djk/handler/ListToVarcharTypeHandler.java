package com.djk.handler;

import com.mysql.cj.util.StringUtils;
import org.apache.ibatis.type.JdbcType;
import org.apache.ibatis.type.MappedJdbcTypes;
import org.apache.ibatis.type.MappedTypes;
import org.apache.ibatis.type.TypeHandler;

import java.sql.*;
import java.util.Arrays;
import java.util.List;
import java.util.StringJoiner;

@MappedJdbcTypes(JdbcType.VARCHAR)
@MappedTypes(List.class)
public class ListToVarcharTypeHandler implements TypeHandler<List<String>> {
    @Override
    public void setParameter(PreparedStatement preparedStatement, int i, List<String> strings, JdbcType jdbcType) throws SQLException {
        //遍历List，转换成String，存入数据库
        StringJoiner sj = new StringJoiner(",");
        for (String s : strings) {
            sj.add(s);
        }
        preparedStatement.setString(i, sj.toString());
    }

    @Override
    public List<String> getResult(ResultSet resultSet, String s) throws SQLException {
        //获取String类型的结果，使用","分割为List后返回
        String resultString = resultSet.getString(s);
        if (org.apache.commons.lang3.StringUtils.isNotEmpty(resultString)) {
            return Arrays.asList(resultString.split(","));
        }
        return null;
    }

    @Override
    public List<String> getResult(ResultSet resultSet, int i) throws SQLException {
        //获取String类型的结果，使用","分割为List后返回
        String resultString = resultSet.getString(i);
        if (org.apache.commons.lang3.StringUtils.isNotEmpty(resultString)) {
            return Arrays.asList(resultString.split(","));
        }
        return null;
    }

    @Override
    public List<String> getResult(CallableStatement callableStatement, int i) throws SQLException {
        //获取String类型的结果，使用","分割为List后返回
        String resultString = callableStatement.getString(i);
        if (org.apache.commons.lang3.StringUtils.isNotEmpty(resultString)) {
            return Arrays.asList(resultString.split(","));
        }
        return null;
    }
}
