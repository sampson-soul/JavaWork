package part211;

public class Course {
	String cName, cNo, cAcademy;
	String getcName(){
		return cName;
	}
	void setcName(String cName){
		this.cName = cName;
	}
	String getcNo(){
		return cNo;
	}
	void setcNo(String cNo){
		this.cNo = cNo;
	}
	String getcAcademy(){
		return cAcademy;
	}
	void setcAcademy(String cAcademy){
		this.cAcademy = cAcademy;
	}
	public static void main(String [] args){
		Course course1 = new Course();
		Course course2 = new Course();
		
		course1.setcName("Java�������");
		course1.setcNo("594013");
		course1.setcAcademy("�������ѧѧԺ");
		
		course2.setcName("���������");
		course2.setcNo("593615");
		course2.setcAcademy("�������ѧѧԺ");
		
		System.out.println("The course informatiom:");
		System.out.println("The first course:" + course1.getcName() + "\t" + course1.getcNo() + "\t" + course1.getcAcademy());
		System.out.println("The second course:" + course2.getcName() + "\t" + course2.getcNo() + "\t" + course2.getcAcademy());
	}
}
