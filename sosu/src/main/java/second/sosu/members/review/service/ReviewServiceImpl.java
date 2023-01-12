package second.sosu.members.review.service;

import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Service;

import second.sosu.members.review.dao.ReviewDAO;




@Service("reviewService")
public class ReviewServiceImpl implements ReviewService{
	
	Logger log = Logger.getLogger(this.getClass());
	
	@Resource(name = "reviewDAO")
	private ReviewDAO reviewDAO;

	//리뷰 페이징 리스트
	@Override 
	public Map<String, Object>selectReview(Map<String, Object> map, HttpSession session) throws Exception {
		
		return reviewDAO.selectReview(map);
	  }

	@Override
	public void insertReview(Map<String, Object> map, HttpSession session) throws Exception {
		
		reviewDAO.insertReview(map);
	}

	@Override
	public void updateReview(Map<String, Object> map, HttpSession session) throws Exception {
		
		reviewDAO.updateReview(map);
	}

	@Override
	public void deleteReview(Map<String, Object> map, HttpSession session) throws Exception {
		
		reviewDAO.deleteReview(map);
	}

}
