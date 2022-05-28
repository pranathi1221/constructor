class StudenT {
static int studentCount;
int id;
String name;
String gender;
int age;
long phone;
double gpa;
char degree;
boolean international;
double tuitionFees=12000.0;
double internationalFees=5000.0;

StudenT(int newId, String newName, String newGender, int newAge, long newPhone,
double newGpa, char newDegree){
this(newId, newName, newGender, newAge, newPhone, newGpa, newDegree, false);
} 

StudenT(int newId, String newName, String newGender, int newAge, long newPhone,
double newGpa, char newDegree, boolean isInternational){
id = newId;
name = newName;
gender = newGender;
age = newAge;
phone = newPhone;
gpa = newGpa;
degree = newDegree;
international = isInternational;
}
void compute(){
studentCount=studentCount+1;
int newId = id+1;
if(international){
tuitionFees=tuitionFees+internationalFees;
}
System.out.println("\nid:"+id);
/*System.out.println("nextId:"+nextId);*/
System.out.println("name:"+name);
System.out.println("gender:"+gender);
System.out.println("age:"+age);
System.out.println("phone:"+phone);
System.out.println("gpa:"+gpa);
System.out.println("degree:"+degree);
System.out.println("tuitionFees:"+tuitionFees);
System.out.println("studentCount:"+studentCount);
}
StudenT(){}
public static void main(String[] args){
StudenT student1 = new StudenT(1,"Jay","Male",19,1234567890,78,'A',false);
student1.compute();
StudenT student2 = new StudenT(1,"John","Male",18,1234567891,89,'A',true);
student2.compute();
StudenT student3 = new StudenT(1,"Jaya","Female",19,1234567892,58,'B',false);
student3.compute();
System.out.println("Student.studentCount:"+StudenT.studentCount);
}
}