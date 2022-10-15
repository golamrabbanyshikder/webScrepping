package com.javaclass.AmazonDataColle.data;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AmazonModel {

	private Float curt_prd_price = 0f;
	private Float prev_prd_price = 0f;
	private String prd_name;
	private Boolean isShip;
	private String imgUrl; // imgPath
	private String prdColor;
}
