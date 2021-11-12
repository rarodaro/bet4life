package com.bet4life.thymeleafapp;

import java.sql.Date;
import java.sql.Time;

//import java.util.Objects;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "offer")
public class Pair {
	
	@Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private int Id;
	
  private Date dat;
  private Time tim;
  private String home;
  private String away;
  private float type1;
  private float typex;
  private float type2;
  private float type1x;
  private float type2x;
  
  public Pair() {
  }

  public Pair(int id, Date dat, Time tim, String home, String away, float type1, float typex, float type2, float type1x, float type2x) {
	  super();
      Id = id;
      this.dat = dat;
      this.tim = tim;
      this.home = home;
      this.away = away;
      this.type1 = type1;
      this.typex = typex;
      this.type2 = type2;
      this.type1x = type1x;
      this.type2x = type2x;
  }
  
  public Integer getId() {
		return Id;
	}

	public void setId(Integer id) {
		Id = id;
	}
  
  public Date getDat() {
	  return dat;
  }

  public void setDat(Date dat) {
	  this.dat = dat;
  }
  public Time getTim() {
	  return tim;
  }

  public void setTim(Time tim) {
	  this.tim = tim;
  }
  public String getHome() {
  	return home;
   }

   public void setHome(String home) {
  	 this.home = home;
   }

  public String getAway() {
      return away;
  }

  public void setAway(String away) {
 	 this.away = away;
  }
  
  public float getType1() {
      return type1;
  }

  public void setType1(float type1) {
      this.type1 = type1;
  }

  public float getTypex() {
      return typex;
  }

  public void setTypex(float typex) {
      this.typex = typex;
  }
  
  public float getType2() {
      return type2;
  }

  public void setType2(float type2) {
      this.type2 = type2;
  }
  public float getType1x() {
      return type1x;
  }

  public void setType1x(float type1x) {
      this.type1x = type1x;
  }
  public float getType2x() {
      return type2x;
  }

  public void setType2x(float type2x) {
      this.type2x = type2x;
  }
  
  @Override
  public String toString() {
      final StringBuilder sb = new StringBuilder("");
      sb.append(dat);
      sb.append("/").append(tim);
      sb.append(" ").append(home);
      sb.append(" - ").append(away);
      sb.append("   ").append(type1);
      sb.append(" ").append(typex);
      sb.append(" ").append(type2);
      sb.append(" ").append(type1x);
      sb.append(" ").append(type2x);
      return sb.toString();
  }
}