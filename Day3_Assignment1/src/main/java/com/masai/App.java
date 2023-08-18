package com.masai;

import java.util.List;

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

	public static void main(String[] args) throws SellerException, StoreException {
		registerStore();
		registerBuyer((long) 1);
		registerSeller();
		assignSellerToStore((long) 1, (long) 1);
		listOfBuyers("Dmart");
	}

	private static void listOfBuyers(String store_name) throws StoreException {
		EntityManager em = null;

		try {
			em = emf.createEntityManager();
			Query query = em.createQuery("FROM Store s where store_name = :name");
			query.setParameter("name", store_name);
			List<Store> list = query.getResultList();
			list.forEach(System.out::println);

		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			em.close();
		}
	}

	private static void assignSellerToStore(long seller_id, long store_id) throws SellerException, StoreException {
		EntityManager em = null;
		EntityTransaction et = null;

		try {
			em = emf.createEntityManager();
			et = em.getTransaction();

			et.begin();
			Seller seller = em.find(Seller.class, seller_id);
			Store store = em.find(Store.class, store_id);
			if (seller == null) {
				throw new SellerException("Invalid Seller id.");
			} else if (store == null) {
				throw new StoreException("Invalid Store id.");
			} else {
				store.setSeller(seller);
				em.merge(store);
				et.commit();
			}

		} catch (Exception e) {
			et.rollback();
			System.out.println(e.getMessage());
		} finally {
			em.close();
		}

	}

	private static void registerSeller() {
		EntityManager em = null;
		EntityTransaction et = null;

		try {
			em = emf.createEntityManager();
			et = em.getTransaction();

			et.begin();
			Seller seller = new Seller("Ankit", 8, "a@mail.com");
			em.persist(seller);
			et.commit();

		} catch (Exception e) {
			et.rollback();
			System.out.println(e.getMessage());
		} finally {
			em.close();
		}

	}

	private static void registerBuyer(Long store_id) {
		EntityManager em = null;
		EntityTransaction et = null;

		try {
			em = emf.createEntityManager();
			et = em.getTransaction();

			et.begin();
			Store store = em.find(Store.class, store_id);
			if (store == null) {
				throw new StoreException("Invalid Store Id.");
			} else {
				store.getBuyers().add(new Buyer("Sanket", "s@mail.com", "6646546456"));
				em.merge(store);
				et.commit();
				System.out.println("Buyer registered successfully.");
			}

		} catch (Exception e) {
			et.rollback();
			// e.printStackTrace();
			System.out.println(e.getMessage());
		} finally {
			em.close();
		}
	}

	private static void registerStore() {
		EntityManager em = null;
		EntityTransaction et = null;

		try {
			em = emf.createEntityManager();
			et = em.getTransaction();

			et.begin();
			Store st = new Store("Dmart", "Sambhajinagar");
			em.persist(st);
			et.commit();

		} catch (Exception e) {
			et.rollback();
			System.out.println(e.getMessage());
		} finally {
			em.close();
		}

	}
}
