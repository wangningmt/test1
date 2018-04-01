package a;
import static org.junit.Assert.*;
import org.junit.Test;
public class Maxshuzu2Test{
	@Test
	public void a() {
		int[] a={-1,-2,-3,-4,-5};
		assertEquals(0,Maxshuzu2.sonarray(a, a.length));
	}
	@Test
	public void b() {
		int[] a= {-3,-2,-1,10};
		assertEquals(10,Maxshuzu2.sonarray(a,a.length));
	}
	@Test
	public void c() {
		int[] a= {3,2,-2,6,-3};
		assertEquals(9,Maxshuzu2.sonarray(a, a.length));
	}
	@Test
	public void d() {
		int[] a= {1,2,3,4};
		assertEquals(10,Maxshuzu2.sonarray(a, a.length));
	}
}

