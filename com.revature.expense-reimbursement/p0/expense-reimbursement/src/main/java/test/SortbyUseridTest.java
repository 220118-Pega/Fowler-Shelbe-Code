package test;

import org.junit.Assert;
import org.junit.Test;


	public class SortbyUseridTest<SortbyUid> {
		userInfo testAUser = new userInfo(20, "A", false, 3);
		userInfo testBUser = new userInfo(30, "B", false, 3);
		int A;
		
		@SuppressWarnings("hiding")
		@Test
		<SortbyUid> void testCompare() {
			try {
			@SuppressWarnings("unchecked")
			SortbyUid testSort = (SortbyUid) SortbyUid();
			A = ((userInfo) testSort).compare(testAUser, testBUser);
			Assert.assertEquals(-10, A);
			}catch (Exception e) {
				Assert.fail();
			}
		}

		private SortbyUid SortbyUid() {
			// TODO Auto-generated method stub
			return null;
		}

	}



