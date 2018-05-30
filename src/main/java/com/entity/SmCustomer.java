package com.entity;

import java.math.BigDecimal;
import java.util.Date;
import java.util.UUID;

import org.springframework.util.StringUtils;

public class SmCustomer {
    private String id;

    private String name;

    private String customername;

    private char sex;

    private Integer age;

    private String customertype;

    private String attitude;

    private String provinceId;

    private String cityId;

    private String areaId;

    private String phone;

    private String project;

    private String customersource;
    
    private String customersourceName;

    private Date inDate;

    private Date firstcontacttime;

    private Date lastcontacttime;

    private String customerlevel;

    private String idnumber;

    private String status;

    private String teamId;

    private String teamleader;

    private String sellerId;

    private String officeId;

    private String negotiator;

    private String customerservicerep;

    private String customerserviceleader;

    private String technologist;

    private String constructionmanager;

    private String contractlevel;

    private BigDecimal price;

    private BigDecimal discount;

    private String isneedtrain;

    private String trainingmode;

    private Long trainingdate;
    
    private String customerSource2Name;

    public String getCustomersourceName() {
		return customersourceName;
	}

	public void setCustomersourceName(String customersourceName) {
		this.customersourceName = customersourceName;
	}

	private String isneedselectsite;

    private String selectsitemanager;

    private String isneedmanageshop;

    private String shopmanager;

    private String discountsId;

    private String remarks;

    private String ownerId;

    private String createBy;

    private Date createDate;

    private String updateBy;

    private Date updateDate;

    private String delFlag;

    private String customersource2;

    private Date selectionDate;

    private Date assignCustomerDate;

    private String isfullpayment;

    private String wechat;

    private String sourceproject;

    private String tibaoren;

    private String clienttype;

    private Date yutime;

    private String gotstatus;

    private String invalidcause;

    private String fbStuars;

    private Date cometime;

    private Date chengtime;

    private String eliteteam;

    private String division;
    
    private String createName;
    private String updateName;
   

