package com.kenji.model;

/**
 * @Author Kenji
 * @Date 2021/8/26 11:16
 * @Description
 */

import com.kenji.enums.OrderDirection;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;

/**
 * 委托单
 */
@Data
@NoArgsConstructor
public class Order implements Serializable {

    /**
     * 本次订单的 Id
     */
    private String orderId;

    /**
     * 用户/会员 Id
     */
    private Long userId;

    /**
     * 支持的币币交易对
     */
    private String symbol;

    /**
     * 买入或卖出量
     */
    private BigDecimal amount = BigDecimal.ZERO;

    /**
     * 成交量
     */
    private BigDecimal tradedAmount = BigDecimal.ZERO;

    /**
     * 成交额
     */
    private BigDecimal turnover = BigDecimal.ZERO;

    /**
     * 币单位
     */
    private String coinSymbol;

    /**
     * 结算单位
     */
    private String baseSymbol;

    /**
     * 订单状态
     */
    private Integer orderStatus;

    /**
     * 订单的方向
     */
    private OrderDirection orderDirection;

    /**
     * 挂单的价格
     */
    private BigDecimal price = BigDecimal.ZERO;

    /**
     * 挂单时间
     */
    private Long time;

    /**
     * 交易完成时间
     */
    private Long completedTime;

    /**
     * 交易取消时间
     */
    private Long cancelTime;

    /**
     * 已经成功的水平订单
     */
    private List<OrderDetail> details;

    private boolean isCancelOrder ;


    /**
     * 订单是否完成的判断依据
     * @return
     */
    public boolean isCompleted() {
        return amount.compareTo(tradedAmount)<=0;
    }
}
