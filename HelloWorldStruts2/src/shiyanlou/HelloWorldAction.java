package shiyanlou;

public class HelloWorldAction {

	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public String excute(){
		if("".equals(getName()) || getName() == null){
			return "error";
		}
		
		return "success";
	}
	
}