    public String getId() {
    	if(StringUtils.isEmpty(id)){
    		id=UUID.randomUUID().toString().replace("-", "");
    	}
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getCustomername() {
        return customername;
    }

    public void setCustomername(String customername) {
        this.customername = customername == null ? null : customername.trim();
    }

   

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getCustomertype() {
        return customertype;
    }

    public void setCustomertype(String customertype) {
        this.customertype = customertype == null ? null : customertype.trim();
    }

    public String getAttitude() {
        return attitude;
    }

    public void setAttitude(String attitude) {
        this.attitude = attitude == null ? null : attitude.trim();
    }

    public String getProvinceId() {
        return provinceId;
    }

    public void setProvinceId(String provinceId) {
        this.provinceId = provinceId == null ? null : provinceId.trim();
    }

    public String getCityId() {
        return cityId;
    }

    public void setCityId(String cityId) {
        this.cityId = cityId == null ? null : cityId.trim();
    }

    public String getAreaId() {
        return areaId;
    }

    public void setAreaId(String areaId) {
        this.areaId = areaId == null ? null : areaId.trim();
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public String getProject() {
        return project;
    }

    public void setProject(String project) {
        this.project = project == null ? null : project.trim();
    }

    public String getCustomersource() {
        return customersource;
    }

    public void setCustomersource(String customersource) {
        this.customersource = customersource == null ? null : customersource.trim();
    }

    public Date getInDate() {
        return inDate;
    }

    public void setInDate(Date inDate) {
        this.inDate = inDate;
    }

    public Date getFirstcontacttime() {
        return firstcontacttime;
    }

    public void setFirstcontacttime(Date firstcontacttime) {
        this.firstcontacttime = firstcontacttime;
    }

    public Date getLastcontacttime() {
        return lastcontacttime;
    }

    public void setLastcontacttime(Date lastcontacttime) {
        this.lastcontacttime = lastcontacttime;
    }

    public String getCustomerlevel() {
        return customerlevel;
    }

    public void setCustomerlevel(String customerlevel) {
        this.customerlevel = customerlevel == null ? null : customerlevel.trim();
    }

    public String getIdnumber() {
        return idnumber;
    }

    public void setIdnumber(String idnumber) {
        this.idnumber = idnumber == null ? null : idnumber.trim();
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public String getTeamId() {
        return teamId;
    }

    public void setTeamId(String teamId) {
        this.teamId = teamId == null ? null : teamId.trim();
    }

    public String getTeamleader() {
        return teamleader;
    }

    public void setTeamleader(String teamleader) {
        this.teamleader = teamleader == null ? null : teamleader.trim();
    }

    public String getSellerId() {
        return sellerId;
    }

    public void setSellerId(String sellerId) {
        this.sellerId = sellerId == null ? null : sellerId.trim();
    }

    public String getOfficeId() {
        return officeId;
    }

    public void setOfficeId(String officeId) {
        this.officeId = officeId == null ? null : officeId.trim();
    }

    public String getNegotiator() {
        return negotiator;
    }

    public void setNegotiator(String negotiator) {
        this.negotiator = negotiator == null ? null : negotiator.trim();
    }

    public String getCustomerservicerep() {
        return customerservicerep;
    }

    public void setCustomerservicerep(String customerservicerep) {
        this.customerservicerep = customerservicerep == null ? null : customerservicerep.trim();
    }

    public String getCustomerserviceleader() {
        return customerserviceleader;
    }

    public void setCustomerserviceleader(String customerserviceleader) {
        this.customerserviceleader = customerserviceleader == null ? null : customerserviceleader.trim();
    }

    public String getTechnologist() {
        return technologist;
    }

    public void setTechnologist(String technologist) {
        this.technologist = technologist == null ? null : technologist.trim();
    }

    public String getConstructionmanager() {
        return constructionmanager;
    }

    public void setConstructionmanager(String constructionmanager) {
        this.constructionmanager = constructionmanager == null ? null : constructionmanager.trim();
    }

    public String getContractlevel() {
        return contractlevel;
    }

    public void setContractlevel(String contractlevel) {
        this.contractlevel = contractlevel == null ? null : contractlevel.trim();
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public BigDecimal getDiscount() {
        return discount;
    }

    public void setDiscount(BigDecimal discount) {
        this.discount = discount;
    }

    public String getIsneedtrain() {
        return isneedtrain;
    }

    public void setIsneedtrain(String isneedtrain) {
        this.isneedtrain = isneedtrain == null ? null : isneedtrain.trim();
    }

    public String getTrainingmode() {
        return trainingmode;
    }

    public void setTrainingmode(String trainingmode) {
        this.trainingmode = trainingmode == null ? null : trainingmode.trim();
    }

    public Long getTrainingdate() {
        return trainingdate;
    }

    public void setTrainingdate(Long trainingdate) {
        this.trainingdate = trainingdate;
    }

    public String getIsneedselectsite() {
        return isneedselectsite;
    }

    public void setIsneedselectsite(String isneedselectsite) {
        this.isneedselectsite = isneedselectsite == null ? null : isneedselectsite.trim();
    }

    public String getSelectsitemanager() {
        return selectsitemanager;
    }

    public void setSelectsitemanager(String selectsitemanager) {
        this.selectsitemanager = selectsitemanager == null ? null : selectsitemanager.trim();
    }

    public String getIsneedmanageshop() {
        return isneedmanageshop;
    }

    public void setIsneedmanageshop(String isneedmanageshop) {
        this.isneedmanageshop = isneedmanageshop == null ? null : isneedmanageshop.trim();
    }

    public String getShopmanager() {
        return shopmanager;
    }

    public void setShopmanager(String shopmanager) {
        this.shopmanager = shopmanager == null ? null : shopmanager.trim();
    }

    public String getDiscountsId() {
        return discountsId;
    }

    public void setDiscountsId(String discountsId) {
        this.discountsId = discountsId == null ? null : discountsId.trim();
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks == null ? null : remarks.trim();
    }

    public String getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(String ownerId) {
        this.ownerId = ownerId == null ? null : ownerId.trim();
    }

    public String getCreateBy() {
        return createBy;
    }

    public void setCreateBy(String createBy) {
        this.createBy = createBy == null ? null : createBy.trim();
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public String getUpdateBy() {
        return updateBy;
    }

    public void setUpdateBy(String updateBy) {
        this.updateBy = updateBy == null ? null : updateBy.trim();
    }

    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    public String getDelFlag() {
        return delFlag;
    }

    public void setDelFlag(String delFlag) {
        this.delFlag = delFlag == null ? null : delFlag.trim();
    }

    public String getCustomersource2() {
        return customersource2;
    }

    public void setCustomersource2(String customersource2) {
        this.customersource2 = customersource2 == null ? null : customersource2.trim();
    }

    public Date getSelectionDate() {
        return selectionDate;
    }

    public void setSelectionDate(Date selectionDate) {
        this.selectionDate = selectionDate;
    }

    public Date getAssignCustomerDate() {
        return assignCustomerDate;
    }

    public void setAssignCustomerDate(Date assignCustomerDate) {
        this.assignCustomerDate = assignCustomerDate;
    }

    public String getIsfullpayment() {
        return isfullpayment;
    }

    public void setIsfullpayment(String isfullpayment) {
        this.isfullpayment = isfullpayment == null ? null : isfullpayment.trim();
    }

    public String getWechat() {
        return wechat;
    }

    public void setWechat(String wechat) {
        this.wechat = wechat == null ? null : wechat.trim();
    }

    public String getSourceproject() {
        return sourceproject;
    }

    public void setSourceproject(String sourceproject) {
        this.sourceproject = sourceproject == null ? null : sourceproject.trim();
    }

    public String getTibaoren() {
        return tibaoren;
    }

    public void setTibaoren(String tibaoren) {
        this.tibaoren = tibaoren == null ? null : tibaoren.trim();
    }

    public String getClienttype() {
        return clienttype;
    }

    public void setClienttype(String clienttype) {
        this.clienttype = clienttype == null ? null : clienttype.trim();
    }

    public Date getYutime() {
        return yutime;
    }

    public void setYutime(Date yutime) {
        this.yutime = yutime;
    }

    public String getGotstatus() {
        return gotstatus;
    }

    public void setGotstatus(String gotstatus) {
        this.gotstatus = gotstatus == null ? null : gotstatus.trim();
    }

    public String getInvalidcause() {
        return invalidcause;
    }

    public void setInvalidcause(String invalidcause) {
        this.invalidcause = invalidcause == null ? null : invalidcause.trim();
    }

    public String getFbStuars() {
        return fbStuars;
    }

    public void setFbStuars(String fbStuars) {
        this.fbStuars = fbStuars == null ? null : fbStuars.trim();
    }

    public Date getCometime() {
        return cometime;
    }

    public void setCometime(Date cometime) {
        this.cometime = cometime;
    }

    public Date getChengtime() {
        return chengtime;
    }

    public void setChengtime(Date chengtime) {
        this.chengtime = chengtime;
    }

    public String getEliteteam() {
        return eliteteam;
    }

    public void setEliteteam(String eliteteam) {
        this.eliteteam = eliteteam == null ? null : eliteteam.trim();
    }

    public String getDivision() {
        return division;
    }

    public void setDivision(String division) {
        this.division = division == null ? null : division.trim();
    }

	public char getSex() {
		return sex;
	}

	public void setSex(char sex) {
		this.sex = sex;
	}

	public String getCreateName() {
		return createName;
	}

	public void setCreateName(String createName) {
		this.createName = createName;
	}

	public String getUpdateName() {
		return updateName;
	}

	public void setUpdateName(String updateName) {
		this.updateName = updateName;
	}

	public String getCustomerSource2Name() {
		return customerSource2Name;
	}

	public void setCustomerSource2Name(String customerSource2Name) {
		this.customerSource2Name = customerSource2Name;
	}

    
}