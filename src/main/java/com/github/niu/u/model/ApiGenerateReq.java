package com.github.niu.u.model;


import org.hibernate.validator.constraints.NotBlank;

/**
 * @description: api请求的vo
 * @author: nxq email: niuxiangqian163@163.com
 * @createDate: 2020/12/24 11:56 上午
 * @updateUser: nxq email: niuxiangqian163@163.com
 * @updateDate: 2020/12/24 11:56 上午
 * @updateRemark:
 * @version: 1.0
 **/
public class ApiGenerateReq {


    @NotBlank(message = "ak不能为空")
   private  String ak ;
    @NotBlank(message = "sk不能为空")
   private  String sk ;
    @NotBlank(message = "url不能为空")
   private  String url;

   private Long valid;

    public String getAk() {
        return ak;
    }

    public void setAk(String ak) {
        this.ak = ak;
    }

    public String getSk() {
        return sk;
    }

    public void setSk(String sk) {
        this.sk = sk;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Long getValid() {
        return valid;
    }

    public void setValid(Long valid) {
        this.valid = valid;
    }
}
