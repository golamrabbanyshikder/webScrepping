package com.javaclass.AmazonDataColle.service;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import com.javaclass.AmazonDataColle.data.AmazonModel;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class AmazonServ {

	public void getDataFromAmazon() {
		String amzUrl = "https://www.amazon.com/s?i=specialty-aps&bbn=16225007011&rh=n%3A16225007011%2Cn%3A3011391011&ref=nav_em__nav_desktop_sa_intl_laptop_accessories_0_2_6_7";
		try {
			List<AmazonModel> lst = new ArrayList<>();
			Document doc = Jsoup.connect(amzUrl).get();
//			log.info(doc.title());
			Elements newsHeadlines = doc.select(".a-section.a-spacing-none");
			for (Element headline : newsHeadlines) {
				if (!headline.select(".a-section.a-spacing-none > div:nth-child(3) >div > a > span").text().isEmpty()) {
					AmazonModel amazonModel = new AmazonModel();
					amazonModel.setPrd_name(headline.select("div > h2 > a > span").text());
					String prdPrice = 
							headline.select(".a-section.a-spacing-none > div:nth-child(3) >div > a > span > span > span:nth-child(n+2) ").text().replaceAll("\\s", "");
					amazonModel.setCurt_prd_price(Float.valueOf(prdPrice));
					lst.add(amazonModel);
//				log.info(headline.text());
				}
			}
			for (AmazonModel element : lst) {
				log.info(element.toString());
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
