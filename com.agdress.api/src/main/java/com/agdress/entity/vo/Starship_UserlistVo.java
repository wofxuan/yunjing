package com.agdress.entity.vo;




import java.io.Serializable;
import java.sql.Timestamp;


public class Starship_UserlistVo implements Serializable{

	private Long userId;
	private String bgLoginId;
 	private String loginName;
 	private String nickName;
 	private String passWord;
 	private String phone;
 	private String agentName;

	private Double balance;

	private Long cardNumber;

	private Timestamp createDate;
 	private Timestamp updateDate;

	private String ywName;

	private String qq;

	private String roleName;
 	private Long roleId;

	private Timestamp registerStartTime ;

	private Timestamp registerEndtime;

	public String getBgLoginId() {
		return bgLoginId;
	}

	public void setBgLoginId(String bgLoginId) {
		this.bgLoginId = bgLoginId;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public String getLoginName() {
		return loginName;
	}

	public void setLoginName(String loginName) {
		this.loginName = loginName;
	}

	public String getNickName() {
		return nickName;
	}

	public void setNickName(String nickName) {
		this.nickName = nickName;
	}

	public String getPassWord() {
		return passWord;
	}

	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getAgentName() {
		return agentName;
	}

	public void setAgentName(String agentName) {
		this.agentName = agentName;
	}

	public Double getBalance() {
		return balance;
	}

	public void setBalance(Double balance) {
		this.balance = balance;
	}

	public Long getCardNumber() {
		return cardNumber;
	}

	public void setCardNumber(Long cardNumber) {
		this.cardNumber = cardNumber;
	}

	public Timestamp getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Timestamp createDate) {
		this.createDate = createDate;
	}

	public Timestamp getUpdateDate() {
		return updateDate;
	}

	public void setUpdateDate(Timestamp updateDate) {
		this.updateDate = updateDate;
	}

	public String getYwName() {
		return ywName;
	}

	public void setYwName(String ywName) {
		this.ywName = ywName;
	}

	public String getQq() {
		return qq;
	}

	public void setQq(String qq) {
		this.qq = qq;
	}

	public String getRoleName() {
		return roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}

	public Long getRoleId() {
		return roleId;
	}

	public void setRoleId(Long roleId) {
		this.roleId = roleId;
	}

	public Timestamp getRegisterStartTime() {
		return registerStartTime;
	}

	public void setRegisterStartTime(Timestamp registerStartTime) {
		this.registerStartTime = registerStartTime;
	}

	public Timestamp getRegisterEndtime() {
		return registerEndtime;
	}

	public void setRegisterEndtime(Timestamp registerEndtime) {
		this.registerEndtime = registerEndtime;
	}
}