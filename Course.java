
public class Course{
	
	private String courseCode;
	
	private String courseTitle;
	
	private String course1;
	
	private String course2;

	public Course(String courseCode, String courseTitle, String course1, String course2) {
		setCourseCode(courseCode);
		setCourseTitle(courseTitle);
		setCourse1(course1);
		setCourse2(course2);
	}

	public void setCourseCode(String courseCode){
		
		this.courseCode=courseCode;
	}
	
	public void setCourseTitle(String courseTitle){
		
		this.courseTitle=courseTitle;
	}
	
	public void setCourse1(String course1){
		
		this.course1=course1;
	}
	public void setCourse2(String course2){
		
		this.course2=course2;
	}
	
	public String getCourseCode(){
		
		return courseCode;
	}
	public String getCourseTitle(){
		
		return courseTitle;
	}
	
	public String getCourse1(){
		
		return course1;
	}
	public String getCourse2(){
		
		return course2;
	}
	
	
	
	
	
}