package pk.edu.nust.seecs.gradebook;

import java.util.Iterator;
import pk.edu.nust.seecs.gradebook.Bo.bo;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import pk.edu.nust.seecs.gradebook.dao.CloDao;
import pk.edu.nust.seecs.gradebook.entity.Clo;
import pk.edu.nust.seecs.gradebook.entity.Content;
import pk.edu.nust.seecs.gradebook.entity.Course;
import pk.edu.nust.seecs.gradebook.entity.Grade;
import pk.edu.nust.seecs.gradebook.entity.Student;
import pk.edu.nust.seecs.gradebook.entity.Teacher;


public class App {

    public static void main(String[] args) {
        Resource r = new ClassPathResource("Context.xml");
        BeanFactory factory = new XmlBeanFactory(r);
             
        

        bo bo = (bo) factory.getBean("bo");

        int c = bo.addCourse("SC", 4);
        int t = bo.setCourseTeacher(c, "Fahad Satti");
        int s = bo.setCourseStudent(c, "Shoaib");
        int s1 = bo.setCourseStudent(c, "Hamza");
        int s2 = bo.setCourseStudent(c, "Umair");
        int s3 = bo.setCourseStudent(c, "Faizan");
        int s4 = bo.setCourseStudent(c, "Saad");
        
        
        
       

        Course co = bo.getCourse(c);
        System.out.print(co.getClasstitle());
        System.out.println(" (" + co.getCreditHours() + " credit hrs)");
        System.out.println("Teacher: " + co.getTeacher().getName() + "\nStudents:");
        Student student;
        for (Iterator<Student> it = co.getStudents().iterator(); it.hasNext();) {
           
            student = it.next();
            System.out.println("\t" + student.getName());
        }

        bo.update();
       
    }

}