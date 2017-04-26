package pk.edu.nust.seecs.gradebook.entity;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Content.class)
public abstract class Content_ {

	public static volatile ListAttribute<Content, Clo> clo;
	public static volatile SingularAttribute<Content, Integer> contentId;
	public static volatile SingularAttribute<Content, String> description;
	public static volatile SingularAttribute<Content, Date> endtime;
	public static volatile SetAttribute<Content, Student> students;
	public static volatile SingularAttribute<Content, Course> course;
	public static volatile SingularAttribute<Content, Date> starttime;
	public static volatile SetAttribute<Content, Grade> grades;
	public static volatile SingularAttribute<Content, String> title;

}

