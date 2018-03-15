package com.spring.domain;

import com.spring.domain.type.OrderStatus;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.*;

import java.math.BigDecimal;
import java.util.Date;

/**
 * @Description 订单
 * @Author ErnestCheng
 * @Date 2017/5/26.
 */
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@ApiModel(value="order对象",description="用户订单order")
public class Order {
    @ApiModelProperty(value="标识ID",name="id")
    private int id;
    @ApiModelProperty(value="创建时间",name="createTime")
    private Date createTime;
    @ApiModelProperty(value="更新时间",name="createTime")
    private Date updateTime;
    @ApiModelProperty(value="删除时间",name="deleteTime")
    private Date deleteTime;
    @ApiModelProperty(value="用户ID",name="userId")
    private int userId;
    @ApiModelProperty(value="产品ID",name="productId")
    private int productId;
    @ApiModelProperty(value="价格",name="price")
    private BigDecimal price;
    @ApiModelProperty(value="状态",name="status")
    private OrderStatus status;
    @ApiModelProperty(value="数量",name="num")
    private int num;

    public Order(Date createTime, Date updateTime, Date deleteTime, int userId, int productId, BigDecimal price, OrderStatus status,int num) {
        this.createTime = createTime;
        this.updateTime = updateTime;
        this.deleteTime = deleteTime;
        this.userId = userId;
        this.productId = productId;
        this.price = price;
        this.status = status;
        this.num=num;
    }
}
