package com.example.demo.service;

import com.example.demo.entity.Member;

import java.util.List;

public interface MemberService {
    List<Member> getAllMember();

    boolean insert(Member member);

    boolean updateScore(Integer mid,Integer corse);

}
