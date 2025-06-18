package com.example.api.model;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class NumberEntry {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) // Auto-incremental ID
	private Long id;
	
    private Integer num1;
    private Integer num2;
    private Integer num3;
    private Integer num4;
    private Integer num5;
    private Integer star1;
    private Integer star2;
	private Date entryDate;

	
	// Constructors
    public NumberEntry() {
    }
	

    // Constructor 
    public NumberEntry(int num1, int num2, int num3, int num4, int num5, int star1, int star2, Date entryDate) {
        this.num1 = num1;
        this.num2 = num2;
        this.num3 = num3;
        this.num4 = num4;
        this.num5 = num5;
        this.star1 = star1;
        this.star2 = star2;
        this.entryDate = entryDate;
    }
	
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public int getNum1() {
		return num1;
	}

	public void setNum1(int num1) {
		this.num1 = num1;
	}

	public int getNum2() {
		return num2;
	}

	public void setNum2(int num2) {
		this.num2 = num2;
	}

	public int getNum3() {
		return num3;
	}

	public void setNum3(int num3) {
		this.num3 = num3;
	}

	public int getNum4() {
		return num4;
	}

	public void setNum4(int num4) {
		this.num4 = num4;
	}

	public int getNum5() {
		return num5;
	}

	public void setNum5(int num5) {
		this.num5 = num5;
	}

	public int getStar1() {
		return star1;
	}

	public void setStar1(int star1) {
		this.star1 = star1;
	}

	public int getStar2() {
		return star2;
	}

	public void setStar2(int star2) {
		this.star2 = star2;
	}

	public Date getDate() {
		return entryDate;
	}

	public void setDate(Date date) {
		this.entryDate = date;
	}
	
	
	
	
	
}
