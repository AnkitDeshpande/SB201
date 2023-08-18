package com.masai;

import java.util.List;
import java.util.Scanner;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;
import jakarta.persistence.Query;

public class App {
	static EntityManagerFactory emf;

	static {
		emf = Persistence.createEntityManagerFactory("masai");
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// add(sc);
		// display();
		display2();
		sc.close();
	}

	private static void display2() {
		EntityManager em = null;
		EntityTransaction et = null;

		try {
			em = emf.createEntityManager();
			et = em.getTransaction();

			et.begin();
			Query query = em.createQuery("SELECT c FROM College c JOIN c.students s WHERE s.studentRoll = :Roll");
			query.setParameter("Roll", 1);
			College st = (College) query.getSingleResult();
			System.out.println(st);
			et.commit();

		} catch (Exception e) {
			et.rollback();
			System.out.println(e.getMessage());
		} finally {

		}
	}

	private static void add(Scanner sc) {

		EntityManager em = null;
		EntityTransaction et = null;

		try {
			em = emf.createEntityManager();
			et = em.getTransaction();

			College c1 = new College("MIT", "Sambhajinagar");
			College c2 = new College("CSMC", "Sambhajinagar");

			Student s1 = new Student("Ankit", "7878787454", "a@mail.com", c1);
			Student s2 = new Student("Sanket", "78782533554", "s@mail.com", c1);
			Student s3 = new Student("Vaishnav", "7598787454", "v@mail.com", c1);
			Student s4 = new Student("Kiran", "9875487454", "k@mail.com", c1);
			Student s5 = new Student("Balu", "9574187454", "b@mail.com", c2);
			Student s6 = new Student("Ravi", "8795587454", "r@mail.com", c2);
			Student s7 = new Student("Mayur", "8654787454", "m@mail.com", c2);
			Student s8 = new Student("Mrityunjay", "7777787454", "mr@mail.com", c2);

			c1.getStudents().add(s1);
			c1.getStudents().add(s2);
			c1.getStudents().add(s3);
			c1.getStudents().add(s4);
			c2.getStudents().add(s5);
			c2.getStudents().add(s6);
			c2.getStudents().add(s7);
			c2.getStudents().add(s8);

			et.begin();
			em.persist(c1);
			em.persist(c2);
			et.commit();

		} catch (Exception e) {
			et.rollback();
			System.out.println(e.getMessage());
		} finally {

		}

	}

	private static void display() {
		EntityManager em = null;
		EntityTransaction et = null;

		try {
			em = emf.createEntityManager();
			et = em.getTransaction();

			et.begin();
			Query query = em.createQuery("SELECT s FROM Student s WHERE s.college.collegeId = :id");
			query.setParameter("id", 1);
			List<Student> list = query.getResultList();
			list.forEach(t -> System.out.println(t));
			et.commit();

		} catch (Exception e) {
			et.rollback();
			System.out.println(e.getMessage());
		} finally {

		}

	}
}
