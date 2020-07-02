package com.example.demo.service.impl;

import com.example.demo.dao.MemberDAO;
import com.example.demo.entity.Member;
import com.example.demo.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

public class MemberServiceimpl implements MemberService{
    @Autowired
    private MemberDAO memberDAO;

    @Override
    public List<Member> getAllMember(){
        return memberDAO.getAllMember();
    }

    @Override
    public boolean insert(Member member) {
        if (null == member){
            return false;
        }
        // do something...
        memberDAO.insert(member);
        return true;
    }

    @Override
    public boolean updateScore(Integer mid, Integer corse) {
        if ( null == mid || null  == corse){
            return false;
        }
        // do something...
        memberDAO.updateScore(mid,corse);
        return true;
    }

}
