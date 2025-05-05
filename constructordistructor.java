package JAVACOnstructor;


class student{
	
	int sID;
	String Sname;
	int Marks;
	String classname;
	
	student(int x,int y,String Z,String a) {
		sID=x;
	   Marks=y;
	   Sname=Z;
	    classname=a;
	}
	
	
	student (student sk){
		sID=sk.sID;
		   Marks=sk.Marks;
		   Sname=sk.Sname;
		    classname=sk. classname;
	}
	
	void Display() {
		System.out.println("Show Student detail" );
		System.out.println(sID);
		System.out.println(Marks);
		System.out.println(Sname);
		System.out.println(classname);
	}
}






public class Conjava {

	public static void main(String[] args) {
		
		student a1=new student(101,88,"rushi","Rose");
		a1.Display();
		
	    student s1 =new student(a1);
	    
		System.out.println("Show Student detail"+s1 );
		
	}

}
