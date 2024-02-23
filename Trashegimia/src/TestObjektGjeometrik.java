
public class TestObjektGjeometrik {

	public static void main(String[] args) {
		//sorry nuk mund te krijojme nje objekt konkret meqe klasa  eshte abstarkte nga superklasa
		ObjektGjeometrik o = new Trekendesh("kuqe", true,3,4,5);
		o.setNgjyra("jeshile");
		System.out.println(o.toString());

	}

}
