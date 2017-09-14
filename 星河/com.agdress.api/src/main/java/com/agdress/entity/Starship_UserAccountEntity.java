package com.agdress.entity;


import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.annotations.Version;
import com.baomidou.mybatisplus.enums.IdType;

import java.sql.Timestamp;


/**
 * 用户财富实体
 */
@TableName(value = "t_user_account")
public class Starship_UserAccountEntity extends BaseEntity {

    @TableId(type = IdType.AUTO,value = "account_id")
    private Long accountId;

    @TableField(value = "user_id")
    private Long userId;

    @TableField(value = "actype")
    private Long actype;//账户类型 0：试玩账号 1：真钱账号

    @TableField(value = "currency")
    private Long currency;//币种类型  0：CNY 人民币 1：KRW 韩元 2：MYR 马来西亚币  3：USD 美元 4：JPY 日元 5：THB 泰铢 6：BTC 比特币 7：IDR 印尼盾 8：VND 越南盾 9：EUR 欧元 10：INR 印度卢比

    @TableField(value = "balance")
    private Double balance;

    @TableField(value = "total_recharge")
    private Double totalRecharge;//充值总额
    @TableField(value = "total_expend")
    private Double totalExpend;//指出总额
    @TableField(value = "total_income")
    private Double totalIncome;//收入总额
    @TableField(value = "total_withdraw")
    private Double totalWithdraw;//提现总额
    @TableField(value = "total_lottery")
    private Double totalLottery;//转码总额

    public Long getAccountId() {
        return accountId;
    }

    public void setAccountId(Long accountId) {
        this.accountId = accountId;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Long getActype() {
        return actype;
    }

    public void setActype(Long actype) {
        this.actype = actype;
    }

    public Long getCurrency() {
        return currency;
    }

    public void setCurrency(Long currency) {
        this.currency = currency;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public Double getTotalRecharge() {
        return totalRecharge;
    }

    public void setTotalRecharge(Double totalRecharge) {
        this.totalRecharge = totalRecharge;
    }

    public Double getTotalExpend() {
        return totalExpend;
    }

    public void setTotalExpend(Double totalExpend) {
        this.totalExpend = totalExpend;
    }

    public Double getTotalIncome() {
        return totalIncome;
    }

    public void setTotalIncome(Double totalIncome) {
        this.totalIncome = totalIncome;
    }

    public Double getTotalWithdraw() {
        return totalWithdraw;
    }

    public void setTotalWithdraw(Double totalWithdraw) {
        this.totalWithdraw = totalWithdraw;
    }

    public Double getTotalLottery() {
        return totalLottery;
    }

    public void setTotalLottery(Double totalLottery) {
        this.totalLottery = totalLottery;
    }
}
