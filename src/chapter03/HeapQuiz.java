package chapter03;

public class HeapQuiz {
	int id = 0;

	public static void main(String[] args) {
		int x = 0;
		HeapQuiz[] hq = new HeapQuiz[5];
		while (x < 3) {
			hq[x] = new HeapQuiz();
			hq[x].id = x;
			x = x + 1;
		}
		hq[3] = hq[1];
		hq[4] = hq[1];
		hq[3] = null;
		hq[4] = hq[0];
		hq[0] = hq[3];
		hq[3] = hq[2];
		hq[2] = hq[0];
		// do stuff
	}
}

/*When �// do stuff� is reached, some objects and some reference variables will have been created. Your task
is to determine which of the reference variables refer to which objects. Not all the reference variables will 
be used, and some objects might be referred to more than once.*/

//Reference Variables: hq[0], hq[1], hq[2], hq[3], hq[4]
//HeapQuiz Objects: id = 0, id = 1, id = 2
//hq[1] -> id = 0, hq[3] -> id = 2, hq[4] -> id = 0