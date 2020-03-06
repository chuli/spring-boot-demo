package com.kk.domain.mapper;

import com.kk.domain.entity.DO.OrderDO;
import com.kk.domain.entity.DO.OrderDOExample;
import java.util.List;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.type.JdbcType;

public interface OrderDOMapper {
    @Insert({
        "insert into t_order (id, order_id, ",
        "user_id, order_status, ",
        "pay_amount, ctime, ",
        "mtime, content)",
        "values (#{id,jdbcType=BIGINT}, #{orderId,jdbcType=VARCHAR}, ",
        "#{userId,jdbcType=BIGINT}, #{orderStatus,jdbcType=SMALLINT}, ",
        "#{payAmount,jdbcType=BIGINT}, #{ctime,jdbcType=TIMESTAMP}, ",
        "#{mtime,jdbcType=TIMESTAMP}, #{content,jdbcType=LONGVARCHAR})"
    })
    int insert(OrderDO record);

    @InsertProvider(type=OrderDOSqlProvider.class, method="insertSelective")
    int insertSelective(OrderDO record);

    @SelectProvider(type=OrderDOSqlProvider.class, method="selectByExampleWithBLOBs")
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.BIGINT),
        @Result(column="order_id", property="orderId", jdbcType=JdbcType.VARCHAR),
        @Result(column="user_id", property="userId", jdbcType=JdbcType.BIGINT),
        @Result(column="order_status", property="orderStatus", jdbcType=JdbcType.SMALLINT),
        @Result(column="pay_amount", property="payAmount", jdbcType=JdbcType.BIGINT),
        @Result(column="ctime", property="ctime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="mtime", property="mtime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="content", property="content", jdbcType=JdbcType.LONGVARCHAR)
    })
    List<OrderDO> selectByExampleWithBLOBs(OrderDOExample example);

    @SelectProvider(type=OrderDOSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.BIGINT),
        @Result(column="order_id", property="orderId", jdbcType=JdbcType.VARCHAR),
        @Result(column="user_id", property="userId", jdbcType=JdbcType.BIGINT),
        @Result(column="order_status", property="orderStatus", jdbcType=JdbcType.SMALLINT),
        @Result(column="pay_amount", property="payAmount", jdbcType=JdbcType.BIGINT),
        @Result(column="ctime", property="ctime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="mtime", property="mtime", jdbcType=JdbcType.TIMESTAMP)
    })
    List<OrderDO> selectByExample(OrderDOExample example);
}