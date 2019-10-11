package demo;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class ExampleBean {
	private String username;
	private int age;
	private List<String> interest;
	private Set<String> city;
	private Map<String,Double> score;
	private Properties jdbc ;
	public void setUsername(String username) {
		this.username = username;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void setInterest(List<String> interest) {
		this.interest = interest;
	}
	public void setCity(Set<String> city) {
		this.city = city;
	}
	public void setScore(Map<String, Double> score) {
		this.score = score;
	}
	public void setJdbc(Properties jdbc) {
		this.jdbc = jdbc;
	}
	@Override
	public String toString() {
		return "ExampleBean [username=" + username + ", age=" + age + ", interest=" + interest + ", city=" + city
				+ ", score=" + score + ", jdbc=" + jdbc + "]";
	}
	

}
