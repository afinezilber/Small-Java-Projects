 /* Allon Finezilber
   CSC-162
   Lab 1D*/

public class CourseGradeDemo
{
   public static void main(String args[])
   {
	   GradedActivity lab = new GradedActivity();
	   Essay scores = new Essay();
	   FinalExam grade = new FinalExam(50, 10, 0);
	   PassFailExam exam = new PassFailExam(20, 3, 70);
	   CourseGrade courseGrades = new CourseGrade();
	   scores.setScore(25, 18, 17, 20);
	   lab.setScore(85);

	   courseGrades.setLab(lab);
	   courseGrades.setPassFailExam(exam);
	   courseGrades.setEssay(scores);
	   courseGrades.setFinalExam(grade);

	   System.out.println(courseGrades);



   }
}