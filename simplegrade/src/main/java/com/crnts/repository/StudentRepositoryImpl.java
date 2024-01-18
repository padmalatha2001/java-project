package com.crnts.repository;

import java.util.Iterator;
import java.util.List;
import java.util.Optional;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.annotations.NamedQueries;
import org.hibernate.annotations.NamedQuery;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.orm.hibernate5.SessionFactoryUtils;
import org.springframework.stereotype.Repository;

import com.crnts.entity.Student;
import com.crnts.entity.StudentCredentials;
@Repository

public class StudentRepositoryImpl implements StudentRepository{
     
	@Autowired
	HibernateTemplate template;
	@Autowired
	SessionFactory sessionFactory;
	
	@Override
	public Student save(Student student) {
		// TODO Auto-generated method stub
		 //template.save(student);
		Session session=sessionFactory.openSession();
		Transaction transaction=session.beginTransaction();
		session.save(student);
		transaction.commit();
		SessionFactoryUtils.closeSession(session);
		 return student;
		 
	}
	
	@Override
	public Student update(Student student) {
		// TODO Auto-generated method stub
		//template.update(student);
		Session session=sessionFactory.openSession();
		Transaction transaction=session.beginTransaction();
		session.update(student);
		transaction.commit();
		SessionFactoryUtils.closeSession(session);
		return student;
	}
	
	@Override
	public Optional<Student> get(int id) {
		// TODO Auto-generated method stub
	    
		//using Hibernate Template
		/*
		 * Student student= template.get(Student.class,id); return
		 * Optional.ofNullable(student);
		 */
		
		//using session
		/*
		 * Session session=sessionFactory.openSession(); Transaction
		 * transaction=session.beginTransaction(); Student
		 * student=session.get(Student.class,id); transaction.commit();
		 * SessionFactoryUtils.closeSession(session); return
		 * Optional.ofNullable(student);
		 */
		
		//using named Queries
		/*
		 * Session session=sessionFactory.openSession(); Query
		 * query=session.getNamedQuery("selectById"); query.setParameter("id",1);
		 * List<Student> list=query.getResultList(); return
		 * Optional.ofNullable(list.get(0));
		 */
		
		//using Criteria
		Session session=sessionFactory.openSession();
		Criteria criteria=session.createCriteria(Student.class);
		criteria.add(Restrictions.eq("id", id));
		Student student= (Student)criteria.list().get(0);
		return Optional.ofNullable(student);
	}
	
	@Override
	public List<Student> getAll() {
		// TODO Auto-generated method stub
		//using namedQueries
		//Session session=sessionFactory.openSession();
		//Query query=session.getNamedQuery("selectAll");
		//List<Student> list=query.getResultList();
		//Iterator iterator=list.iterator();
		//System.out.println("-----------------------");
		//while(iterator.hasNext())
		//{
			//System.out.println(iterator.next());
		//}
		//System.out.println("-----------------------");
		//return list;
		
		
		//using session
		//Session session=sessionFactory.openSession();
		//Transaction transaction=session.beginTransaction();
		//Criteria criteria=session.createCriteria(Student.class);
		//return criteria.list();
		
	     //using HiberanateTemplate
		 //return template.loadAll(Student.class);
		
		
		//using CriteriaBuilder
		Session session=sessionFactory.openSession();
		CriteriaBuilder criteriaBuilder=session.getCriteriaBuilder();
		CriteriaQuery<Student> query=criteriaBuilder.createQuery(Student.class);
		Root<Student> from=query.from(Student.class);
		query.select(from);
		
		//using Criteria
		//Session session=sessionFactory.openSession();
		Criteria criteria=session.createCriteria(Student.class);
		return criteria.list();
	
		
		
	
	}

	@Override
	public StudentCredentials save(StudentCredentials studentCredentials) {
		// TODO Auto-generated method stub
		template.save(studentCredentials);
		return studentCredentials;
	}

}
