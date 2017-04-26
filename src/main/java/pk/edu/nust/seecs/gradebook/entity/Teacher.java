package pk.edu.nust.seecs.gradebook.entity;

import java.util.HashSet;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Entity;
import javax.persistence.Column;
import javax.persistence.OneToMany;
/**
 * A Teacher Entity. 
 * <p>
 This entity class holds the general attributes of a teacher. 
 Contained in this class are attributes that relate to a faculty member.
 */
@Entity
public class Teacher implements java.io.Serializable {

    @Id
    @GeneratedValue
    @Column(name = "teacher_id")
    private Integer teacherId;
    @Column
    private String name;
    
    /*
    * This relationship contains the courses assigned to this teacher.
    * The reverse relationship is present in the Teacher entity class
    */
    @OneToMany(cascade = {CascadeType.ALL})
    private Set<Course> Courses = new HashSet<>(0);
    /*
    * Class constructor.
    */
    public Teacher() {
    }
    /*
    * Class constructor that uses the name of the teacher to build this objext.
    */
    public Teacher(String name) {
        this.name = name;
    }
    /*
    * This method will return the id of this teacher.
    * Note; we have not defined any setter method for this teacher, since it is 
    * to be generated by the dbms.
    */
    public Integer getTeacherId() {
        return teacherId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Course> getCourses() {
        return Courses;
    }

    public void setCourses(Set<Course> Courses) {
        this.Courses = Courses;
}

    @Override
    public String toString() {
        return "Teacher{" + "teacherId=" + teacherId + ", name=" + name + ", Courses=" + Courses + '}';
    }

}
