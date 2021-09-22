package com.padwan.test.service;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class VitorService {

    public List<String> skills(){

        List<String> skills = new ArrayList<>();
        skills.add("Aprender coisas novas todos os dias");
        skills.add("Conhecer um pouco de java");
        skills.add("Alta curva de aprendizado");
        return skills;

    }

}
