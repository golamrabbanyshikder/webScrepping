package com.javaclass.AmazonDataColle.controller;

import com.javaclass.AmazonDataColle.data.AmazonModel;
import com.javaclass.AmazonDataColle.service.AmazonServ;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class AppController {
//	static Logger log = Logger.getLogger(AppController.class.getName());

	public void AppRun() {
		log.info("Hello");		
		
		AmazonServ amazonServ = new AmazonServ();
		amazonServ.getDataFromAmazon();		
	}
	
}
