package com.example.demo.entity;
//会员实体类
public class Member {
    private Integer mid;//会员号
    private String name;//姓名
    private long phone;//电话号码
    private int score;//积分

    public Integer getMid() {
        return mid;
    }//读取会员号
    public void setMid(Integer mid) {
        this.mid = mid;
    }//修改会员号

    public String getName() {   return this.name;}//读取会员姓名
    public void setName(String name) { this.name=name;}//修改会员姓名

    public long getPhone() {   return this.phone;}//读取电话号
    public void setPhone(long phone) {   this.phone=phone;}//修改会员号

    public int getScore() {   return this.score;}//读取积分
    public void setScore(int score) {   this.score=score;}//修改积分
}
