package ch10_exam;

public class Student {
	private int sno;
	private String name;
	private String major;
	private int[] score; // 과목 3개 점수들
	private String[] grade; // 과목 3개
	private double[] point; // 학점
//	private int java;
//	private int db;
//	private int python;
	private double avg; // 과목별 점수 평균
	private int rank = 1; // 순위
	private String adv; // 장학금 여부
	
	public Student() {}
	public Student(String name, int sno, String major, int[] score) {
		super();
		this.sno = sno;
		this.name = name;
		this.major = major;
		this.score = score; 
//		this.java = java;
//		this.db = db;
//		this.python = python;
		setAvg();
		setAdv();
		grade = new String[3];
		point = new double[3];
		setGrade();
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMajor() {
		return major;
	}
	public void setMajor(String major) {
		this.major = major;
	}
	public int[] getScore() {
		return score;
	}
	public void setScore(int[] score) {
		this.score = score;
	}
	public double getAvg() {
		return avg;
	}
	public void setAvg() {
		int sum = 0;
		for(int i=0; i<score.length; i++) {
			sum += score[i];
		}
		this.avg = Math.round((sum/3.0)*100)/100.0;
	}
	public int getSno() {
		return sno;
	}
	public void setSno(int sno) {
		this.sno = sno;
	}
	public void setRank(Student other) {
		if(this.avg < other.avg) {
			rank++;
		}
	}
	public int getRank() {
		return rank;
	}	
	public String getAdv() {
		return adv;
	}
	public void setAdv() {
		this.adv = this.avg>85?"장학금 지급":" ";
	}
	
	public String[] getGrade() {
		return grade;
	}
	public void setGrade() {
		for(int i=0; i<score.length; i++) {
			if(score[i] >= 95) {
				grade[i] = "A+"; 
				point[i] = 4.5;
			}
			else if(score[i] >= 90) {
				grade[i] = "A"; 
				point[i] = 4.0;
			}
			else if(score[i] >= 85) {
				grade[i] = "B+";
				point[i] = 3.5;
			}
			else if(score[i] >= 80) {
				grade[i] = "B"; 
				point[i] = 3.0;
			}
			else if(score[i] >= 75) {
				grade[i] = "C+"; 
				point[i] = 2.5;
			}
			else if(score[i] >= 70) {
				grade[i] = "C"; 
				point[i] = 2.0;
			}
			else {
				grade[i] = "F"; 
				point[i] = 0.0;
			}
		}
	}
	@Override
	public String toString() {
		String scoreStr = "";
		for(int i=0; i<score.length; i++) {
			scoreStr += score[i]+"\t";
		}
		return name + "\t" + sno + "\t" + major + "\t" + scoreStr 
				+ avg + "\t" + rank + "\t" + adv;
	}
	public void display() {
		String[] subject = {"자바","DB","파이썬"};
		System.out.println("이름:"+name);
		System.out.println("학번:"+sno);
		System.out.println("전공"+major);
		System.out.println("성적처리 결과");
		System.out.println(" \tscore\tgrade\t학점");
		double sum = 0.0;
		for(int i=0; i<score.length; i++) {
			System.out.println(subject[i]+"\t"+score[i]+"\t"+grade[i]+"\t"+point[i]);
			sum += point[i];
		}
		System.out.println("학점평균:"+Math.round((sum/3)*100)/100.0);
	}
}
