package com.example.demospringboot7PM.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class ArmstrongController {
@RequestMapping("/armstrong")
    public String armstrong(){

        int num =370,temp,digit,res=0;

         temp=num;

         String result="";

         while(num>0) {

             digit = num % 10;

             res = res+ digit * digit * digit;

             num = num / 10;
         }
         if(temp==res){

            result= temp+"is Armstrong Number";
         }
         else{

             result=temp+"not a Armstrong Number";
        }
         return result;
    }












}
