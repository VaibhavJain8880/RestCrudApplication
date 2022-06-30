package in.vaibhav.rest.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Employee {

	private Integer emoId;
	private String empName;
	private Double empSal;
	public Employee(Integer emoId, String empName, Double empSal) {
		super();
		this.emoId = emoId;
		this.empName = empName;
		this.empSal = empSal;
	}
	public Integer getEmoId() {
		return emoId;
	}
	public void setEmoId(Integer emoId) {
		this.emoId = emoId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public Double getEmpSal() {
		return empSal;
	}
	public void setEmpSal(Double empSal) {
		this.empSal = empSal;
	}
	
	
}
