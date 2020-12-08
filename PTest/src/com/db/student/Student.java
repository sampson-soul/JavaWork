package com.db.student;

import java.util.HashSet;
import java.util.Set;

public class Student {
	private int id;
	private String name;
	private String sex;
	private String date;
	
	public Student() {
		id = 0;
		name = "δ֪";
		sex = "δ֪";
		date = "00000000";
	}

	public Student (int Id, String Name, String Sex, String d) {
		id = Id;
		name = Name;
		sex = Sex;
		date = d;
	}
	
	//����object���������
	public String toString() {
		return "ѧ�ţ�"+id +" ������"+ name+" �Ա�"+sex+" ���գ�"+date;
	}
	
	public static void main(String[] args) {
		Student stu = new Student();
		System.out.println(stu);
		Set<Student> setStu = new HashSet<Student>();
		setStu.add(stu);
		System.out.println(setStu.size());
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
}

class Graduate extends Student{
	private String subject;
	private String adviser;
	
	public Graduate() {
		super();
		subject = "רҵδ��";
		adviser = "��ʦδ��";
	}
	public Graduate(int Id, String Name, String Sex, String d,
			String sub, String adv) {
		super();
		subject = sub;
		adviser = adv;
	}
	public String toString() {
		return super.toString()+"רҵ��"+subject+" ��ʦ��"+adviser;
	}
}
