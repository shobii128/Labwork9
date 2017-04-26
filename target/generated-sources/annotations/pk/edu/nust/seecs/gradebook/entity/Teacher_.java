package pk.edu.nust.seecs.gradebook.entity;

import javax.annotation.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Teacher.class)
public abstract class Teacher_ {

	public static volatile SingularAttribute<Teacher, Integer> teacherId;
	public static volatile SingularAttribute<Teacher, String> name;
	public static volatile SetAttribute<Teacher, Course> Courses;

}

