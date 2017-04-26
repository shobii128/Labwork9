package pk.edu.nust.seecs.gradebook.entity;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Course.class)
public abstract class Course_ {

	public static volatile SingularAttribute<Course, Integer> creditHours;
	public static volatile SingularAttribute<Course, Date> endsOn;
	public static volatile SingularAttribute<Course, Teacher> teacher;
	public static volatile SingularAttribute<Course, String> classtitle;
	public static volatile SetAttribute<Course, Content> contents;
	public static volatile SetAttribute<Course, Student> students;
	public static volatile SingularAttribute<Course, Integer> courseid;
	public static volatile SingularAttribute<Course, Date> startsOn;

}

