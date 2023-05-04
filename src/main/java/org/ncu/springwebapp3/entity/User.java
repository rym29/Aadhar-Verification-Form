package org.ncu.springwebapp3.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.validation.constraints.Digits;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.ncu.springwebapp3.validator.CourseCode;
import org.springframework.format.annotation.DateTimeFormat;

public class User {
	@NotNull(message = "field can't be empty")
	@Size(min = 2, max = 30, message = "is required")
	@Pattern(regexp = "^[a-zA-Z]+$", message = "only letter allowed, No special characters allowed")
	private String username;
	@NotNull(message = "is required")
	@Pattern(regexp = "^[a-zA-Z0-9@$#&]+$", message = "only letter/char/digit allowed")
	private String userPass;
	@NotNull(message = "is required")
	@Pattern(regexp = "^[a-zA-Z0-9@$#&]+$", message = "only letter/char/digit allowed")
	private String userCPass;
	@CourseCode
	private String course;
	private String other;
	@Email(message = "invalid email")
	@NotEmpty(message = "is required")
	private String emailId;
	@Digits(integer = 12 , fraction = 0 , message = "is required")
	@Size(min = 12 , max = 12)

	private String aadharId;
	@NotEmpty(message = "is required")
	private String gender;
	@NotEmpty(message = "field cant be empty")
	private List<String> otherOptions;
	private List<String> courseOptions;
	@NotEmpty(message = "Address Can't be empty")
	@Size(max = 50)
	private String address;
	
	private String state;
	private String tutor;
	@Size(min = 10 , max = 10)
	@Digits(integer = 10 , fraction = 0 , message = "is required")
	private String phone;

	private Map<String, String> stateOptions;
	private Map<String, String> tutorOptions;
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	@Past
	@NotNull(message = "is required")

	private Date date;

	public User() {

//		added values of otherOptions
		courseOptions = new ArrayList<>();
		courseOptions.add("JAVA");
		courseOptions.add("C/C++");
		courseOptions.add("PYTHON");
		courseOptions.add("JAVA_SCRIPT");

//		added values of otherOptions
		otherOptions = new ArrayList<>();
		otherOptions.add("PAN");
		otherOptions.add("VOTERID");
		otherOptions.add("DRIVING LISCENCE");
		otherOptions.add("EMPLOYEEID");

//		added values of stateOptions
		stateOptions = new HashMap<>();

		stateOptions.put("HR", "Harayana");

		stateOptions.put("PB", "Punjab");

		stateOptions.put("DL", "Delhi");

		stateOptions.put("UP", "Uttar Pradesh");

		stateOptions.put("KR", "Karnataka");

		stateOptions.put("TN", "Tamil Nadu");

//		added values of tutorOptions
		tutorOptions = new HashMap<>();

		tutorOptions.put("SK", "Sumit Sir");

		tutorOptions.put("SS", "Sandeep Sir");

	}

	public String getTutor() {
		return tutor;
	}

	public void setTutor(String tutor) {
		this.tutor = tutor;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getUserPass() {
		return userPass;
	}

	public void setUserPass(String userPass) {
		this.userPass = userPass;
	}

	public String getAadharId() {
		return aadharId;
	}

	public void setAadharId(String aadharId) {
		this.aadharId = aadharId;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public List<String> getOtherOptions() {
		return otherOptions;
	}

	public void setOtherOptions(List<String> otherOptions) {
		this.otherOptions = otherOptions;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Map<String, String> getStateOptions() {
		return stateOptions;
	}

	public void setStateOptions(Map<String, String> stateOptions) {
		this.stateOptions = stateOptions;
	}

	public String getUserCPass() {
		return userCPass;
	}

	public void setUserCPass(String userCPass) {
		this.userCPass = userCPass;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public List<String> getCourseOptions() {
		return courseOptions;
	}

	public void setCourseOptions(List<String> courseOptions) {
		this.courseOptions = courseOptions;
	}

	public Map<String, String> getTutorOptions() {
		return tutorOptions;
	}

	public void setTutorOptions(Map<String, String> tutorOptions) {
		this.tutorOptions = tutorOptions;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public String getOther() {
		return other;
	}

	public void setOther(String other) {
		this.other = other;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	@Override
	public String toString() {
		return "User [userPass=" + userPass + ", userCPass=" + userCPass + ", course=" + course + ", other=" + other
				+ ", emailId=" + emailId + ", aadharId=" + aadharId + ", gender=" + gender + ", otherOptions="
				+ otherOptions + ", courseOptions=" + courseOptions + ", address=" + address + ", username=" + username
				+ ", state=" + state + ", tutor=" + tutor + ", phone=" + phone + ", stateOptions=" + stateOptions
				+ ", tutorOptions=" + tutorOptions + ", date=" + date + "]";
	}

}
