package shiyanlou.struts.form.vali;

public class User {
	
	private String name;
	
	private int age;
	
	private String password;
	
	private String email;
	
	private String confirmPassword;
	
	private String mobile;

	public String getConfirmPassword() {
		return confirmPassword;
	}

	public void setConfirmPassword(String confirmPassword) {
		this.confirmPassword = confirmPassword;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "User [name=" + name + ", age=" + age + ", password=" + password + ", email=" + email
				+ ", confirmPassword=" + confirmPassword + ", mobile=" + mobile + "]";
	}
	
	
	
}
