package org.mykanna.school.entity;

public class UserWithBLOBs extends User {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_user.user_refuse_reason
     *
     * @mbg.generated Wed Feb 21 15:57:48 CST 2018
     */
    private String userRefuseReason;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_user.cas_cached
     *
     * @mbg.generated Wed Feb 21 15:57:48 CST 2018
     */
    private String casCached;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_user.remark
     *
     * @mbg.generated Wed Feb 21 15:57:48 CST 2018
     */
    private String remark;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_user.user_refuse_reason
     *
     * @return the value of tb_user.user_refuse_reason
     *
     * @mbg.generated Wed Feb 21 15:57:48 CST 2018
     */
    public String getUserRefuseReason() {
        return userRefuseReason;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_user.user_refuse_reason
     *
     * @param userRefuseReason the value for tb_user.user_refuse_reason
     *
     * @mbg.generated Wed Feb 21 15:57:48 CST 2018
     */
    public void setUserRefuseReason(String userRefuseReason) {
        this.userRefuseReason = userRefuseReason;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_user.cas_cached
     *
     * @return the value of tb_user.cas_cached
     *
     * @mbg.generated Wed Feb 21 15:57:48 CST 2018
     */
    public String getCasCached() {
        return casCached;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_user.cas_cached
     *
     * @param casCached the value for tb_user.cas_cached
     *
     * @mbg.generated Wed Feb 21 15:57:48 CST 2018
     */
    public void setCasCached(String casCached) {
        this.casCached = casCached;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_user.remark
     *
     * @return the value of tb_user.remark
     *
     * @mbg.generated Wed Feb 21 15:57:48 CST 2018
     */
    public String getRemark() {
        return remark;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_user.remark
     *
     * @param remark the value for tb_user.remark
     *
     * @mbg.generated Wed Feb 21 15:57:48 CST 2018
     */
    public void setRemark(String remark) {
        this.remark = remark;
    }
}