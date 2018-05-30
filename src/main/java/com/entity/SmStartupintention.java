package com.entity;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.util.StringUtils;

public class SmStartupintention {
    private String id;

    private String name;

    private String customerId;

    private String source;

    private String project;

    private String movedreason;

    private String guesttype;

    private String otherguesttype;

    private String startupdate;

    private String budget;

    private String fundssource;

    private String startupreason;

    private String decisionmaker;

    private String hassetupresexp;

    private String hassetupexp;

    private String hasshop;

    private String detailswanttoknow;

    private String industry;

    private String industryexperience;

    private String customername;

    private String age;

    private String shoplocation;

    private String provinceId;

    private String cityId;

    private String areaId;

    private String phone;

    private String wechat;

    private String investigatedate;

    private String remarks;

    private String createBy;

    private Date createDate;

    private String updateBy;

    private Date updateDate;

    private String delFlag;
    
    private String otherProject;
    
    private String estimatedArea;
    
    private String isSupportIdea;
    
    private char gender;
    
    private String customerName;
   
    private String provinceName;
    
    private String cityName;
    
    private String areaName;
    
    private String sourceName;
    
    private String createByName;
    
    private String updateByName;

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

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId == null ? null : customerId.trim();
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source == null ? null : source.trim();
    }

    public String getProject() {
        return project;
    }

    public void setProject(String project) {
        this.project = project == null ? null : project.trim();
    }

    public String getMovedreason() {
        return movedreason;
    }

    public void setMovedreason(String movedreason) {
        this.movedreason = movedreason == null ? null : movedreason.trim();
    }

    public String getGuesttype() {
        return guesttype;
    }

    public void setGuesttype(String guesttype) {
        this.guesttype = guesttype == null ? null : guesttype.trim();
    }

    public String getOtherguesttype() {
        return otherguesttype;
    }

    public void setOtherguesttype(String otherguesttype) {
        this.otherguesttype = otherguesttype == null ? null : otherguesttype.trim();
    }

    public String getStartupdate() {
        return startupdate;
    }

    public void setStartupdate(String startupdate) {
        this.startupdate = startupdate == null ? null : startupdate.trim();
    }

    public String getBudget() {
        return budget;
    }

    public void setBudget(String budget) {
        this.budget = budget == null ? null : budget.trim();
    }

    public String getFundssource() {
        return fundssource;
    }

    public void setFundssource(String fundssource) {
        this.fundssource = fundssource == null ? null : fundssource.trim();
    }

    public String getStartupreason() {
        return startupreason;
    }

    public void setStartupreason(String startupreason) {
        this.startupreason = startupreason == null ? null : startupreason.trim();
    }

    public String getDecisionmaker() {
        return decisionmaker;
    }

    public void setDecisionmaker(String decisionmaker) {
        this.decisionmaker = decisionmaker == null ? null : decisionmaker.trim();
    }

    public String getHassetupresexp() {
        return hassetupresexp;
    }

    public void setHassetupresexp(String hassetupresexp) {
        this.hassetupresexp = hassetupresexp == null ? null : hassetupresexp.trim();
    }

    public String getHassetupexp() {
        return hassetupexp;
    }

    public void setHassetupexp(String hassetupexp) {
        this.hassetupexp = hassetupexp == null ? null : hassetupexp.trim();
    }

    public String getHasshop() {
        return hasshop;
    }

    public void setHasshop(String hasshop) {
        this.hasshop = hasshop == null ? null : hasshop.trim();
    }

    public String getDetailswanttoknow() {
        return detailswanttoknow;
    }

    public void setDetailswanttoknow(String detailswanttoknow) {
        this.detailswanttoknow = detailswanttoknow == null ? null : detailswanttoknow.trim();
    }

    public String getIndustry() {
        return industry;
    }

    public void setIndustry(String industry) {
        this.industry = industry == null ? null : industry.trim();
    }

    public String getIndustryexperience() {
        return industryexperience;
    }

    public void setIndustryexperience(String industryexperience) {
        this.industryexperience = industryexperience == null ? null : industryexperience.trim();
    }

    public String getCustomername() {
        return customername;
    }

    public void setCustomername(String customername) {
        this.customername = customername == null ? null : customername.trim();
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age == null ? null : age.trim();
    }

    public String getShoplocation() {
        return shoplocation;
    }

    public void setShoplocation(String shoplocation) {
        this.shoplocation = shoplocation == null ? null : shoplocation.trim();
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

    public String getWechat() {
        return wechat;
    }

    public void setWechat(String wechat) {
        this.wechat = wechat == null ? null : wechat.trim();
    }

    public Date getInvestigatedate() {
    String newdate=this.investigatedate;
    	Date date=null;
    	if(newdate!=null && !"".equals(newdate)){
		try {
			SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
			if(StringUtils.isEmpty(investigatedate)){
				return new Date();
			}
			date = sdf.parse(investigatedate);
		} catch (Exception e) {
			e.printStackTrace();
		}
    	}
        return date;
    }

    public void setInvestigatedate(String investigatedate) {
        this.investigatedate = investigatedate;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks == null ? null : remarks.trim();
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

	public String getOtherProject() {
		return otherProject;
	}

	public void setOtherProject(String otherProject) {
		this.otherProject = otherProject;
	}

	public String getEstimatedArea() {
		return estimatedArea;
	}

	public void setEstimatedArea(String estimatedArea) {
		this.estimatedArea = estimatedArea;
	}

	public String getIsSupportIdea() {
		return isSupportIdea;
	}

	public void setIsSupportIdea(String isSupportIdea) {
		this.isSupportIdea = isSupportIdea;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getProvinceName() {
		return provinceName;
	}

	public void setProvinceName(String provinceName) {
		this.provinceName = provinceName;
	}

	public String getCityName() {
		return cityName;
	}

	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

	public String getAreaName() {
		return areaName;
	}

	public void setAreaName(String areaName) {
		this.areaName = areaName;
	}

	public String getSourceName() {
		return sourceName;
	}

	public void setSourceName(String sourceName) {
		this.sourceName = sourceName;
	}

	public String getCreateByName() {
		return createByName;
	}

	public void setCreateByName(String createByName) {
		this.createByName = createByName;
	}

	public String getUpdateByName() {
		return updateByName;
	}

	public void setUpdateByName(String updateByName) {
		this.updateByName = updateByName;
	}


}