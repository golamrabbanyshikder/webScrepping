package com.javaclass.AmazonDataColle.data;

public class SampleModel {

	Integer num1;
	Integer num2;

	/**
	 * @return the num1
	 */
	public Integer getNum1() {
		return num1;
	}

	/**
	 * @param num1 the num1 to set
	 */
	public void setNum1(Integer num1) {
		this.num1 = num1;
	}

	/**
	 * @return the num2
	 */
	public Integer getNum2() {
		return num2;
	}

	/**
	 * @param num2 the num2 to set
	 */
	public void setNum2(Integer num2) {
		this.num2 = num2;
	}

	public Integer sum(Integer num1, Integer num2) {
		return num1 + num2;
	}

	public SampleModel addNum(Integer num1, Integer num2) {
		return new SampleModel(num1, num2);
	}

	public SampleModel() {
		// TODO Auto-generated constructor stub
	}

	public SampleModel(Integer num1, Integer num2) {
		this.num1 = num1;
		this.num2 = num2;
	}

}
