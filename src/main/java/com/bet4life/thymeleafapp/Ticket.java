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
@Table(name = "ticket")
public class Ticket {
	
	@Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private int Id;
	
  private Date dat;
  private Time tim;
  private String home;
  private String away;
  private String type;
  private float quote;
  
  public Ticket() {
  }

  public Ticket(int id, Date dat, Time tim, String home, String away, String type, float quote) {
	  super();
      Id = id;
      this.dat = dat;
      this.tim = tim;
      this.home = home;
      this.away = away;
      this.type = type;
      this.quote = quote;
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
  
  public String getType() {
      return type;
  }

  public void setType(String type) {
      this.type = type;
  }

  public float getQuote() {
      return quote;
  }

  public void setQuote(float quote) {
      this.quote = quote;
  }
  
  @Override
  public String toString() {
      final StringBuilder sb = new StringBuilder("");
      sb.append(dat);
      sb.append("/").append(tim);
      sb.append(" ").append(home);
      sb.append(" - ").append(away);
      sb.append("   ").append(type);
      sb.append(" ").append(quote);
      return sb.toString();
  }
}