package pk.edu.nust.seecs.gradebook.entity;

import javax.annotation.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Student.class)
public abstract class Student_ {

	public static volatile SingularAttribute<Student, Integer> studentId;
	public static volatile SingularAttribute<Student, String> name;
	public static volatile SetAttribute<Student, Course> Courses;

}

