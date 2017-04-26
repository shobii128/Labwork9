package pk.edu.nust.seecs.gradebook.entity;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Grade.class)
public abstract class Grade_ {

	public static volatile SingularAttribute<Grade, Integer> score;
	public static volatile SingularAttribute<Grade, Integer> gradeId;
	public static volatile SingularAttribute<Grade, Content> contentItem;
	public static volatile SingularAttribute<Grade, String> name;

}

