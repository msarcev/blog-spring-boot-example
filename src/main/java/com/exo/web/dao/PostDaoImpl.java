package com.exo.web.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.exo.web.model.Post;

@Repository("postDao")
public class PostDaoImpl extends AbstractDao<Integer, Post> implements PostDao {

	@Autowired
	private SessionFactory sessionFactory;	
	
	protected Session getSession(){
		Session sess = sessionFactory.getCurrentSession();
		return sess ;
	}
	
	@Override
	public Post findById(int id) {
		return getByKey(id);
	}

	@Override
	public Post findByTitle(String title) {
		Criteria crit = createEntityCriteria();
        crit.add(Restrictions.eq("title", title));
        return (Post) crit.uniqueResult();
	}

	@Override
	public void submitPost(Post post) { 
		getSession().save(post);
	}

	@Override
	public List<Post> loadPage(int pageNumber) {
		@SuppressWarnings("rawtypes")
		List postsRaw = getSession().createCriteria(Post.class)
				.addOrder(Order.desc("id"))
				.add( Restrictions.and(
				Restrictions.ne("title", ""),
				Restrictions.ne("body", "")
				) )
				.setMaxResults(50)
				.list();
		
		@SuppressWarnings("unchecked")
		List<Post> posts = postsRaw;
		return posts;
	}

}
