package lambda;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * 람다식 
 */
public class Lambda3 {
	public static void main(String[] args) {
		
		List<ReviewVO> review = new ArrayList<>();
		review.add(new ReviewVO("리뷰3","순신"));
		review.add(new ReviewVO("리뷰1","남순"));
		review.add(new ReviewVO("리뷰2","기자"));
		
		review.sort( (ReviewVO o1, ReviewVO o2) -> o1.getContent().compareTo(o2.getContent()) );
		
		System.out.println(review);
	}
}


