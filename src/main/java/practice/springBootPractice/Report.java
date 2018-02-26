package practice.springBootPractice;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "REPORT")
public class Report implements Serializable {

	@Id
	@Column(name = "FIRST")
	private String first;

	@Column(name = "SECOND")
	private String second;

	@Column(name = "THIRD")
	private String third;

	public Report() {

	}

	public String getFirst() {
		return first;
	}

	public void setFirst(String first) {
		this.first = first;
	}

	public String getSecond() {
		return second;
	}

	public void setSecond(String second) {
		this.second = second;
	}

	public String getThird() {
		return third;
	}

	public void setThird(String third) {
		this.third = third;
	}

}
